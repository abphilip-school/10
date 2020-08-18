import java.util.*;
public class sum_square_diff extends qwertyuiop
{
    public static void main()
    {
        clear();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int a=sc.nextInt();
        int b=0,c=0,d=0,e=0;
        for(int i=0;i<=a;i++)
        {
            b=b+i;
            c=c+i*i;
        }
        b=b*b;
        d=b-c;
        System.out.println(d);
    }
}