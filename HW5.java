import java.util.Scanner;

public class HW5 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();//身高,公分
        int v2 = scn.nextInt();//體重,公斤
        System.out.println((double) v1/2.54);
        System.out.println((double) v2/0.454);

    }
}

