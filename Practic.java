package Corejava;

public class Practic {

        public static void main(String[] args) {
            for (int i=0;i<5;i++)
            {
                int count=1;
                int cnt=1;

                for(int j=0;j<10;j++)
                {
                    if(j-i<=0||j+i>=9)
                    {
                      if(j<5)
                        System.out.print(count++);
                    else
                          System.out.print(cnt++);}
                    else
                        System.out.print(" ");

                }
                System.out.println();
            }
            int var2=0;
            System.out.println( 81.7%7);
        }

}
