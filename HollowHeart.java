
public class HollowHeart {
    public static void main(String[]args)
    { 
       int i;
       int j;
        //for rows
        for (i=0;i<=5;i++)
        //for columns    
        {for (j=0;j<=6;j++)
        //for heart    
            { if ((i==0 & j%3!=0) || (i==1 & j%3==0) || (i-j==2) || (i+j==8))
               { System.out.print(" * ");}
               else
               {System.out.print("   ");}

            }
            System.out.println();
        }




    }
    }


