package Extra_Work.ATM_Project;

import java.util.*;
import java.util.Scanner;

public class ATM {
    private static Scanner sc = new Scanner(System.in);
    private static List<BankAccount> accounts = new ArrayList<>();
    private static BankAccount currentAccount = null;

    public static void main(String[] args){
        while(true){
            System.out.println("\n -------- ATM --------");
            System.out.println("1. Create Account");
            System.out.println("2. Log on");
            System.out.println("3. Exit");
            System.out.print("Number: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1 -> createAccount();
                case 2 -> logonSession();
                case 3 -> {
                    System.out.println("Thank you.");
                    return;
                }
                default -> System.out.println("wrong options!");
            }
        }
    }
    private static void createAccount(){
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("ID: ");
        String id = sc.nextLine().toLowerCase();
        System.out.print("PW: ");
        String pw = sc.nextLine();

        Person person = new User (name, id, pw);
        BankAccount account = new BankAccount(person);
        accounts.add(account);

        System.out.println("Bank account created. Your Bank account: " + account.getAccountNumber());

    }

    private static void logonSession(){
        System.out.print("ID: ");
        String id = sc.nextLine().toLowerCase();
        System.out.print("PW: ");
        String pw = sc.nextLine();

        BankAccount logonAccount = null;

        for (BankAccount acc : accounts){
            if (acc.authenticate(id, pw)){
                logonAccount = acc;
                break;
            }
        }

        if (logonAccount == null){
            System.out.println("Log on failed. Check your ID or Password");
            return;
        }

        System.out.println("Welcome " + logonAccount.getOwner().getName() + "!");

        while (true){
            System.out.println("\n------Log on Session------");
            System.out.println("1. Check Balance");
            System.out.println("2. deposit");
            System.out.println("3. withdraw");
            System.out.println("4. Log out");
            System.out.println("Number: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1 -> System.out.println("Balance: $" + logonAccount.getBalance());
                case 2 -> {
                    System.out.print("Deposit amount: ");
                    double amount = Math.round(sc.nextDouble() * 100) / 100.0;
                    sc.nextLine();
                    logonAccount.deposit(amount);
                    System.out.println("Deposit has been completed\nBalance: " + Math.round(logonAccount.getBalance() * 100) /100.0);
                }
                case 3 -> {
                    System.out.print("Withdrawal amount: " );
                    double amount = Math.round(sc.nextDouble() * 100 ) / 100.0;
                    sc.nextLine();
                    logonAccount.withdraw(amount);
                    if(logonAccount.getBalance() > amount){
                        System.out.println("Withdrawal has been completed\nBalance: " + Math.round(logonAccount.getBalance() * 100) /100.0);
                    }
                    else {
                        System.out.println("Insufficient funds. Check your balance");
                    }
                }
                case 4 -> {
                    System.out.println("Log out completed");
                    return;
                }
                default -> System.out.println("Invalid option");

            }
        }
    }

}
