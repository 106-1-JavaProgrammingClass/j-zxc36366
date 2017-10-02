import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        if (a + b >= c && b + c >= a && c + a >= b) {
            System.out.println("True");
        }else {
            if (a + b < c && b + c < a && c + a < b)
                System.out.println("False");
        }
    }
}

