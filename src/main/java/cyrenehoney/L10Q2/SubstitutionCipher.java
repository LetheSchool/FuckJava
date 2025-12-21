package cyrenehoney.L10Q2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SubstitutionCipher implements MessageEncoder {
    private String inputFile, outputFile;
    private int shift;

    public SubstitutionCipher(String inputFile, String outputFile, int shift) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
        this.shift = shift;
    }

    public String encode(String text) {
        char[] chars = text.toCharArray();
        for (var i = 0; i < chars.length; i++) chars[i] += shift;
        return new String(chars);
    }

    public String decode(String text) {
        char[] chars = text.toCharArray();
        for (var i = 0; i < chars.length; i++) chars[i] -= shift;
        return new String(chars);
    }

    public void process(boolean isEncoding) {
        try {
            var content = new String(Files.readAllBytes(Paths.get(inputFile)));
            var result = isEncoding ? encode(content) : decode(content);
            Files.write(Paths.get(outputFile), result.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}