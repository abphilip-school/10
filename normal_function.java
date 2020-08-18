import java.util.*;
public class normal_function 
{
    public static void addition(int a,int b)
    {
        int c=a+b;
        System.out.println("SUM: "+c);        
    }
    public static void subtraction(int a,int b)
    {
        int c=a-b;
        System.out.println("DIFFERENCE: "+c);
    }
    public static void multiplication(int a,int b)
    {
        int c=a*b;
        System.out.println("PRODUCT: "+c);
    }
    public static void division(int a,int b)
    {
        int c=(int)(a/b);
        int d=a%b;
        System.out.println("QUOTIENT: "+c);
        System.out.println("REMAINDER: "+d);
    }
    public static void power(int a,int b)
    {
        double c=Math.pow(a,b);
        System.out.println(a+"^"+b+":"+c);
    }
    public static int r_table(int a,int b)
    {
        int c=a*b;
        return(c);
    }
    public static void table(int a,int b)
    {        
        for(int i=1;i<=b;i++)
        {
            int c=r_table(a,i);
            System.out.println(a+" x "+i+" = "+c);
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for division");
        System.out.println("Enter 5 for power");
        System.out.println("Enter 6 for printing the table");
        int a=sc.nextInt();
        System.out.println("Enter 2 numbers: ");
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==1)
        addition(b,c);
        else if(a==2)
        subtraction(b,c);
        else if(a==3)
        multiplication(b,c);
        else if(a==4)
        division(b,c);
        else if(a==5)
        power(b,c);
        else if(a==6)
        table(b,c);
    }
}
        