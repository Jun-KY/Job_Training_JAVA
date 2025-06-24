package Extra_Work.ATM_Project;

import java.util.Random;

public class BankAccount {
    private Person owner;
    private String accountNumber;
    private double balance;

    public BankAccount(Person owner){
        this.owner = owner;
        this.accountNumber = generateAccountNumber();
        this.balance = 0.0;
    }

    private String generateAccountNumber(){
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 11; i ++){
            sb.append(rand.nextInt(10));
        }
        return sb.toString();
    }

    public boolean authenticate (String id, String password){
        return owner.getId().equals(id) && owner.getPassword().equals(password);
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if (amount > 0 ) balance += Math.round(amount * 100) / 100.0;
    }

    public void withdraw (double amount){
        if (amount > 0 && amount <= balance) balance -= Math.round(amount * 100) / 100.0;
//        else {
//            System.out.println("Insufficient funds. Check your balance");}
    }

    public Person getOwner(){
        return owner;
    }
}
