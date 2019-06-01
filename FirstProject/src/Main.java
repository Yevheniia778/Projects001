import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int i;
        final int CONSTANT_A = 10;
        for (i = 0; i < 3; i++) {
            System.out.println("Please, input a");
            Scanner in = new Scanner(System.in);
            a = in.nextInt();
            System.out.println("Please, input b");
            b = in.nextInt();
            double d;
            if (a > b) {
                c = a + b;
            } else {
                c = a - b;
            }
            System.out.println(c);
            switch (c) {
                case -1:
                    d = (double) c / CONSTANT_A;
                    break;
                case 33:
                    d = c * CONSTANT_A;
                    break;
                case 15:
                    d = c % CONSTANT_A;
                    break;
                default:
                    d = ++c;
            }
            System.out.println(d);
        }
        System.out.println(i);
    }
}
//Comment
