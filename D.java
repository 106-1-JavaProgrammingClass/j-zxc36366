import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if (a >= 1 && a <= 12)
            if(a>2 && a<6){
                System.out.println("Spring");
            }else {
                if (a > 5 && a < 9) {
                    System.out.println("Summer");
                } else {
                    if (a > 8 && a < 12) {
                        System.out.println("Autumn");
                    } else {
                        System.out.println("Winter");
                    }

                    }
                }
            }
        }

