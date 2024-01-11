package TD_1;

import java.util.Scanner;

public class boucle_ex4 {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("entrer 2 nombres a et b ");
        int a=S.nextInt();
        int b=S.nextInt();
        int pgcd=0;

        for (int i=1;i<=Math.min(a,b);i++)
        {if((a%i==0)&&(b%i==0))pgcd=i;}
System.out.println("le pgcd est "+pgcd);
    }
}
