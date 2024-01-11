package TD_1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("entrer l'heure ");
        int h=S.nextInt();
        System.out.println("entrer la langue de l'affichage ");
        char l=S.next().charAt(0);
        switch (l){
            case 'f':if(0<h && h<18)
                System.out.println("bonjour");
            else if(h>=18 && h<22)  System.out.println("bonsoir");
            else  System.out.println("bonne nuit");
            break;
            case 'e':if(0<h && h<18)
                System.out.println("good morning");
            else if(h>=18 && h<22)  System.out.println("good evening");
            else  System.out.println("good night");
                break;

        }


    }
}
