package TD_1;

import java.util.Scanner;

public class TD1_ex2 {
        public static void main(String[] args) {
            Scanner S=new Scanner(System.in);

            int i,T[]=new int[50];
            int n=S.nextInt();
            for (i=0;i<50;i++)
            {T[i]=n%2;n=n/2;}
            for ( i =i-1; i>=0 ; i--)
            {System.out.print(T[i] + " ");}
        }}


