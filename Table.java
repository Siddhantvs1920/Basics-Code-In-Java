package Corejava;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Number to get a Table : ");
        int a=s.nextInt();
        System.out.println("Table of-"+a+"is :");

        for(int i=1;i<=10;i++)
        {
            int b=a*i;
            System.out.println(a+"*"+i+"="+b);
        }
    }
}
