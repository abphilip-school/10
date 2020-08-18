import java.util.*;
public class master_class extends qwertyuiop
{
    static double pi;
    static double pi1;    
    public static int average(int a[])
    {
        int l=a.length;int s=0;
        s=add_arr(a);
        s=s/l;
        return(s);
    }
    public static int add_arr(int a[])
    {
        int s=0;int l=a.length;
        for(int i=0;i<l;i++)
        s=add(s,a[i]);       
        return(s);
    }
    public static void master_class()
    {
        pi1=22.0/7;
        pi=3.14;
    }
    public static double tan(int a)
    {
        master_class();
        double r=a*pi1/180;
        double tan=Math.tan(r);
        return(tan);
    }
    public static int multiply_arr(int a[])
    {
        int p=1;
        int l=a.length;
        for(int i=0;i<l;i++)
        p=multiply(p,a[i]);
        return(p);
    }
    public static double sin(int a)
    {
        master_class();
        double r=a*pi1/180;
        double sin=Math.sin(r);
        return(sin);
    }
    public static double cos(int a)
    {
        master_class();
        double r=a*pi1/180;
        double cos=Math.cos(r);
        return(cos);
    }
    public static void countdown(int a)
    {
        for(a=a;a>=0;a--)
        {            
            sleep(1000);
            clear();
            System.out.println(a);
        }
        clear();
    }
    public static long factorial(int b)
    {
        long p=1;
        for(int i=1;i<=b;i++)
        {
            p=p*i;
        }
        return(p);            
    }
    public static String arrange_caps(String a)
    {
        a=a.toUpperCase();
        String b="";
        int l=a.length();
        for(int i=65;i<=90;i++)
        {
            for(int j=0;j<l;j++)
            {
                char c=a.charAt(j);
                if(c==(char)i)
                b=b+c;
            }
        }
        return(b);        
    }
    public static void nline(String a)
    {
        System.out.println(a);
    }
    public static void line(String a)
    {
        System.out.print(a);
    }
    public static void pnline(String a)
    {
        System.out.println();
        System.out.print(a);
    }    
    public static void loading()
    {
        for(int i=0;i<3;i++)
        {
            nline("LOADING");
            sleep(1000);
            clear();
            nline("LOADING.");
            sleep(1000);
            clear();
            nline("LOADING..");
            sleep(1000);
            clear();
            nline("LOADING...");
            sleep(1000);
            clear();
        }
    }
    
}
