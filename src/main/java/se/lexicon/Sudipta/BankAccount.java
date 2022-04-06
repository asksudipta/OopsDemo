package se.lexicon.Sudipta;

public class BankAccount {
    private double accountNumber;
    private double balance;
    private Customer customer;


    public BankAccount(double accountNumber, Customer customer) {
        this. accountNumber = accountNumber;
        this.customer = customer;
    }

    public void deposit(double amount) {
        if (amount < 0) {

        }
        balance = balance + amount;
    }

    public double withdraw(double amount) {
        if (amount < 0) {

        }
        balance=balance-amount;
        return balance;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
