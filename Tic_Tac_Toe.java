import java.util.*;
public class Tic_Tac_Toe
{
    public static void main()
    {
        System.out.println("\u000C");char black=(char)(9608);
        Scanner sc=new Scanner(System.in);
        int a,b,d=0,e=0;char xo='\u000C';
        char c[][]=new char[3][3];
        for(int y=0;y<3;y++)
        {
            for(int z=0;z<3;z++)
            c[y][z]=' ';
        }
        for(int i=0;i<9;i++)
        {            
            System.out.println("\u000C");
            for(int y=0;y<3;y++)
            {
                for(int z=0;z<3;z++)
                System.out.print(c[y][z]+"|");
                System.out.println("\n------");
            }            
            d++;
            if(d%2!=0)
            {
                System.out.println("1st player");
                xo='x';
            }
            else 
            {
                System.out.println("2nd player");
                xo='o';
            }
            System.out.println("Enter coordinates x&y: ");
            if(i==8)
            e=1;            
            a=sc.nextInt();
            b=sc.nextInt();
            if(c[a-1][b-1]==' ')
            c[a-1][b-1]=xo;
            else
            {
                System.out.println("Already assigned");
                d--;i--;
                System.out.println("Enter any character to continue: ");
                String con=sc.next();
            }     
            if(c[0][0]=='x'&&c[1][1]=='x'&&c[2][2]=='x')
            {
                System.out.println("1st player wins");
                break;
            }       
            else if(c[0][1]=='x'&&c[1][1]=='x'&&c[2][1]=='x')
            {
                System.out.println("1st player wins");
                break;
            }
            else if(c[2][0]=='x'&&c[1][1]=='x'&&c[0][2]=='x')
            {
                System.out.println("1st player wins");
                break;
            }
            else if(c[0][1]=='x'&&c[1][1]=='x'&&c[2][1]=='x')
            {
                System.out.println("1st player wins");
                break;
            }
            else if(c[2][0]=='x'&&c[2][1]=='x'&&c[2][2]=='x')
            {
                System.out.println("1st player wins");
                break;
            }
            else if(c[0][0]=='x'&&c[0][1]=='x'&&c[0][2]=='x')
            {
                System.out.println("1st player wins");
                break;
            }
            else if(c[0][0]=='x'&&c[1][0]=='x'&&c[2][0]=='x')
            {
                System.out.println("1st player wins");
                break;
            }
            else if(c[0][2]=='x'&&c[1][2]=='x'&&c[2][2]=='x')
            {
                System.out.println("1st player wins");
                break;
            }
            else if(c[1][0]=='x'&&c[1][1]=='x'&&c[1][2]=='x')
            {
                System.out.println("1st player wins");
                break;
            }
            if(c[0][0]=='o'&&c[1][1]=='o'&&c[2][2]=='o')
            {
                System.out.println("2nd player wins");
                break;
            }       
            else if(c[0][1]=='o'&&c[1][1]=='o'&&c[2][1]=='o')
            {
                System.out.println("2nd player wins");
                break;
            }
            else if(c[2][0]=='o'&&c[1][1]=='o'&&c[0][2]=='o')
            {
                System.out.println("2nd player wins");
                break;
            }
            else if(c[0][1]=='o'&&c[1][1]=='o'&&c[2][1]=='o')
            {
                System.out.println("2nd player wins");
                break;
            }
            else if(c[2][0]=='o'&&c[2][1]=='o'&&c[2][2]=='o')
            {
                System.out.println("2nd player wins");
                break;
            }
            else if(c[0][0]=='o'&&c[0][1]=='o'&&c[0][2]=='o')
            {
                System.out.println("2nd player wins");
                break;
            }
            else if(c[0][0]=='o'&&c[1][0]=='o'&&c[2][0]=='o')
            {
                System.out.println("2nd player wins");
                break;
            }
            else if(c[0][2]=='o'&&c[1][2]=='o'&&c[2][2]=='o')
            {
                System.out.println("2nd player wins");
                break;
            }
            else if(c[1][0]=='o'&&c[1][1]=='o'&&c[1][2]=='o')
            {
                System.out.println("2nd player wins");
                break;
            }                        
        }
        System.out.println();
        for(int y=0;y<3;y++)
        {
            for(int z=0;z<3;z++)
            System.out.print(c[y][z]+"|");
            System.out.println("\n------");
        }
        
    }
}