import java.util.*;
public class smallest_multiple extends qwertyuiop
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a limit: ");
        int a=sc.nextInt();
        int b=a,c=0,d=30,e=0,f=0,j;
        for(int i=0;i<3;)
        {
            e=0;
            d++;
            for(j=1;j<=a;j++)
            {
                if(d%j==0)                
                e=0;
                else
                {
                    e=1;
                    break;
                }
            }
            if(e==0)
            break;
        }
        System.out.print(d);        
    }
}