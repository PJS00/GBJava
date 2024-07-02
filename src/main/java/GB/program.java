// public class program { //снипет class
//     public static void Task1.java(String[] args) { //снипет sysout
//         System.out.println("bye world");        
//     }
// }

// типы данных
// - примитивные (boolean, int, short, long и т.д. float, double, char)
// - ссылочные (массивы, ооп)
// Создание переменной
// <тип><идентификатор>; - объявление переменной
// <идентификатор> = <значение>; - инициализация переменной
// = - оператор присваивания
// public class program { //снипет class
//     public static void Task1.java(String[] args) { //снипет sysout
//         String s = null; // двойные кавычки, обязательно присвоить значение
//         System.out.println(s);
//     }
// }
// Основы: типы данных
// public class program {
//     public static void Task1.java(String[] args) {
//         short age = 10;
//         int salary = 123456;
//         System.out.println(age); // 10
//         System.out.println(salary);  //123456
//         float e = 2.7f; // обязательно суффикс f для типа данных float
//         // double pi = 3.1415;
//         double pi = 3.1415D; // суффикс D для double необязателен
//         System.out.println(e); // 2.7
//         System.out.println(pi); // 3.1415
//         char ch = '1';
//         System.out.println(Character.isDigit(ch)); // true
//         ch = 'a';
//         System.out.println(Character.isDigit(ch)); // false
//     }
// }
/**
 * program
 */
// public class program {
//     public static void Task1.java(String[] args) {
//         boolean flag1 = 123 <= 234;
//         System.out.println(flag1); //true
//         boolean flag2 = 123 >= 234 || flag1; // && или || обозначение логических операций 'и', | побитовая операция
//         System.out.println(flag2); // true
//         boolean flag3 = flag1 ^ flag2; // '^' разделительная дизъюнкция, возвращает истину тогда и только когда, когда одно из значений истинно, 'или'
//         System.out.println(flag3); //false
//     }
// }
// Строки не простой тип данных
/**
 * program
 */
// public class program {
//     public static void Task1.java(String[] args) {
//         String msg = "Hello world";
//         System.out.println(msg); // Hello world
//     }
// }
// Неявная типизация
/**
 * program
 */
// public class program {
//     public static void Task1.java(String[] args) {
//         var a = 123; // вместо var будет подставлен нужный тип данных
//         System.out.println(a);
//         System.out.println(getType(a));
//         var d = 123.456;
//         System.out.println(d);
//         System.out.println(getType(d));
//         d = 1022;
//         System.out.println(d); // 1022.0
//         // d = "mistake";
//         // error: incompatible types:
//         // String cannot be converted to double
//     }
//     static String getType(Object o) {
//         return o.getClass().getSimpleName();
//     }
// }
// Основы: классы-обертки
//  если нужны какие-то детали,
// например, хочу посмотрть максимально возможное значение int
// Примитив - Обертка
// int - Integer
// short - Short
// long - Long
// byte - Byte
// float - Float
// double - Double
// char - Character
// boolean - Boolean
// class Program {
//     public static void Task1.java(String[] args) {
//         int i = 123;
//         System.out.println(int.max_value); // не сработает, это неправильная запись, см. ниже
//     }
// }
// class Program {
//     public static void Task1.java(String[] args) {
//         System.out.println(Integer.MAX_VALUE); // пишем Integer, в подсказках есть методы, 2147483647
//         System.out.println(Integer.MIN_VALUE); // -2147483648
//     }
// }
// при написании int i = 12345679, разряды можно разделять _, это не повлияет на программу
// int i = 123_456_789
// char.class // черз точку мы обращаемся к членам того класса, с которым работаем
/**
 * program
 */
// public class program {
//     public static void Task1.java(String[] args) {
//         String s = "qwer";
//         s.charAt(1); // обращение к конкретному символу строки
//         System.out.println(s.charAt(1));
//     }
// }
// Операции Java
// ● Присваивание: =
// ● Арифметические: *, /, +, -, %, ++, --
// ● Операции сравнения: <, >, ==, !=, >=, <=
// ● Логические операции: ||, &&, ^, !
// ● Побитовые операции <<, >>, &, |, ^
/**
 * program
 */
// public class program {
//     public static void Task1.java(String[] args) {
//         int a = 123;
//         // a++;
//         System.out.println(a++); // 123
//         System.out.println(a); // 124
//         System.out.println(++a); // 125
//         System.out.println(a); // 125
//     }
// }
/**
 * program
 */
