package TD_1;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("entrer 2 nombres");
        int a =S.nextInt();
        int b =S.nextInt();
        System.out.println(Math.min(a,b)+" "+Math.max(a,b));

    }

}

    /*
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int  s=0;
        System.out.println("entrer un nombre n ");
                 int n=S.nextInt();
        while (n>0){s+=n%10;
        n=n/10;}
        System.out.println(s);

    }
}
*/