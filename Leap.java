package Corejava;

public class Leap {
    public static void main(String[] args) {
        int year=2025;
        if(year%100==0)
        {
            if(year%400==0)
                System.out.println("Leap year");
            else
                System.out.println("not leap");
        }
        else
        {
            if (year % 4 == 0)
                System.out.printf("Leap year");
            else
                System.out.printf("not leap year");
        }
    }
}
