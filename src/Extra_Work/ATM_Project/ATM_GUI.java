package Extra_Work.ATM_Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

public class ATM_GUI {
    private JFrame frame;
    private List<BankAccount> accounts = new ArrayList<>();
    private BankAccount currentAccount = null;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ATM_GUI().createMainMenu());
    }

    private void createMainMenu() {
        frame = new JFrame("ATM 시스템");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(3, 1));

        JButton createBtn = new JButton("계좌 생성");
        JButton loginBtn = new JButton("로그인");
        JButton exitBtn = new JButton("종료");

        createBtn.addActionListener(e -> showCreateAccount());
        loginBtn.addActionListener(e -> showLoginScreen());
        exitBtn.addActionListener(e -> System.exit(0));

        frame.add(createBtn);
        frame.add(loginBtn);
        frame.add(exitBtn);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void showCreateAccount() {
        JTextField nameField = new JTextField();
        JTextField idField = new JTextField();
        JPasswordField pwField = new JPasswordField();

        Object[] inputs = {
                "이름:", nameField,
                "ID:", idField,
                "비밀번호:", pwField
        };

        int result = JOptionPane.showConfirmDialog(frame, inputs, "계좌 생성", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            Person user = new User(nameField.getText(), idField.getText(), new String(pwField.getPassword()));
            BankAccount account = new BankAccount(user);
            accounts.add(account);
            JOptionPane.showMessageDialog(frame, "계좌 생성 완료! 계좌번호: " + account.getAccountNumber());
        }
    }

    private void showLoginScreen() {
        JTextField idField = new JTextField();
        JPasswordField pwField = new JPasswordField();

        Object[] inputs = {
                "ID:", idField,
                "비밀번호:", pwField
        };

        int result = JOptionPane.showConfirmDialog(frame, inputs, "로그인", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            for (BankAccount acc : accounts) {
                if (acc.authenticate(idField.getText(), new String(pwField.getPassword()))) {
                    currentAccount = acc;
                    JOptionPane.showMessageDialog(frame, acc.getOwner().getName() + "님 환영합니다!");
                    showLoggedInMenu();
                    return;
                }
            }
            JOptionPane.showMessageDialog(frame, "로그인 실패: ID 또는 비밀번호 오류");
        }
    }

    private void showLoggedInMenu() {
        JFrame sessionFrame = new JFrame("ATM - " + currentAccount.getOwner().getName());
        sessionFrame.setSize(400, 250);
        sessionFrame.setLayout(new GridLayout(4, 1));

        JButton balanceBtn = new JButton("잔액 조회");
        JButton depositBtn = new JButton("입금");
        JButton withdrawBtn = new JButton("출금");
        JButton logoutBtn = new JButton("로그아웃");

        balanceBtn.addActionListener(e ->
                JOptionPane.showMessageDialog(sessionFrame, "Bank account: " + currentAccount.getAccountNumber() + "\nBalance: $" + currentAccount.getBalance()));

        depositBtn.addActionListener(e -> {
            String amountStr = JOptionPane.showInputDialog(sessionFrame, "입금할 금액:");
            try {
                double amount = Double.parseDouble(amountStr);
                currentAccount.deposit(amount);
                JOptionPane.showMessageDialog(sessionFrame, "입금 완료!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(sessionFrame, "올바른 금액을 입력하세요.");
            }
        });

        withdrawBtn.addActionListener(e -> {
            String amountStr = JOptionPane.showInputDialog(sessionFrame, "출금할 금액:");
            try {
                double amount = Double.parseDouble(amountStr);
                currentAccount.withdraw(amount);
                JOptionPane.showMessageDialog(sessionFrame, "출금 완료!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(sessionFrame, "올바른 금액을 입력하세요.");
            }
        });

        logoutBtn.addActionListener(e -> {
            sessionFrame.dispose();
            currentAccount = null;
        });

        sessionFrame.add(balanceBtn);
        sessionFrame.add(depositBtn);
        sessionFrame.add(withdrawBtn);
        sessionFrame.add(logoutBtn);
        sessionFrame.setLocationRelativeTo(null);
        sessionFrame.setVisible(true);
    }
}
