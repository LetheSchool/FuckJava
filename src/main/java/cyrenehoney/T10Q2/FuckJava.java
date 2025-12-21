package cyrenehoney.T10Q2;

public class FuckJava {
    public static void main(String[] args) {
        Interest saver = new SavingAccount(1000);
        Interest fixed = new FixedAccount(1000);

        System.out.println(saver.computeInterest());
        System.out.println(fixed.computeInterest());
    }
}
