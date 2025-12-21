package cyrenehoney.T10Q2;

public class FixedAccount implements Interest {
    private double balance;

    public FixedAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public double computeInterest() {
        return balance * (0.03 / 12);
    }
}