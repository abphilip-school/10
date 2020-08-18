public class pattern6 extends qwertyuiop
{
    public static void main()
    {
        clear();
        for(int i=7;i>=0;i--)
        {
            System.out.println();
            for(int j=1;j<=i;j++)
            System.out.print(j);            
        }        
        for(int i=2;i<=7;i++)
        {
            System.out.println();
            for(int j=1;j<=i;j++)
            System.out.print(j);            
        }
    }
}