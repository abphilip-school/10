import java.util.*;
public class practice
{
    public static void check(String s,char c)
    {
        int l=s.length(),b=0;char d;
        for(int i=0;i<l;i++)        
        {
            d=s.charAt(i);
            if(d==c)
            b++;
        }
        System.out.println("Frequency: "+b);
    }
    public static void check(String s)
    {
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            System.out.print(c);
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for frequency");
        System.out.println("Enter 2 for printing only vowels");
        int a=sc.nextInt();
        switch(a)
        {
            case 1: 
            System.out.println("Enter the String and the character: ");
            String b=sc.next();
            char c=sc.next().charAt(0);
            check(b,c);
            break;
            case 2:
            System.out.println("Enter the String: ");
            String d=sc.next();
            check(d);
            break;
            default:
            System.out.println("Wrong option");
        }
    }
}