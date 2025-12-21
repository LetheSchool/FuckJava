package cyrenehoney.L8Q1;

public class FuckJava {
    public static void main(String[] args) {
        System.out.println("--- Rectangle ---");
        var rect = new Rectangle();
        rect.acceptInput();
        rect.compute();
        rect.display();
        System.out.println();

        System.out.println("--- Square ---");
        var sq = new Square();
        sq.acceptInput();
        sq.compute();
        sq.display();
        System.out.println();

        System.out.println("--- Circle ---");
        Circle circ = new Circle();
        circ.acceptInput();
        circ.compute();
        circ.display();
    }
}
