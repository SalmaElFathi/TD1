package TD_1;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
Scanner S=new Scanner(System.in);
System.out.println("entrer un nombre de trois chiffres  ");
int n=S.nextInt();
int a=n%10;
int b=(n/10)%10;
int c=(n/100)%10;
        System.out.println(a+""+b+""+c);
        System.out.println(a+""+c+""+b);
        System.out.println(b+""+a+""+c);
        System.out.println(b+""+c+""+a);
        System.out.println(c+""+b+""+a);
        System.out.println(c+""+a+""+b);


    }
}
