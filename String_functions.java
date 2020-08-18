import java.util.*;
public class String_functions
{
    public String input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a=sc.nextLine();
        return(a);
    }
    public int l(String a)
    {
        int b=a.length();
        return(b);
    }
    public char ca(String a,int b)
    {
        int l=a.length();char c=' ';
        if(b<l)
        c=a.charAt(b);
        else
        c=' ';
        return(c);
    }    
    public int indexOf(String a,char c,int start)
    {
        int b=a.indexOf(c,start);
        return(b);
    }
    public String rep(String a,char o,char n)
    {
        String b=a.replace(o,n);
        return(b);
    }
    public String sub_string(String a,int s,int l)
    {
        String b=a.substring(s,l);
        return(b);
    }
}