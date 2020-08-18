public class evenfibonacci 
{
    public static void main()
    {
        int a=0,b=0,c=1;
        for(int i=0;i<=40;i++)
        {
            a=b+c;
            c=b;
            b=a;            
            if(a%2==0)
            System.out.println(a);
        }
    }
}
