import java.util.*;
public class watch extends qwertyuiop
{
    public static void main()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for time");
        System.out.println("Enter 2 for stopwatch");
        System.out.println("Enter 3 for timer");
        int a=sc.nextInt();
        if(a==1)
        {
            Date d=new Date();
            System.out.println(d);
        }
        else if(a==2)
        {           
            clear();
            int s=0;
            for(int i=0;i<3;)
            {
                sleep(1000);
                clear();
                s++;
                System.out.println(s);
            }
        }
        else if(a==3)
        {
            System.out.println("Enter the number of seconds: ");
            int s=sc.nextInt();
            for(int i=0;i<3;)
            {
                clear();
                System.out.println(s);
                sleep(1000);
                s--;
                if(s==0)
                {
                    System.out.println("TIME UP");
                    break;
                }
            }
        }
        main();
    }
}