import java.util.*;
public class function_overloading
{    
    public static int heat(int m,int c,int ch)
    {
        int q=m*c*ch;
        return(q);
    }
    public static int heat(int p,int t)
    {
        int q=p*t;
        return(q);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for finding hear by the input of mass,specific heat and change in temperature");
        System.out.println("Enter 2 for finding heat by the input of power and time");
        int a=sc.nextInt();
        int b=0,c=0,d=0,q=0;
        switch(a)
        {
            case 1:
            System.out.println("Enter the mass: ");
            b=sc.nextInt();
            System.out.println("Enter the specific heat capacity: ");
            c=sc.nextInt();
            System.out.println("Enter the change in temperature: ");
            d=sc.nextInt();
            q=heat(b,c,d);
            break;
            case 2:
            System.out.println("Enter the power: ");
            b=sc.nextInt();
            System.out.println("Enter the time: ");
            c=sc.nextInt();
            q=heat(b,c);
            break;
            default:
            System.out.println("WRONG OPTION");
        }
        System.out.println("HEAT: "+q);
    }
}