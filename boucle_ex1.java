package TD_1;

import java.util.Scanner;

public class boucle_ex1 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("entrer un nombre n");
        int n = S.nextInt();
        int factn = 1;
        for (int i = 1; i <= n; i++)
            factn = factn * i;

        System.out.println("le factorielle de " + n + " est " + factn);
    }
}