package Corejava;

import java.util.Scanner;

public class Percentage {

        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the marks \n 1.Marathi \n 2.Hindi \n 3.English \n 4.Science \n 5.History");
            int m=s.nextInt();
            int h=s.nextInt();
            int e=s.nextInt();
            int v=s.nextInt();
            int t=s.nextInt();
            int total=m+h+e+v+t;
            System.out.println("Total marks you got is : "+total);
            int per=total/5;
            char c='%';
            System.out.println(" Percentage is : "+per+c);
            if(per>=90)
                System.out.println("Grade A ");
            else if(per>=80)
                System.out.println("Grade B ");
            else if(per>=70)
                System.out.println("Grade C");
            else if(per>=60)
                System.out.println("Grade d");
            else if(per>=40)
                System.out.println("Grade e");
            else
                System.out.println("Fail");

        }
    }


