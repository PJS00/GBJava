//Что такое API
// API (Application programming interface) —
// это контракт, который предоставляет программа.
// «Ко мне можно обращаться так и так, я обязуюсь
//делать то и это».

//Это возможности, который предоставляют
//разработчики языка для удобного
//взаимодействия с его функционалом

//Простой пример
//Создать строку из 1 млн плюсиков. Как?
//String str = "";
//for(int i = 0; i< 1_000_000;i++){
//    str +="+";
//    }
//это займет 40 с

// вместо этого пишем

//StringBuilder sb = new StringBuilder();
//for (int i = 0; i < 1_000_000; i++) {
//        sb.append("+");
//}
//это займет 9 с

//подсчет времени работы функции
//public class program {
//    public static void main(String[] args) {
//        var s = System.currentTimeMillis();
//        //String str = "";
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 1_000_000; i++) {
//            //str += "+";
//            sb.append("+");
//        }
//        System.out.println(System.currentTimeMillis() - s);
//        //System.out.println(str);
//        //System.out.println(sb);
//    }
//}

//функционал
//concat(): объединение строк
//valueOf(): преобразует Object в строковое представление (завязан на toString())
//join(): объединяет набор строк в одну с учетом разделителя
//charAt(): получение символа по индексу
//indexOf(): первый индекс вхождения подстроки
//lastIndexOf(): последний индекс вхождения подстроки
//startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
//replace(): замена одной подстроки на другую
//trim(): удаляет начальные и конечные пробелы
//substring(): возвращает подстроку, см.аргументы
//toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
//сompareTo(): сравнивает две строки
//equals(): сравнивает строки с учетом регистра
//equalsIgnoreCase(): сравнивает строки без учета регистра
//regionMatches(): сравнивает подстроки в строках

//Какая связь между массивами и строками
//public class program {
//    public static void main(String[] args) {
//        String[] name = { "C", "е", "р", "г", "е", "й" };
//        String sk = "СЕРГЕЙ КА.";
//        System.out.println(sk.toLowerCase()); // сергей ка.
//        System.out.println(String.join("", name)); // Cергей
//        System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
//        // C,е,р,г,е,й
//        System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));
//    }
//}

//String vs StringBuilder
//Если много изменений, или разбираем готовый материал – используем String
//Если много преобразований, или компануем материал – StringBuilder

//Работа с файловой системой
//Сколько разного в файловой системе?
//Каталоги и файлы

//Для работы нужно:
//File <имя> = new File(<полный путь к файлу>);
//File f1 = new File("file.txt"); // это относительный путь
//File f2 = new File("/Users/sk/vscode/java_projects/file.txt");
//это полный путь
//Что предпочтительнее?

// для разных ОС работа с файлами разная, нужно читать документацию
//import java.io.File;
//public class fileSystemDemo {
//    public static void main(String[] args) {
//        String pathProject = System.getProperty("user.dir");
//        String pathFile = pathProject.concat("/file.txt");
//        File f3 = new File(pathFile);
//        System.out.println(f3.getAbsolutePath ());
//        // /Users/sk/vscode/java_projects/file.txt
//        // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt
//    }
//}

//Ошибка на ошибке и ошибкой погоняет
//Как быть?
//Например, код написан в винде, путь к файлам абсолютный.
//Такой код в линуксе не сработает.
//Ошибки:
//отсутсвие папки, файла, файл пустой, битый и т.д.
//

//Обработка ошибок
//try {
//Код, в котором может появиться ошибка
//} catch (Exception e) {
//Обработка, если ошибка случилась
//}
//finally {
//Код, который выполнится в любом случае
//}


//Код ревью
//import java.io.File;
//public class tryDemo {
//    public static void main(String[] args) {
//        try {
//            String pathProject = System.getProperty("user.dir");
//            String pathFile = pathProject.concat("/file.txt");
//            File f3 = new File(pathFile);
//            System.out.println("try");
//        } catch (Exception e) {
//            System.out.println("catch");
//        }
//        finally
//        { System.out.println("finally"); }
//    }
//}

//import java.io.File;
//public class tryDemo {
//    public static void main(String[] args) {
//        try {
//            String pathProject = System.getProperty("user.dir");
//            String pathFile = pathProject.concat("/file.txt");
//            File f3 = new File(pathFile);
//            System.out.println("try");
//        } catch (Exception e) {
//            System.out.println("catch");
//        }
//        finally
//        { System.out.println("finally"); }
//    }
//}

//import java.io.File;
//
//public class tryDemo {
//    public static void main(String[] args) {
//        try {
//            String pathProject = System.getProperty("user.dir");
//            String pathFile = pathProject.concat("/file.txt");
//            File file = new File(pathFile);
//            if (file.createNewFile()) {
//                System.out.println("file.created");
//            } else {
//                System.out.println("file.existed");
//            }
//        } catch (Exception e) {
//            System.out.println("catch");
//        } finally {
//            System.out.println("finally");
//        }
//    }
//}

//String line = "empty";
//try {
//File file = new File(pathFile);
// if (file.createNewFile()) {
//        System.out.println("file.created"); }
//        else {
//BufferedReader bufReader =
//        new BufferedReader(new FileReader(file));
// System.out.println("file.existed");
//line = bufReader.readLine();
// bufReader.close(); }
//        } catch (Exception e) {
//        //e.printStackTrace();
//        } finally {
//        System.out.println(line);
//}


//        isHidden():возвращает истину,если каталог или файл является скрытым
//        length():возвращает размер файла в байтах
//        lastModified():возвращает время последнего изменения файла или каталога
//        list():возвращает массив файлов и подкаталогов,которые находятся в каталоге
//        listFiles():возвращает массив файлов и подкаталогов,которые находятся
//        в определенном каталоге
//        mkdir():создает новый каталог
//        renameTo(File dest):переименовывает файл или каталог
//        Работа с файловой системой
//        length():возвращает размер файла в байтах
//        lastModified():возвращает время последнего изменения
//        файла или каталога
//        list():возвращает массив файлов и подкаталогов,которые находятся в каталоге
//        listFiles():возвращает массив файлов и подкаталогов,которые
//        находятся в определенном каталоге
//        mkdir():создает новый каталог
//        renameTo(File dest):переименовывает файл или каталог
//        Работа с файловой системой

//import java.io.File;
//
//public class Ex0043 {
//    public static void main(String[] args) {
//        String pathProject = System.getProperty("user.dir");
//        String pathDir = pathProject.concat("/files");
//        File dir = new File(pathDir);
//        System.out.println(dir.getAbsolutePath());
//        if (dir.mkdir()) {
//            System.out.println("+");
//        } else {
//            System.out.println("-");
//        }
//        for (String fname : dir.list()) {
//            System.out.println(fname);
//        }
//    }
//}

//С папками также, как и с файлами

//Работа с файловой системой. Каталоги
//Бинарные файлы – что это?

//Логирование
//Логи содержат системную информацию работы
//программного или аппаратного комплекса.
//В них записываются действия разного приоритета
//от пользователя, или программного продукта.
//Процесс ведения логов называют
//“логированием” (журналированием).

//Чтобы внедрить логирование в свою систему
//1. Создать переменную
//Использование
//Logger logger = Logger.getLogger()

//Уровни важности
//INFO, DEBUG, ERROR, WARNING и др. - типы сообщений

//Вывод
//ConsoleHandler info = new ConsoleHandler();
//log.addHandler(info);

//Формат вывода: структурированный, абы как*
//XMLFormatter, SimpleFormatter

//import java.util.logging.*;
//public class Ex0043 {
//    public static void main(String[] args) {
//        Logger logger = Logger.getLogger(Ex0043.class.getName());
//        logger.setLevel(Level.INFO);
//        ConsoleHandler ch = new ConsoleHandler ();
//        logger.addHandler(ch);
//        SimpleFormatter sFormat = new SimpleFormatter ();
//        ch.setFormatter(sFormat);
//        logger.log(Level.WARNING, "Тестовое логирование" );
//        logger.info("Тестовое логирование" );
//    }
//}

//import java.util.logging.*;
//public class Ex0043 {
//    public static void main(String[] args) {
//        Logger logger = Logger.getLogger(Ex0043.class.getName());
//        logger.setLevel(Level.INFO);
//        ConsoleHandler ch = new ConsoleHandler();
//        logger.addHandler(ch);
//        //SimpleFormatter sFormat = new SimpleFormatter();
//        XMLFormatter xml = new XMLFormatter();
//        //ch.setFormatter(sFormat);
//        ch.setFormatter(xml);
//        logger.log(Level.WARNING, "Тестовое логирование");
//        logger.info("Тестовое логирование");
//    }
//}
