public class multiples_3_5 extends qwertyuiop
{
    public static void main()
    {
        for(int i=0;i<=10000;i++)
        {
            if(i%3==0&&i%5==0)
            System.out.print(i+", ");
        }
    }
}