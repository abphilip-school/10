import java.util.*;
public class graph extends master_class
{
    public static void main()
    {
        clear();
        Scanner sc=new Scanner(System.in);
        double d[]=new double[100000];
        int cj[]=new int[100000];
        int ci[]=new int[100000];
        int k=0;
        //Math.pow(j*j+i*i-1,3)==j*j*i*i*i
        //System.out.println("        ^");        
        for(int i=30;i>=-30;i--)
        {
            for(int j=-30;j<=30;j++)
            {
                if(j*j==3*i)
                {
                    System.out.print(" ."); 
                    d[k]=0;
                    cj[k]=j;                    
                    ci[k]=i;
                    d[k]=sqrt(i*i+j*j);  
                    //System.out.print(cj[k]);
                    //System.out.print(ci[k]);
                    k++;                    
                    if(j==30&&i==0)
                    System.out.print(">");
                }
                else if(j==0||i==0)
                {
                    if(j==0)
                    System.out.print(" |");
                    else 
                    {
                        if(j==30)
                        System.out.print(" ->");                        
                        else
                        System.out.print(" -");
                    }
                }
                else 
                System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=0;i<k;i++)
        System.out.println(d[i]+" - ("+cj[i]+","+ci[i]+")");
    }
}