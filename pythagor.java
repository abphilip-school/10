import java.util.*;
public class pythagor extends qwertyuiop
{
    public static void main()
    {
        int h=0,b=0,p=0;
        if(p==0)
        {
            for(b=1;b<1000;b++)
            {
                for(p=1;p<1000;p++)
                {
                    for(h=1;h<10000;h++)
                    {
                        if(h*h==p*p+b*b)
                        System.out.println(h+","+p+","+b);
                    }
                }
            }
        }
    }
}