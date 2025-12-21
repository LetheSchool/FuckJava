package cyrenehoney.L10Q1;

public class FuckJava {
    public static void main(String[] args) {
        var p1 = new PermanentEmployee("Alice", 'A');
        var p2 = new PermanentEmployee("Bob", 'C');
        var c1 = new ContractStaff("Charlie", 5000);
        var t1 = new TemporaryStaff("David", 40);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(c1);
        System.out.println(t1);
    }
}
