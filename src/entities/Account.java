package entities;

public class Account {

    private int accountNumber;
    private String accountHolder;
    private double balance;
    public static final double tax = 5.00;

    //Constructors;


    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public Account(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        depositMoney(initialDeposit);
    }


    //getters and setters


    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    //methods

    public double depositMoney(double deposit){
        return balance += deposit;
    }

    public double withdrawMoney (double withdraw){
        return balance -= withdraw + tax;
    }

    public String toString(){
        return "Account " +
                accountNumber +
                ", Holder: " +
                accountHolder +
                ", Balance: $ " +
                String.format("%.2f%n%n", balance);
    }
}
