public class pattern4 extends qwertyuiop
{
    public static void main()
    {        
        for(int i=1;i<=7;i++)
        {
            for(int j=7;j>=i;j--)
            System.out.print(j);
            System.out.println();
        }
    }
}
