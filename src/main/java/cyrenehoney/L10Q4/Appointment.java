package cyrenehoney.L10Q4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Appointment implements Searchable {
    private int day, month, year;
    private int startTime, endTime;
    private String filename = "appointments.txt";

    public Appointment(int day, int month, int year, int startTime, int endTime) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void save() {
        if (search(day * 10000 + month * 100 + year, startTime, endTime)) {
            System.out.println("Slot unavailable.");
            return;
        }
        try (var fw = new FileWriter(filename, true);
             var bw = new BufferedWriter(fw);
             var out = new PrintWriter(bw)) {
            out.println(day + " " + month + " " + year + " " + startTime + " " + endTime);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean search(int dateInt, int startH, int endH) {
        var f = new File(filename);
        if(!f.exists()) return false;

        try (var scanner = new Scanner(f)) {
            while (scanner.hasNextInt()) {
                var d = scanner.nextInt();
                var m = scanner.nextInt();
                var y = scanner.nextInt();
                var s = scanner.nextInt();
                var e = scanner.nextInt();

                var fileDate = d * 10000 + m * 100 + y;
                if (fileDate == dateInt) {
                    if (startH < e && endH > s) {
                        return true; 
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }
}