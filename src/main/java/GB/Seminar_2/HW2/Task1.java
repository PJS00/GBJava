/**
 * Дана строка sql-запроса:
 * select * from students where "
 * Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные (параметры) для фильтрации приведены в виде json-строки в примере ниже. Если значение null, то параметр не должен попадать в запрос.
 * Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:
 * String QUERY - начало SQL-запроса String PARAMS - JSON с параметрами
 * Пример: Строка sql-запроса:
 * select * from students where
 * Параметры для фильтрации:
 * {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 * Результат:
 * select * from students where name='Ivanov' and country='Russia' and city='Moscow'
 */

package GB.Seminar_2.HW2;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String QUERY = "select * from students where ";
        String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        String[] result = PARAMS
            .replace("{", "")
            .replace("}", "")
            .replace("\"", "")
            .replace(" ", "")
            .split(",");

        StringBuilder sql_result = new StringBuilder();
        sql_result.append(QUERY);

        String[] options = new String[result.length];
        for (int i = 0; i < result.length; i++) {
            String[] pair = result[i].split(":");
            StringBuilder option = new StringBuilder();
            if (!pair[1].equals("null")) {
                option.append(pair[0])
                .append("='")
                .append(pair[1])
                .append("'");
                options[i] = option.toString();
            }

        }
        sql_result.append(String.join(" and ", Arrays.copyOf(options, options.length - 1)));
        System.out.println(sql_result);
    }
}

class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS) {
        StringBuilder sql_result = new StringBuilder();
        sql_result.append(QUERY);
        String[] result = PARAMS
                .replace("{", "")
                .replace("}", "")
                .replace("\"", "")
                .replace(" ", "")
                .split(",");

        String[] options = new String[result.length];
        for (int i = 0; i < result.length; i++) {
            String[] pair = result[i].split(":");
            StringBuilder option = new StringBuilder();
            if (!pair[1].equals("null")) {
                option.append(pair[0])
                        .append("='")
                        .append(pair[1])
                        .append("'");
                options[i] = option.toString();
            }

        }
        sql_result.append(String.join(" and ", Arrays.copyOf(options, options.length - 1)));
        return sql_result;
    }
}

class Printer {
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        } else {
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}
