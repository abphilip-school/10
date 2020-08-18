public class pattern9 extends qwertyuiop
{
    public static void main()
    {
        int a=1,b=0;
        clear();        
        for(int i=0;i<=8;i++)
        {
            if(a%2!=0)
            {
                for(int j=1;j<=8;j++)
                {
                    if(j<=a)
                    System.out.print("*");
                    else 
                    System.out.print("#");
                }
            }
            else
            {
                for(int j=8;j>=1;j--)
                {
                    b=8-a;
                    if(j<=a)
                    System.out.print("*");
                    else
                    System.out.print("#");
                }
            }
            a++;
            System.out.println();
        }
    }
}