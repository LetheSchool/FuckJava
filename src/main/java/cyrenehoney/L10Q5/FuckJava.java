package cyrenehoney.L10Q5;

public class FuckJava {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Generics");
        Box<Integer> intBox = new Box<>(100);

        System.out.println("String Box: " + stringBox.getContent());
        System.out.println("Integer Box: " + intBox.getContent());

        // stringBox.setContent(123); // Compile error
    }
}
