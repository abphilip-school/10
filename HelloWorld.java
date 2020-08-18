import java.util.Scanner;
public class HelloWorld
{
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(a);
        int l = a.length();
        int sp = l-2;
        String space = "";
        for(int i = 0;i<sp;i++)
            space = space + " ";
        int c = 0;
        char d=' '; char e=' ';
        for(int i=sp;i>0;i--)
        {
            d = a.charAt(++c);
            e = a.charAt(i);
            System.out.println(d+space+e);
        }
        for(int i=sp+1;i>=0;i--)
        {
            d = a.charAt(i);
            System.out.print(d);
        }
     }
}
