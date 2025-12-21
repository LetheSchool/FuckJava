package cyrenehoney.T10Q5;

public class FuckJava {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello Box");
        Box<Integer> intBox = new Box<>(123);
        Box<Double> doubleBox = new Box<>(45.67);

        System.out.println(stringBox.getValue());
        System.out.println(intBox.getValue());
        System.out.println(doubleBox.getValue());

        stringBox.setValue("New Value");
        System.out.println(stringBox.getValue());
    }
}
