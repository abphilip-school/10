import java.util.*;
public class palindrome_String
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a=sc.nextLine();
        int l=a.length();
        char c,e;
        int b=l,d=1;
        for(int i=0;i<l;i++)
        {
            b--;
            c=a.charAt(i);
            e=a.charAt(b);
            if(c==e)
            d=d*1;
            else
            d=d*0;
        }
        if(d==1)
        System.out.println("PALINDROME");
        else
        System.out.println("NOT PALINDROME");
    }
}