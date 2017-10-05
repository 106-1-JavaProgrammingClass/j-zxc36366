import java.util.Scanner;

public class HW9 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        float f1 = scn.nextFloat();
        System.out.println(Math.round(f1/600f*10)/10f);
    }
}
