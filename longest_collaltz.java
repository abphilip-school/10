public class longest_collaltz extends qwertyuiop
{
    public static void main()
    {
        clear();
        System.out.println("PROCESS STARTING IN 3 SECONDS");
        sleep(3000);
        int a=0,b=0,c=0,max=0,maxp=0;
        for(int i=1;i<200;i++)
        {            
            System.out.println("LARGEST: "+max);
            System.out.println("NO. OF PROCESSES: "+maxp);
            a=i;
            for(int j=0;j<3;)
            {
                b++;
                if(a%2==0)
                a=a/2;
                else
                a=a*3+1;
                if(a==1)
                break;
            }
            if(b>maxp)
            {
                max=i;
                maxp=b;
            }
            b=0;
        }
    }
}