/**
 * Напишіть жартівливу програму «Дешифратор», яка в текстовому файлі могла б замінити всі прийменники словом «Java».
 */

import java.nio.file.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Decoder {
    public static void main(String[] args) {
        // шлях до файлу
        Path filePath = Paths.get("summer.txt.txt");

        // список прийменників які є в текстовому файлі
        List<String> prepositions = Arrays.asList("у", "без", "в", "під");

        try {
            String content = new String(Files.readAllBytes(filePath));
            for (String prep : prepositions) {
                Pattern pattern = Pattern.compile("\\b" + prep + "\\b", Pattern.UNICODE_CHARACTER_CLASS);
                Matcher matcher = pattern.matcher(content);
                content = matcher.replaceAll("Java");
            }
            Files.write(filePath, content.getBytes());
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}






























