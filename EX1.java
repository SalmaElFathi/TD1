package TD_1;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner S=new Scanner (System.in);
        System.out.println("entrer 3 variables ");
        int a=S.nextInt();
        int b=S.nextInt();
        int c=S.nextInt();

        System.out.println("le max des trois nombres est "+Math.max(a,Math.max(b,c)));
    }
}
