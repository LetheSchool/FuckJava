package cyrenehoney.L11Q1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class FuckJava {
    public static void main(String[] args) {
        var codes = new HashMap<String, String>();
        codes.put("WXES1116", "Programming I");
        codes.put("WXES1115", "Data Structure");
        codes.put("WXES1110", "Operating System");
        codes.put("WXES1112", "Computing Mathematics I");

        try (var dos = new DataOutputStream(new FileOutputStream("coursename.dat"))) {
            for (var pair : codes.entrySet()) {
                dos.writeUTF(pair.getKey());
                dos.writeUTF(pair.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        var scanner = new Scanner(System.in);
        System.out.print("Enter a course code: ");
        var searchCode = scanner.next();

        var found = false;
        try (var dis = new DataInputStream(new FileInputStream("coursename.dat"))) {
            while (dis.available() > 0) {
                var code = dis.readUTF();
                var name = dis.readUTF();
                if (code.equalsIgnoreCase(searchCode)) {
                    System.out.println("Course Name: " + name);
                    found = true;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!found) {
            System.out.println("Course code not found.");
        }

        scanner.close();
    }
}