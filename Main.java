import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();//英哩
        System.out.println(Math.round(v1*1.6f*10)/10f);
    }
}
