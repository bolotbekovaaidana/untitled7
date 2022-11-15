import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        a(76545);
    }

    public static void a(int a) {
        int r = 0;
        if (a > 999 && a > -999) {
            System.out.println(0);
        }else {
            while (a != 0) {
                int s = a % 10;
                r = r * 10 + s;
                a /= 10;
            }
        }
            System.out.println(r);
    }
}
