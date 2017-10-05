import java.util.Scanner;

public class HW12 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        double d1 = scn.nextDouble();
        int v1 = scn.nextInt();
        System.out.println(Math.round(d1*Math.pow(10, v1)) / Math.pow(10, v1));

    }
}
