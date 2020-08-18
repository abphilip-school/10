import java.util.*;
public class check extends qwertyuiop
{
    public static void matrix()
    {
        clear();
        System.out.println("PROCESS STARTING IN 3 SECONDS");
        sleep(1000);
        System.out.println("PROCESS STARTING IN 2 SECONDS");
        sleep(1000);
        System.out.println("PROCESS STARTING IN 1 SECOND");
        sleep(1000);int c=0,d=0;
        for(int i=0;i<3;)
        {
            c=(int)(Math.random()*10);
            System.out.print(c+" ");
            if(d%20==0){
            System.out.println();}
            d++;
        }
    }
}