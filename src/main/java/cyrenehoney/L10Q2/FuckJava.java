package cyrenehoney.L10Q2;

import java.io.FileWriter;
import java.io.IOException;

public class FuckJava {
    public static void main(String[] args) throws IOException {
        var fw = new FileWriter("input.txt");
        fw.write("helloworld");
        fw.close();

        var cipher = new SubstitutionCipher("input.txt", "encoded.txt", 3);
        cipher.process(true);
        System.out.println("Encoded.");

        var decoder = new SubstitutionCipher("encoded.txt", "decoded.txt", 3);
        decoder.process(false);
        System.out.println("Decoded.");
    }
}
