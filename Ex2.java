package TD_1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("entrer a , b et c ");
        double a =S.nextInt();
        double b =S.nextInt();
        double c =S.nextInt();
        double d=Math.pow(b,2)-4*a*c;
        if(d>0){
            System.out.println("l'equation admet deux solutions x1="+((-b-Math.sqrt(d))/(2*a))+" x2= "+((-b+Math.sqrt(d))/(2*a)));
        }
        else if (d==0){System.out.println("l'equation admet une  solution x="+(-b/(2*a)));
    }
    else System.out.println("l'equation n'admet pas de solutions");
}
}