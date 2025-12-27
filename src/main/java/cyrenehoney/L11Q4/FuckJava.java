package cyrenehoney.L11Q4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FuckJava {
    public static void main(String[] args) {
        var lineCount = 0;
        var charCount = 0;
        var wordCount = 0;

        try {
            var in = new Scanner(new FileInputStream("./src/main/java/cyrenehoney/L11Q4/input.txt"));
            while (in.hasNextLine()) {
                var line = in.nextLine();
                lineCount++;
                charCount += line.length();
                wordCount += line.split(" ").length;
            }
            in.close();

            System.out.println("Characters: " + charCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Lines: " + lineCount);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
