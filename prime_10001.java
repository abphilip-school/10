public class prime_10001 extends qwertyuiop
{
    public static void main()
    {
        int a=2,b=0,c=0,d=0,e=0;
        for(int i=0;i<3;)
        {
            a++;
            c=0;
            for(int j=2;j<a;j++)
            {
                if(a%j==0)
                {
                    c=0;
                    break;
                }
                else                
                c=1;
            }
            if(c==1)
            b++;
            if(b==10001)
            break;
        }
        System.out.println(a);
    }
}