public class pattern10 extends qwertyuiop
{
    public static void main()
    {
        int a=5;
        char c=(char)(9608);
        for(int i=1;i<=10;i++)
        {
            for(int j=10;j>=0;j--)
            {
                if(a<j&&a>i)
                System.out.print("*");
                else
                System.out.print(c);
            }
            System.out.println();
        }
    }
}