package TD_1;

import java.util.Scanner;

public class Ex8 {


    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        int a,n;
        System.out.println("entrer le nombre du mois ");
        int m=S.nextInt();
        if(m==1||m==3||m==5||m==8||m==7||m==10||m==12) n=31;
        else if(m==4||m==6||m==11)n=30;
        else {System.out.println("entrer l'anne");
        do{ a=S.nextInt();}while(a>2100&&a<1900);
        if(a%4==0)n=28;
        else n=29;
        }
        System.out.println("le nombre des mois est "+n);
        }

    }
