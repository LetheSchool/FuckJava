package cyrenehoney.T10Q6;

public class FuckJava {
    public static <T extends Comparable<T>> T findFirstGreaterThan(T[] array, T threshold) {
        for (T element : array) {
            if (element.compareTo(threshold) > 0) {
                return element;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 5, 8, 10, 3};
        Integer intThreshold = 6;
        System.out.println(findFirstGreaterThan(intArray, intThreshold));

        String[] strArray = {"apple", "banana", "orange", "grape"};
        String strThreshold = "carrot";
        System.out.println(findFirstGreaterThan(strArray, strThreshold));
    }
}
