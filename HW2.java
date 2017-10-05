import java.util.Scanner;

public class HW2 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();//攝氏溫度
        System.out.println(Math.round(v1*9/5+32));
    }
}
