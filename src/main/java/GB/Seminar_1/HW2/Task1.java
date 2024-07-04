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

package GB.Seminar_1.HW2;

import java.lang.reflect.Type;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        String[] result = PARAMS
            .replace("{", "")
            .replace("}", "")
            .replace("\"", "")
            .replace(" ", "")
            .split(",");

        StringBuilder sql_result = new StringBuilder();
        sql_result.append("select * from students where ");

        for (int i = 0; i < result.length; i++) {
            String[] pair = result[i].split(":");
            if (!pair[1].equals("null")) {
                sql_result.append(pair[0]);
                sql_result.append("='");
                sql_result.append(pair[1]);
                sql_result.append("'");
                if (i != result.length - 1) {
                    sql_result.append(" and ");
                }
            }

        }
        System.out.println(sql_result);
    }
}

class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS) {
        StringBuilder result = new StringBuilder();
        result.append(QUERY);

        return result;
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
