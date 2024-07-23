package GB.Seminar_6.HW6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LaptopStore ltStore = new LaptopStore();
        Scanner sc = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Выберите \n 1 - каталог \n 2 - фильтр");
            answer = sc.next();
            if ("1".equals(answer)) {
                ltStore.getAll();
            } else if ("2".equals(answer)) {
                ltStore.filter();
            } else {
                System.out.println("Неправильная команда");
            }
        }
        while (!"0".equals(answer));
    }
}
