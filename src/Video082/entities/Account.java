package Video082.entities;

public class Account {
    private int accountNumber;
    private String name;
    private double balance;

    public Account(int accountNumber, String name, double initalDepositValue) {
        this.accountNumber = accountNumber;
        this.name = name;
        depositValue(initalDepositValue);
    }

    public Account(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void depositValue(double newDeposit) {
        balance += newDeposit;
    }

    public void withdrawValue(double withdrawValue) {
        balance -= withdrawValue + 5.00;
    }

    public String toString() {
        return "Account: "
                + accountNumber
                + ", Holder: "
                + name
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }

}
