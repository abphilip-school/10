import java.util.*;
public class nested_function extends qwertyuiop
{
    public static void decrement(int a)
    {
        a--;
        System.out.println(a);        
        if(a!=0)
        decrement(a);
    }
}
