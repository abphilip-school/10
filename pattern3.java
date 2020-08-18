public class pattern3 extends qwertyuiop
{
    public static void main()
    {
        int a=0;
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=i;j++)
            System.out.print(j);
            System.out.println();
        }
        int b=0;
        for(int i=6;i>=1;i--)
        {
            b=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
                b++;
            }
            System.out.println();
        }
    }
}