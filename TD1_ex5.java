package TD_1;

import java.util.Scanner;

public class TD1_ex5 {
    public static void main(String[] args) {
        int n=8;
        Scanner S =new Scanner(System.in);
        String t[]=new String[n];
        for (int i=0;i<8;i++)
        {t[i]=S.next();}
        for (int i=0;i<8;i++){System.out.println(t[i]);}
        for (int i=0;i<8;i++){t[i]=t[i-1];}
        for (int i=0;i<8;i++){System.out.println(t[i]);}
    }}
