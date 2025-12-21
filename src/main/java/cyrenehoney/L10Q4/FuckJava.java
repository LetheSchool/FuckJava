package cyrenehoney.L10Q4;

public class FuckJava {
    public static void main(String[] args) {
        var app1 = new Appointment(25, 12, 2023, 9, 11);
        app1.save();

        var app2 = new Appointment(25, 12, 2023, 10, 12);
        app2.save(); // fail

        var app3 = new Appointment(26, 12, 2023, 9, 11);
        app3.save(); // succeed
    }
}
