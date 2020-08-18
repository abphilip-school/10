import java.util.*;
public class pythagorean_triplet extends qwertyuiop
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        double a=1,b=1,c=1;
        double d=1,e=1,f=1;        
        for(int i=1;i<=200;i++)
        {            
            d=a;
            a=a*a;            
            for(int j=1;j<=500;j++)
            {
                e=b;
                b=b*b;                
                for(int k=1;k<=1000;k++)
                {
                    f=c;
                    c=c*c;
                    if(c==a+b)
                    {                        
                        d=Math.sqrt(a);
                        e=Math.sqrt(b);
                        f=Math.sqrt(c);                        
                        System.out.println(d+","+e+","+f);
                        double tan=d/e;                        
                        for(int l=1;l<89;l++)
                        {
                            double tanv=Math.tan(l);
                            if(tanv==tan)
                            System.out.println("angle: "+l);
                        }
                    }
                    c=Math.sqrt(c);
                    c++;
                }
                b=Math.sqrt(b);
                b++;
                c=1;                
            }
            a=Math.sqrt(a);
            a++;
            b=1;          
        }
        
        
    }
}