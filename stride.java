// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.awt.Button;
import java.util.*;

/**
 * 
 */
public class stride extends master_class
{

    /**
     * Constructor for objects of class stride
     */
    public stride()
    {
    }

    /**
     * 
     */
    static public void main()
    {
        Scanner sc =  new Scanner(System.in);
        nline("Enter sin,cos or tan:");
        String c = sc.nextLine();
        nline("Enter a number:");
        int a = sc.nextInt();
        double k = 0.0;
        if (c.equals("sin")) {
            k = sin(a);
            System.out.println(k);
        }
        else if (c.equals("cos")) {
            k = cos(a);
            System.out.println(k);
        }
        else if (c.equals("tan")) {
            k = tan(a);
            System.out.println(k);
        }
        else {
            nline("WRONG CHOICE");
        }
    }
}
