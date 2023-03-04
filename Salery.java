package Corejava;

public class Salery {
    public static void main(String[] args) {
        int basicSalery=30000;

        double grossSalery=0;
        if(basicSalery<=10000) {
            grossSalery = basicSalery + (basicSalery * 20) / 100 + (basicSalery * 80) / 100;
        }
        else if(basicSalery<=20000)
        {
            grossSalery=basicSalery+(basicSalery*25)/100+(basicSalery*90)/100;
        }
        else
        {
            grossSalery=basicSalery+(basicSalery*30)/100+(basicSalery*95)/100;

        }
        System.out.println("Gross Salery is : "+grossSalery);
    }
}
