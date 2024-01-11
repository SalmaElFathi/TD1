package TD_1;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner S=new Scanner (System.in);
        System.out.println("entrer 2 nombres ");
        int a=S.nextInt();
        int b=S.nextInt();
        System.out.println("entrer un choix");
        int i=S.nextInt();
        switch (i) {
            case 1:
                if ((a + b) % 2 == 0)
                    System.out.println("la somme est paire");
                break;
            case 2:
                if ((a * b) % 2 == 0)
                    System.out.println("le produit est pair");
                break;
            case 3:
                if (a + b > 0)
                    System.out.println("la somme est positive");
                else System.out.println("la somme est négative");
                break;
            case 5:
                if (a * b > 0)
                    System.out.println("le produit est positive");
                else System.out.println("le produit est négative");
                break;

        }



        }
    }

