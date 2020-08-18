import java.util.*;
public class Switch_case 
{
    public static int index(char d,String a)
    {
        int l=a.length();
        int b=0,e=0;char c=' ';
        for(int i=0;i<l;i++)
        {
            c=a.charAt(i);
            if(d==c)
            {
                b=1;
                e=i+1;
                break;
            }   
            else
            b=0;                
        }
        if(b==0)
        return(0);
        else
        return(e);
    }
    public static String join(String a,String b)
    {
        String c=a.concat(b);
        return(c);        
    }        
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for finding the index of a character in a String");
                    
        System.out.println("Enter 2 for printing the number of characters in the String");
        int a=sc.nextInt();int b=0,c=0;
        switch(a)
        {
            case 1:
            System.out.println("Enter a String: ");
            String e=sc.next();
            System.out.println("Enter a character: ");
            char d=sc.next().charAt(0);
            b=index(d,e);
            if(b==0)
            System.out.println("Not present");
            else
            System.out.println("Present in the "+b+" position");
            break;
            case 2:
            String g="";
            System.out.println("Enter the String: ");
            g=sc.next();
            b=g.length();
            System.out.println("Length of the String: "+b);
            break;
            default:
            System.out.println("WRONG OPTION");            
        }
    }
}