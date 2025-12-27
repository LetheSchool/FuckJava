package cyrenehoney.L11Q2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

public class FuckJava {
    public static void main(String[] args) {
        try {
            // var u = new URL("http://www.fsktm.um.edu.my"); // ERROR: This page has been taken down, here will cause IOException !!!
            var u = new URL("https://github.com");
            var cnn = u.openConnection();
            var stream = cnn.getInputStream();
            var in = new Scanner(stream);

            var out = new PrintWriter(new FileOutputStream("index.htm"));
            while (in.hasNextLine()) {
                out.println(in.nextLine());
            }

            out.close();
            in.close();
        } catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }
    }
}
