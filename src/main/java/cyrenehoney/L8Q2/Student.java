package cyrenehoney.L8Q2;

import lombok.Getter;
import lombok.Setter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Getter @Setter
public class Student extends PersonProfile {
    private List<String> courseCodes = new ArrayList<>();
    private List<String> courseNames = new ArrayList<>();
    private List<Integer> semesters = new ArrayList<>();
    private List<String> sessions = new ArrayList<>();
    private List<Double> marks = new ArrayList<>();
    private String fileName;

    public Student(String name, String gender, String dateOfBirth, String fileName) {
        super(name, gender, dateOfBirth);
        this.fileName = fileName;
        loadCourseData();
    }

    private void loadCourseData() {
        try {
            var scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine()) {
                var code = scanner.nextLine();
                var name = scanner.nextLine();
                var semester = Integer.parseInt(scanner.nextLine());
                var session = scanner.nextLine();
                var mark = Double.parseDouble(scanner.nextLine());

                courseCodes.add(code);
                courseNames.add(name);
                semesters.add(semester);
                sessions.add(session);
                marks.add(mark);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (Exception e) {
            System.out.println("Error reading file.");
        }
    }

    public String getGrade(double mark) {
        if (mark >= 85) return "A";
        else if (mark >= 75) return "A-";
        else if (mark >= 70) return "B+";
        else if (mark >= 65) return "B";
        else if (mark >= 60) return "B-";
        else if (mark >= 55) return "C+";
        else if (mark >= 50) return "C";
        else if (mark >= 45) return "D";
        else if (mark >= 35) return "E";
        else return "F";
    }

    @Override
    public void display() {
        super.display();
        System.out.println("\nCourse Details:");

        for (int i = 0; i < courseCodes.size(); i++) {
            System.out.println("Course: " + courseCodes.get(i) + " (" + courseNames.get(i) + ")");
            System.out.println("Semester: " + semesters.get(i) + " | Session: " + sessions.get(i));
            System.out.printf("Mark: %.2f | Grade: %s%n", marks.get(i), getGrade(marks.get(i)));
        }
    }
}