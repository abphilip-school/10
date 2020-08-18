import java.util.*;
public class mini extends qwertyuiop
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for stopwatch: ");
        System.out.println("Enter 2 for date and time: ");
        System.out.println("Enter 3 for calculator: ");
        int a=sc.nextInt();
        int h=0,m=0,s=0;
        switch(a)
        {
            case 1:
            for(int i=0;i<3;)
            {
                System.out.println("\u000C");
                System.out.println(h+"h "+m+"m "+s+"s ");
                sleep(1000);
                s++;
                if(s==60)
                {
                    s=0;
                    m++;
                }
                if(m==60)
                {
                    m=0;
                    h++;
                }
            }
            break;
            case 2:
            for(int i=0;i<3;)
            {
                Date d=new Date();
                sleep(1000);
                System.out.println("\u000C");
                System.out.println(d);
            }
            break;
            
        }
    }        
}

