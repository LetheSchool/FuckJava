package cyrenehoney.L10Q3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ShuffleCipher implements MessageEncoder {
    private String inputFile, outputFile;
    private int N;

    public ShuffleCipher(String inputFile, String outputFile, int N) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
        this.N = N;
    }

    public String encode(String text) {
        for (int k = 0; k < N; k++) {
            int mid = text.length() / 2;
            StringBuilder sb = new StringBuilder();
            String left = text.substring(0, mid);
            String right = text.substring(mid);
            for (int i = 0; i < right.length(); i++) {
                if (i < left.length()) sb.append(left.charAt(i));
                sb.append(right.charAt(i));
            }
            text = sb.toString();
        }
        return text;
    }

    public String decode(String text) {
        for (int k = 0; k < N; k++) {
            int mid = text.length() / 2;
            StringBuilder left = new StringBuilder(), right = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                if (i % 2 == 0 && left.length() < mid) left.append(text.charAt(i));
                else right.append(text.charAt(i));
            }
            text = left.toString() + right.toString();
        }
        return text;
    }

    public void process(boolean isEncoding) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(inputFile)));
            String result = isEncoding ? encode(content) : decode(content);
            Files.write(Paths.get(outputFile), result.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}