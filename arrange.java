// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;

/**
 * 
 */
public class arrange extends master_class
{

    /**
     * Constructor for objects of class arrange
     */
    public arrange()
    {
    }

    /* second program based on stride*/

    /**
     * 
     */
    static public void main()
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a String");
        String a = sc.nextLine();
        String b = a.toUpperCase();
        String c = arrange_caps(b);
        nline(c);
    }
}
