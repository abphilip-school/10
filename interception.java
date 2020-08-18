import java.util.*;
public class interception extends master_class
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        //Enter two equation using "&&"
        for(int y=1000;y>=-1000;y--)
        {
            for(int x=-1000;x<=1000;x++)
            {
                if(x*x+y+y==1&&y==sin(x)*2)                
                System.out.println(x+","+y);
            }
        }
    }
}