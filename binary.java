import java.util.*;
public class binary extends qwertyuiop
{  
    
    public static void encrypting()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a=sc.nextLine(),d="";
        int l=a.length();char c;int b=0;
        for(int i=0;i<l;i++)
        {
            c=a.charAt(i);
            b=(int)c;
            d=Integer.toBinaryString(b);
            System.out.print(d+"-");
        }
    }
}