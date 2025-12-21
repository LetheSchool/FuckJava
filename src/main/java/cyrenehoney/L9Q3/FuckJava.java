package cyrenehoney.L9Q3;

public class FuckJava {
    public static void main(String[] args) {
        var savings = new SavingsAccount("S1001", 1000.0, 0.05);
        savings.displayBalance();
        savings.deposit(500);
        savings.applyInterest();
        savings.withdraw(200);
        savings.displayBalance();

        var checking = new CheckingAccount("C2001", 500.0, 200.0);
        checking.displayBalance();
        checking.withdraw(600); 
        checking.displayBalance();
        checking.withdraw(200); 
    }
}
