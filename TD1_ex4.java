package TD_1;

import java.util.Random;

public class TD1_ex4 {
    public static void main(String[] args) {
        int n=4,m=4,i,j;
        Random r = new Random();
        int a[][]=new int [n][m];
        int s[][]=new int [n][m];
        int b[][]=new int [n][m];
        //lecture des matrices
        for ( i = 0; i < n; i++) {
            for ( j = 0; j < m; j++) {
                a[i][j] = r.nextInt(5);
                b[i][j] = r.nextInt(5);
            }
        }
    //affichage des matrices
        System.out.println("la matrice a ");
        show(a);
        System.out.println("la matrice b ");
        show(b);
    //somme des matrices
        for ( i = 0; i < n; i++) {
            for ( j = 0; j < m; j++) {
               s[i][j] =a[i][j]+b[i][j] ;
            }
        }
        System.out.println("la matrice s ");
        show(s);
    }

     public static void show(int a[][])
     {for (int i=0;i<4;i++)
     { for ( int j=0;j<4;j++)
     {System.out.print(a[i][j]+"  ");}
         System.out.println();}}}

