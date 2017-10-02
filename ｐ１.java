import java.util.Scanner;
import java.util.concurrent.Callable;

public class ｐ１ {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        if (ch - 'A' >= 0 && ch - 'A' < 26){
            System.out.println("up");
        }else{
            if (ch - 'a' >= 0 && ch - 'a' < 26){
                System.out.println("lower");
        }else{
                System.out.println("other");
            }
        }
    }
}
