import java.util.Scanner;

/**
 * add
 */
public class add {

    public static long start;
    public static long end;

    public static void start() {
        start = System.currentTimeMillis();
    }

    public static long end() {
        end = System.currentTimeMillis();
        return end - start;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt(), b = s.nextInt();

        start();
        a = a + b;
        System.out.println(a);
        System.out.println(end());

    }

}