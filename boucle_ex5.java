package TD_1;

import java.util.Scanner;

public class boucle_ex5 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("entrer un nombre ");
        int n = S.nextInt();
        int u[] = new int[100];
        for (int i=2;i<100;i++) {
            u[0] = 1;
            u[1] = 1;
            u[i] = u[i-1] + u[i-2];
        }
        System.out.println("le terme  " + n + " est " + u[n]);
    }
}