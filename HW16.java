import java.util.Scanner;

public class HW16 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        float f1 = scn.nextFloat();//半徑
        float f2 = scn.nextFloat();//高

        System.out.println((double) Math.PI*Math.pow(f1,2)*f2);
    }
}

