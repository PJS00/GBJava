package GB.Java.Les8.Dop.Ex000;

public class Foo {
    public Integer value;

    public static Integer count;

    public static Integer getCouny() {
        return count;
    }

    //    public static Integer count = 0;
    static {
        count = 0;
    }

    public Foo() {
        count++;
    }

    public void printCount() { // не самая лучшая идея выводить таким образом
        // для демонстрации нормально, но лучше так не делать
        System.out.println(count);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
