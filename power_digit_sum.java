import java.util.*;
public class power_digit_sum extends qwertyuiop
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a power: ");
        int a=sc.nextInt();
        int b=0,c=0,d=0,e=0;
        b=(int)(Math.pow(2,a));
        while(b!=0)
        {
            c=b%10;
            b=b/10;
            d=d+c;
        }
        System.out.println("SUM: "+d);
    }
}