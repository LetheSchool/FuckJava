package cyrenehoney.L8Q3;

import lombok.Getter;
import lombok.Setter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Getter @Setter
public class Lecturer extends PersonProfile {
    private List<String> courseCodes = new ArrayList<>();
    private List<String> courseNames = new ArrayList<>();
    private List<Integer> semesters = new ArrayList<>();
    private List<String> sessions = new ArrayList<>();
    private List<Double> originalCreditHours = new ArrayList<>();
    private List<Integer> studentCounts = new ArrayList<>();
    private String fileName;

    public Lecturer(String name, String gender, String dateOfBirth, String fileName) {
        super(name, gender, dateOfBirth);
        this.fileName = fileName;
        loadLecturerData();
    }

    private void loadLecturerData() {
        try {
            var scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine()) {
                var code = scanner.nextLine();
                var name = scanner.nextLine();
                var semester = Integer.parseInt(scanner.nextLine());
                var session = scanner.nextLine();
                var credit = Double.parseDouble(scanner.nextLine());
                var students = Integer.parseInt(scanner.nextLine());

                courseCodes.add(code);
                courseNames.add(name);
                semesters.add(semester);
                sessions.add(session);
                originalCreditHours.add(credit);
                studentCounts.add(students);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (Exception e) {
            System.out.println("Error reading file.");
        }
    }

    public double computeNewCreditHour(int students, double originalCredit) {
        if (students >= 150) return originalCredit * 3;
        else if (students >= 100) return originalCredit * 2;
        else if (students >= 50) return originalCredit * 1.5;
        else return originalCredit * 1;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("\nTeaching Details:");

        for (int i = 0; i < courseCodes.size(); i++) {
            var originalCredit = originalCreditHours.get(i);
            var count = studentCounts.get(i);
            var newCredit = computeNewCreditHour(count, originalCredit);

            System.out.println("Course: " + courseCodes.get(i) + " (" + courseNames.get(i) + ")");
            System.out.println("Semester: " + semesters.get(i) + " | Session: " + sessions.get(i));
            System.out.println("No. of Students: " + count);
            System.out.printf("Original Credit Hour: %.1f%n", originalCredit);
            System.out.printf("Updated Credit Hour: %.1f%n", newCredit);
        }
    }
}