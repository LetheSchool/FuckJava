package cyrenehoney.L10Q3;

import java.io.FileWriter;
import java.io.IOException;

public class FuckJava {
    public static void main(String[] args) throws IOException {
        var fw = new FileWriter("shuffle_in.txt");
        fw.write("abcde");
        fw.close();

        var cipher = new ShuffleCipher("shuffle_in.txt", "shuffle_out.txt", 1);
        cipher.process(true);
        System.out.println("Shuffled.");

        var decoder = new ShuffleCipher("shuffle_out.txt", "shuffle_back.txt", 1);
        decoder.process(false);
        System.out.println("Unshuffled.");
    }
}
