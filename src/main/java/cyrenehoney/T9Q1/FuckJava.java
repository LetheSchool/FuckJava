package cyrenehoney.T9Q1;

public class FuckJava {
    public static void main(String[] args) {
        var t1 = new Student();
        var t2 = new Teacher();
        System.out.println(compare(t1, t2)); // false
        System.out.println(compare(t1, t1)); // true
        System.out.println(isClass(t1)); // true
    }

    public static boolean compare(Student s, Teacher t) {
        return s.getClass().equals(t.getClass());
    }

    public static boolean isClass(Student s) {
        return s instanceof Person;
    }
}
