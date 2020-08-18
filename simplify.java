
import java.util.*;
public class simplify extends qwertyuiop
{
    public static void main()
    {
        clear();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=sc.nextInt(),c=0,d=0;
        for(int i=0;i<3;)
        {
            for(int j=2;j<a;j++)
            {
                if(a%j==0)
                {
                    a=a/j;
                    c=0;
                    d=j;
                    break;                   
                }
                else
                c=1;
            }
            System.out.println(a+"-"+d);
            if(c==1)
            break;
        }
    }
}