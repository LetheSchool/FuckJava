package cyrenehoney.L11Q3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FuckJava {
    public static void main(String[] args) {
        try {
            var in = new Scanner(new FileInputStream("./src/main/java/cyrenehoney/L11Q3/input.txt"));
            var out = new PrintWriter(new FileOutputStream("reverse.txt"));

            while (in.hasNextLine()) {
                out.println(new StringBuilder(in.nextLine()).reverse());
            }

            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
