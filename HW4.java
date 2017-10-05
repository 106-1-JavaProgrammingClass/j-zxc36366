import java.util.Scanner;

public class HW4 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();//國文
        int v2 = scn.nextInt();//英文
        int v3 = scn.nextInt();//數學
        System.out.println(v1+v2+v3);
        System.out.println((v1+v2+v3)/3);

    }
}

