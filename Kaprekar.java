package Corejava;

public class Kaprekar {
    public static void main(String[] args) {
        int num=123;
        int temp=num;
        int square=num*num;
        int count=0;
        while(num>0) {
            num = num / 10;
            count++;
        }
        int div=(int)Math.pow(10,count);
        int x=square%div;
        int y=square/div;
        int sum=x+y;
        if(temp==sum)
            System.out.println("is a Kaprekar number");
        else
            System.out.println("is not a Kaprekar number");


    }
}
