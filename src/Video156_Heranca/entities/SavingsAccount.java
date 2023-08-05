package Video156_Heranca.entities;

public class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double interestRate() {
        return interestRate;
    }

    public SavingsAccount setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
        return this;
    }

    public void updateBalance (){
        balance += balance * interestRate;
    }
}
