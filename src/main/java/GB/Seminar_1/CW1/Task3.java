package GB.Seminar_1.CW1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Дана строка. Поменять местами ее половины.
        String str = "qwerty";
        String result = str.substring(str.length()/2) +
                str.substring(0, str.length()/2);
        System.out.println("result= " + result);
    }
}