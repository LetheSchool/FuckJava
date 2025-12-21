package cyrenehoney.L8Q2;

public class FuckJava {
    public static void main(String[] args) {
        // 跑的时候找一下根目录，把这玩意塞进去
        var student = new Student("Nig", "Male", "01/01/2000", "./src/main/java/cyrenehoney/L8Q2/course.txt");
        student.display();
    }
}