// public class program {
//     public static void Task1.java(String[] args) {
//         boolean f = 123 > 234;
//         System.out.println(f); // false
//     }
// }
// побитовые сдвиги
// public class program {
//     public static void Task1.java(String[] args) {
//         int a = 8;
//         //  1000 8 в битах
//         // a = a << 1;
//         System.out.println(a << 1); // 16
//         // 10000 сдвинули все биты влево
//     }
// }
// public class program {
//     public static void Task1.java(String[] args) {
//         int a = 5;
//         int b = 2;
//         System.out.println(a | b); // 7
//         // 102
//         // 010
//         // 111
//     }
// }
// public class program {
//     public static void Task1.java(String[] args) {
//         int a = 5;
//         int b = 2;
//         System.out.println(a & b); // 0
//         // 102
//         // 010
//         // 111
//     }
// }
// public class program {
//     public static void Task1.java(String[] args) {
//         String s = "qwe1";
//         // boolean b = s.length() >= 5 && s.charAt(4) == '1'; // false, если правая часть перед &&, false, нет смысла смотреть, что справа
//         boolean b = s.length() >= 5 & s.charAt(4) == '1'; 
//         System.out.println(b); // false, если правая часть перед &, false, программа посмотрит, что справа
//     }
// }
// Массивы
// Одномерные
// public class Program {
//     public static void Task1.java(String[] args) {
//         int[] arr = new int[10];
//         arr[3] = 13;
//         System.out.println(arr[3]); // 13
//     }
// }
// public class Program {
//     public static void Task1.java(String[] args) {
//         int[] arr = new int[10];
//         System.out.println(arr.length); // 10
//         arr = new int[]{1, 2, 3, 4, 5};
//         System.out.println(arr.length); // 5
//     }
// }
// Многомерные
// public class Program {
//     public static void Task1.java(String[] args) {
//         int[] arr[] = new int[3][5];
//         for (int[] line : arr) {
//             for (int item : line) {
//                 System.out.printf("%d ", item);
//             }
//             System.out.println();
//         }
//     }
// }
// public class Program {
//     public static void Task1.java(String[] args) {
//         int[][] arr = new int[3][5];
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.printf("%d ", arr[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }
// Преобразования
// public class Program {
//     public static void Task1.java(String[] args) {
//         int i = 123;
//         double d = i;
//         System.out.println(i); // 123
//         System.out.println(d); // 123.0
//         d = 3.1415;
//         i = (int) d;
//         System.out.println(d); // 3.1415
//         System.out.println(i); // 3
//         d = 3.9415;
//         i = (int) d;
//         System.out.println(d); // 3.9415
//         System.out.println(i); // 3
//         byte b = Byte.parseByte("123");
//         System.out.println(b); // 123
//         b = Byte.parseByte("1234");
//         System.out.println(b); // NumberFormatException: Value out of range, Byte хранит значения от 0 до 255
//     }
// }
// НО
// class Program {
//     public static void Task1.java(String[] args) {
//         int[] a = new int[10];
//         double[] d = a; // ИЗУЧАЕМ ковариантность и контравариантность
//     }
// }
// Получение данных из терминала
// Строки
// import java.util.Scanner;
// public class Program {
//     public static void Task1.java(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("name: ");
//         String name = iScanner.nextLine();
//         System.out.printf("Привет, %s!", name);
//         iScanner.close();
//     }
// }
// Некоторые примитивы
// import java.util.Scanner;
// public class Program {
//     public static void Task1.java(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         int x = iScanner.nextInt();
//         System.out.printf("double a: ");
//         double y = iScanner.nextDouble();
//         System.out.printf("%d + %f = %f", x, y, x + y);
//         iScanner.close();
//     }
// }
// Проверка на соответствие получаемого типа
// import java.util.Scanner;
// public class Program {
//     public static void Task1.java(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         boolean flag = iScanner.hasNextInt();
//         System.out.println(flag);
//         int i = iScanner.nextInt();
//         System.out.println(i);
//         iScanner.close();
//     }
// }
// Форматированный вывод
// public class Program {
//     public static void Task1.java(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = a + " + " + b + " = " + c;
//         System.out.println(res);
//     }
// }
// public class Program {
//     public static void Task1.java(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = String.format("%d + %d = %d \n", a, b, c);
//         System.out.printf("%d + %d = %d \n", a, b, c);
//         System.out.println(res);
//     }
// }
// Виды спецификаторов
// %d: целочисленных значений
// %x: для вывода шестнадцатеричных чисел
// %f: для вывода чисел с плавающей точкой
// %e: для вывода чисел в экспоненциальной форме,
// например, 3.1415e+01
// %c: для вывода одиночного символа
// %s: для вывода строковых значений
// public class Program {
//     public static void Task1.java(String[] args) {
//         float pi = 3.1415f;
//         System.out.printf("%f\n", pi); // 3,141500
//         System.out.printf("%.2f\n", pi); // 3,14
//         System.out.printf("%.3f\n", pi); // 3,141
//         System.out.printf("%e\n", pi); // 3,141500e+00
//         System.out.printf("%.2e\n", pi); // 3,14e+00
//         System.out.printf("%.3e\n", pi); // 3,141e+00
//     }
// }
// Область видимости переменных
// У переменных существует понятие «область видимости».
// Если переменную объявили внутри некоторого блока фигурных скобок { },
// то снаружи этого блока переменная будет недоступна.
// public class Program {
//     public static void Task1.java(String[] args) {
//         {
//             int i = 123;
//             System.out.println(i);
//         } // за пределами скобочек не видна переменная
// но то, что снаружи, может быть доступно для переменных внутри
//         int i = 222;
//         System.out.println(i); // error: cannot find symbol
//     }
// }
// Функции и методы
// Функции и методы — это технически одно и то же. Функции могут
// не принадлежать классам, а методы принадлежат.
// В java все функции являются методами.
// Описание
// Вызов
// Возвращаемое значение
// Рекурсия
// public class Program {
//     static void sayHi() {
//         System.out.println("hi!");
//     }
//     static int sum(int a, int b) {
//         return a + b;
//     }
//     static double factor(int n) {
//         if (n == 1) {
//             return 1;
//         }
//         return n * factor(n - 1);
//     }
//     public static void Task1.java(String[] args) {
//         sayHi(); // hi!
//         // для вызова функции из библиотеки пишем
//         // lib.sayHi();, где lib - название айла библиотеки
//         System.out.println(sum(1, 3)); // 4
//         System.out.println(factor(5)); // 120.0
//     }
// }
// Управляющие конструкции:
// условный оператор
// public class Program {
//     public static void Task1.java(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c;
//         if (a > b) {
//             c = a;
//         } else {
//             c = b;
//         }
//         System.out.println(c);
//     }
// }
// // условный оператор
// public class Program {
//     public static void Task1.java(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c = 0;
//         if (a > b) {
//             c = a;
//         }
//         if (b > a) {
//             c = b;
//         }
//         System.out.println(c);
//     }
// }
// // тернарный оператор
// public class Program {
//     public static void Task1.java(String[] args) {
//         int a = 1;
//         int b = 2;
//         int min = a < b ? a : b;
//         System.out.println(min);
//     }
// }
// Оператор выбора
// import java.util.Scanner;
// public class Program {
//     public static void Task1.java(String[] args) {
//         int mounth = value;
//         String text = "";
//         switch (mounth) {
//             case 1:
//                 text = "Autumn";
//                 break;
//             ...
//             default:
//                 text = "mistake";
//                 break;
//         }
//         System.out.println(text);
//         iScanner.close();
//     }
// }
// Циклы
// Цикл — это многократное выполнение одинаковой
// последовательности действий.
// В java доступны следующие циклы:
// ● цикл while;
// ● цикл do while;
// ● цикл for; и его модификация for in
// Цикл while
// public class Program {
//     public static void Task1.java(String[] args) {
//         int value = 321;
//         int count = 0;
//         while (value != 0) {
//             value /= 10;
//             count++;
//         }
//         System.out.println(count);
//     }
// }
// Цикл do while
// public class Program {
//     public static void Task1.java(String[] args) {
//         int value = 321;
//         int count = 0;
//         do {
//             value /= 10;
//             count++;
//         } while (value != 0);
//         System.out.println(count);
//     }
// }
// continue, break
// Операторы для управления циклами — continue и break.
// Выполнение следующей итерации цикла — continue.
// Прерывание текущей итерации цикла — break.
// * ближайшего к оператору
// Оператор цикла for
// public class Program {
//     public static void Task1.java(String[] args) {
//         int s = 0;
//         for (int i = 1; i <= 10; i++) {
//             s += i;
//         }
//         System.out.println(s);
//     }
// }
// Вложенные циклы
// public class Program {
//     public static void Task1.java(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j < 5; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         // * * * * *
//         // * * * * *
//         // * * * * *
//         // * * * * *
//         // * * * * *
//     }
// }
// // Работает только для коллекций
// for :
// public class Program {
//     public static void Task1.java(String[] args) {
//         int arr[] = new int[10];
//         for (int item : arr) {
//             System.out.printf("%d ", item);
//         }
//         System.out.println();
//     }
// }
// Работа с файлами
// Создание и запись\ дозапись
// import java.io.FileWriter;
// import java.io.IOException;
// public class Program {
//     public static void Task1.java(String[] args) {
//         try (FileWriter fw = new FileWriter("file.txt", false)) {
//             fw.write("line 1");
//             fw.append('\n');
//             fw.append('2');
//             fw.append('\n');
//             fw.write("line 3");
//             fw.flush();
//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//         }
//     }
// }

// Чтение, Вариант посимвольно
// import java.io.*;

// public class Program {

//     public static void Task1.java(String[] args) throws Exception {
//         FileReader fr = new FileReader("file.txt");
//         int c;
//         while ((c = fr.read()) != -1) {
//             char ch = (char) c;
//             if (ch == '\n') {
//                 System.out.print(ch);
//             } else {
//                 System.out.print(ch);
//             }
//         }
//     }
// }

// Вариант построчно
// import java.io.*;
// public class Program {
//     public static void Task1.java(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//         String str;
//         while ((str = br.readLine()) != null) {
//             System.out.printf("== %s ==\n", str);
//         }
//         br.close();
//     }
// }

// Задачи для демонстрации
// Задачи для самоконтроля
// 1. Задана натуральная степень k. Сформировать случайным
// образом список коэффициентов (значения от 0 до 100)
// многочлена многочлен степени k.
// *Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0

// 2. Даны два файла, в каждом из которых находится запись
// многочлена. Сформировать файл содержащий сумму
// многочленов.
