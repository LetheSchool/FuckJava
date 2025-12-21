package cyrenehoney.T8Q1;

public class FuckJava {
    public static void main(String[] args) {
        var t1 = new Student();
        var t2 = new Teacher();
        System.out.println(compare(t1, t2)); // false
        System.out.println(compare(t1, t1)); // true
        System.out.println(isClass(t1)); // true
    }

    // JVM 加载类信息时，会为每个类创建一个唯一的 Class 对象
    // 此处，Student 作为 Teacher 子类，t 传入 Student 可为 true
    public static boolean compare(Student s, Teacher t) {
        return s.getClass().equals(t.getClass());
    }

    // 同 C# ，instanceof 宽容子类
    public static boolean isClass(Student s) {
        return s instanceof Person;
    }
}
