package GB.Seminar_2.CW1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        String c1 = "c1";
        String c2 = "c2";

        String result = (c1 + c2).repeat(n/2);
        System.out.println(result);
    }
}
