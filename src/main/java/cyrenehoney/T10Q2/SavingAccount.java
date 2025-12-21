package cyrenehoney.T10Q2;

public class SavingAccount implements Interest {
    private double balance;

    public SavingAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public double computeInterest() {
        return balance * (0.005 / 12);
    }
}