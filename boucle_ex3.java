package TD_1;

import java.util.Scanner;

public class boucle_ex3 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int tab[] = new int[20];
        System.out.println("entrer 20 nombres");
        for (int i = 0; i < 20; i++) {
            tab[i] = S.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            System.out.print(tab[i] + " ");
        }
        int c=0;
        int max=tab[0];
        for (int i=0;i<20;i++){
            if((tab[i])>max)
            {max=tab[i];
            c=i;}

        }
        System.out.println(" le max est "+max+" son indice est "+c);
    }
}