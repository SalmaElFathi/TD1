package TD_1;

import java.util.Scanner;

public class boucle_ex2 {
    public static void main(String[] args) {
        Scanner S=new Scanner (System.in);
        System.out.println("entrer un entier n");
        int n=S.nextInt();
        int s=0;
        for (int i=0;i<n;i++)
        {if (i%2==0)s+=i;}
        System.out.println("la somme est "+s);
    }
}
