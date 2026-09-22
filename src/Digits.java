import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int d = n % 10;
        int c = (n / 10) % 10;
        int b = (n / 100) % 10;
        int a = (n / 1000);

        System.out.println(a + " + " + b + " ? " + c + " + " + d);

    }

}
