import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int CH = scn.nextInt();
        int EN = scn.nextInt();
        int MA = scn.nextInt();
        System.out.println(CH+EN+MA);
        System.out.println((CH+EN+MA)/3);
    }
}
