import java.io.*;

public class Encapsulation_demo {
    public static void main(String[] args)
    {
        BankAccount bank = new BankAccount();
        bank.deposit(1000.0);
        System.out.println(bank.displayBalance());
        System.out.println(bank.balance2);
    }
}

class BankAccount{
    private double balance = 0.0; // hidden from outside.
    double balance2 = 100.0;

    void deposit(double amount){
        balance+=amount;
    }

    // getter
    double displayBalance(){
        return balance;
    }
}