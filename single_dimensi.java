import java.util.*;
public class single_dimensi
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st player's name:");
        String a=sc.nextLine();
        System.out.println("Enter 2nd player's name: ");
        String b=sc.nextLine();
        int c=0,f=0,g=0;
        int d[]=new int[100];  
        int e[]=new int[100];
        for(int i=0;i<=20;i++)
        {
            c++;
            if(c%2==0)
            {
                
                d[f]=(int)(Math.random()*11);
                f++;                
            }
            else
            {                
                e[g]=(int)(Math.random()*11);
                g++;
            }
        }
        System.out.println("_______________________________");
        f=0;g=0;
        for(int i=0;i<10;i++)  
        {
            System.out.print("|"+e[i]);
            f=f+e[i];
        }
        System.out.println(" :"+f);
        System.out.println("_______________________________");
        for(int i=0;i<10;i++)
        {
            System.out.print("|"+d[i]);
            g=g+d[i];
        }
        System.out.println(" :"+g);
        if(f>g)
        System.out.println(b+" wins");
        else if(g>f)
        System.out.println(a+" wins");
        else 
        System.out.println("Tie game");
    }
}
            