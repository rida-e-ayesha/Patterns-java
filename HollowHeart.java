
import java.util.Scanner;

public class HollowHeart {
    public static void main(String[]args)
    { Scanner input=new Scanner(System.in);

       int i;
       int j;
        for (i=0;i<=5;i++)
        {for (j=0;j<=6;j++)
            { if ((i==0 & j%3!=0) || (i==1 & j%3==0) || (i-j==2) || (i+j==8))
               { System.out.print(" * ");}
               else
               {System.out.print("   ");}

            }
            System.out.println();
        }




    }
    }


