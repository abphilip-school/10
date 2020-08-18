import java.util.*;
public class collaltz_sequence extends qwertyuiop
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter a number: ");
        int a=(int)(Math.random()*1000000);int b=0;
        for(int i=0;i<3;)
        {
            b++;
            if(a%2==0)
            a=a/2;
            else
            a=(a*3)+1;
            System.out.print(a+",");
            if(a==1)
            break;
        }
        System.out.println();
        System.out.println("No. of processes: "+b);
    }
}