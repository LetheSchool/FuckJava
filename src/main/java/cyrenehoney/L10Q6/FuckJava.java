package cyrenehoney.L10Q6;

import java.util.Arrays;
import java.util.List;

public class FuckJava {
    public static <T extends Comparable<T>> T findMaximum(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty");
        }
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 5, 3, 9, 2);
        List<String> strList = Arrays.asList("Apple", "Orange", "Banana");

        System.out.println("Max Integer: " + findMaximum(intList));
        System.out.println("Max String: " + findMaximum(strList));
    }
}
