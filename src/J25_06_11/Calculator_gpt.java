package J25_06_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator_gpt extends JFrame implements ActionListener {
    // Components
    JTextField input;
    double num1, num2, result;
    char operator;

    Calculator_gpt() {
        setTitle("Simple Calculator");
        setSize(400, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        input = new JTextField();
        input.setEditable(false);
        input.setFont(new Font("Arial", Font.BOLD, 30));
        add(input, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 10, 10));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 25));
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.charAt(0) >= '0' && cmd.charAt(0) <= '9' || cmd.equals(".")) {
            input.setText(input.getText() + cmd);
        } else if (cmd.equals("C")) {
            input.setText("");
            num1 = num2 = result = 0;
            operator = '\0';
        } else if (cmd.equals("=")) {
            num2 = Double.parseDouble(input.getText());
            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/':
                    if (num2 != 0) result = num1 / num2;
                    else {
                        input.setText("Error");
                        return;
                    }
                    break;
            }
            input.setText(String.valueOf(result));
        } else {
            if (!input.getText().isEmpty()) {
                num1 = Double.parseDouble(input.getText());
                operator = cmd.charAt(0);
                input.setText("");
            }
        }
    }

    public static void main(String[] args) {
        new Calculator_gpt();
    }
}
