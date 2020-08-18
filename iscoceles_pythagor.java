public class iscoceles_pythagor extends qwertyuiop
{
    public static void main()
    {
        clear();
        for(int i=1;i<10000;i++)
        {
            for(int j=1;j<100000;j++)
            {
                if(i*i+i*i==j*j)
                {
                    System.out.println(i+","+i+","+j);
                    break;
                }
            }
        }
    }
}