import java.util.*;
public class hotel extends master_class
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Hotel");
        sleep(3000);String name[]=new String[30];int dir=0,floorp=0,input=0;
        clear();int rooms[][]=new int[11][3];int nc=0,check=0,floor=0;
        loading();String num="",num1="";
        for(int i=0;i<3;)
        {            
            floor=0;
            System.out.println("Enter your name: ");
            name[nc]=sc.nextLine();
            System.out.println("Enter 1 for check-in");
            System.out.println("Enter 2 for check-out");
            if(name[nc]=="Alvin")
            dir=1;
            if(dir==1)
            System.out.println("Enter 3 for directory");
            input=sc.nextInt();
            if(input==1)
            {
                System.out.println("Floor preference");                              
                floorp=sc.nextInt();
                if(floorp>10)
                {
                    nline("adjusting to the highest floor");
                    floorp=10;
                }
                else if(floorp<0)
                {
                    nline("adjusting to the lowest floor");
                    floorp=0;
                }
                loading();
                for(int j=0;j<20;j++)
                {
                    if(j%2==0)                    
                    floor=floorp+j*-1;
                    else 
                    floor=floorp+j;
                    if(floor<0)
                    continue;                    
                    for(int k=0;k<3;k++)
                    {
                        if(rooms[floor][k]==0)
                        {
                            num=Integer.toString(floor*100);
                            rooms[floor][k]=1;
                            if(floor<10)
                            num="0"+num;
                            num1=Integer.toString(k);
                            name[nc]=name[nc]+"-"+num+num1;
                            System.out.println("Alloted");
                            sleep(2000);
                            clear();
                            check=1;
                            break;
                        }
                        else
                        System.out.println(floor+" floor"+k+" room not available");  
                    }
                    if(check==1)
                    break;
                }                
            }
            nc++;
        }
    }
}