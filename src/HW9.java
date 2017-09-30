import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        System.out.println((double)Math.round(v1/600f*10)/10f);
    }
}
