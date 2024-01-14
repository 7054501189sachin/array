import java.util.*;
public class basic
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n>18)
        {
            System.out.println("adult");
            else if(n>18 && n<13)
            {
                System.out.println("teenager");
            }
            else
            {
                System.out.println("non adult");
            }
        }
    }
}
