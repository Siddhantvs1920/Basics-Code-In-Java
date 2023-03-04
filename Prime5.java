package Corejava;

public class Prime5 {
    public static void main(String[] args) {


        int num = 5;
        if (num == 0 || num == 1) {
            System.out.println("not prime");
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("not prime");
            }
        }
    }
}
