package cyrenehoney.T10Q4;

public class FuckJava {
    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        String[] stringArray = {"Hello", "World", "Java"};
        Integer[] integerArray = {1, 2, 3, 4, 5};
        Point[] pointArray = {new Point(1, 2), new Point(3, 4)};

        printArray(stringArray);
        printArray(integerArray);
        printArray(pointArray);
    }
}