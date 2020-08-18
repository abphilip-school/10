import java.util.*;
public class lowest
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int lowest=0,d=0;        
        if(a<=b&&a<=c)
        lowest=a;
        if(b<=a&&b<=c)
        lowest=b;
        if(c<=a&&c<=b)
        lowest=c;
        for(int i=0;i<3;)
        {
            for(int j=2;j<a;j++)
            {
                if(a%j==0&&b%j==0&&c%j==0)
                {
                    a=a/j;
                    b=b/j;
                    c=c/j;
                    break;
                }            
                
            }
            break;
        }
        System.out.println(a+" "+b+" "+c);
    }
}