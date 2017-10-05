import java.util.Scanner;

public class HW14 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        char ch1 = scn.next().charAt(0);
        int v1 = (int) ch1;
        System.out.println(Integer.toHexString(v1));
    }
}
