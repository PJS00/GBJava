///**
// * Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
// * Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:
// * int[] arr - числовой массив
// * После каждого прохода по массиву ваш код должен делать запись в лог-файл 'log.txt' в формате год-месяц-день час:минуты {массив на данной итерации}. Для логирования использовать логгер logger класса BubbleSort.
// * Пример
// * arr = new int[]{9, 4, 8, 3, 1};
// * sort(arr)
// * // При чтении лог-файла получим:
// * 2023-05-19 07:53 [4, 8, 3, 1, 9]
// * 2023-05-19 07:53 [4, 3, 1, 8, 9]
// * 2023-05-19 07:53 [3, 1, 4, 8, 9]
// * 2023-05-19 07:53 [1, 3, 4, 8, 9]
// * 2023-05-19 07:53 [1, 3, 4, 8, 9]
// */
//
//package GB.Seminar_2.HW2;
//
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.Arrays;
//
//
////class Task2 {
////
////}
////
////private static final Logger logger = Logger.getLogger(BubbleSort.class.getName());
//
//class BubbleSort {
//    private static File log;
//    private static FileWriter fileWriter;
//
//    public static void sort(int[] mas) {
//        try {
//            log = new File("log.txt");
//            fileWriter = new FileWriter(log);
//            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//            boolean isSorted = false;
//            int buf;
//            while (!isSorted) {
//                isSorted = true;
//                for (int i = 0; i < mas.length - 1; i++) {
//                    if (mas[i] > mas[i + 1]) {
//                        isSorted = false;
//
//                        buf = mas[i];
//                        mas[i] = mas[i + 1];
//                        mas[i + 1] = buf;
//                    }
//                }
//                fileWriter.write(String.format("%s %s%n", LocalDateTime.now().format(dtf), Arrays.toString(mas)));
//            }
//            fileWriter.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//class Printer {
//    public static void main(String[] args) {
//        int[] arr = {};
//        // При отправке кода на Выполнение, вы можете варьировать эти параметры
//        if (args.length == 0) {
//            arr = new int[]{9, 4, 8, 3, 1};
//        } else {
//            arr = Arrays.stream(args[0].split(", "))
//                    .mapToInt(Integer::parseInt)
//                    .toArray();
//        }
//
//        BubbleSort ans = new BubbleSort();
//        ans.sort(arr);
//
////        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
////            String line;
////            while ((line = br.readLine()) != null) {
////                System.out.println(line);
////            }
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//    }
//}