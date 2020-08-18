import java.util.*;
public class Summation_prime extends qwertyuiop
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int a=sc.nextInt();
        int b=1,c=0,d=2,e=0;
        for(int i=2;i<=a;i++)
        {            
            c=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    c=0;
                    break;
                }
                else
                c=1;
            }
            if(c==1)
            {
                d=d+i;
                e++;
            }                                
        }
        System.out.println("SUM: "+d);
    }
}