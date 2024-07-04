/**
 * Задание №4
 * Напишите метод, который составит строку, состоящую из 100
 * повторений слова TEST и метод, который запишет эту строку в
 * простой текстовый файл, обработайте исключения.
 * <p>
 * private static final
 * Logger logger = Logger.getLogger(Task7.class.getName())
 */


package GB.Seminar_2.CW1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class Task7 {
    public static void main(String[] args) throws IOException {
        createTestFile(getRepeatedString());
    }

    private static void createTestFile(String test_string) throws IOException {
        File test_file = new File("src/main/java/GB/Seminar_2/CW1/file.txt");
        FileWriter writer = new FileWriter(test_file);
        writer.write(test_string);
        writer.close();
    }

    private static String getRepeatedString() {
        String result = "TEST".repeat(100);
        return result;
    }


}

// Решение с семинара
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.logging.FileHandler;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import java.util.logging.SimpleFormatter;
//
//public class Task7 {
//
//    private static final Logger logger = Logger.getLogger(Task7.class.getName());
//
//    public static void main(String[] args) {
//        String str = "TEST\n".repeat(100);
//        writeFile(str, "index.txt");
//    }
//
//    public static void writeFile(String args, String fileName) {
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
//            bw.write(args);
//            System.out.println("File written to " + fileName);
//            throw new IOException();
//        } catch (IOException e) {
//            FileHandler fh = null;
//            try {
//                fh = new FileHandler("error.log", true);
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//            logger.addHandler(fh);
//            fh.setFormatter(new SimpleFormatter());
//            logger.log(Level.WARNING, "Ошибка записи");
//            System.out.println("Error writing to file: " + fileName);
//        }
//    }
//}