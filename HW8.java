import java.util.Scanner;

public class HW8 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        float f1 = scn.nextFloat();//公升
        System.out.println(Math.round(f1*0.26418f*10)/10f);
    }
}
