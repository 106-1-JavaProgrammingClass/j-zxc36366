import java.util.Scanner;

public class HW6 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char ch1 = ',';
        char ch2 = '#';
        System.out.println(str.replace( ',',  '\n'));
        System.out.println(str.replace( '#',  '\n'));
    }
}