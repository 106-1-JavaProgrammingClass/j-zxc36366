import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int cm = scn.nextInt();
        int kg = scn.nextInt();
        System.out.println((double) (cm/2.54f*10)/10f);
        System.out.println((double)(kg/0.454f*10)/10f);
    }
}
