

public class file{
public static void patternprint(int n)
    {
        for(int i=1;i<=n;i++)
        {
            // space peint
            for(int j=1;j<=(4*i)-1;j++)
            {
                System.out.print("");
            }
            for(int k=1;k<=n-i;k++)
            {
                System.out.print("*");
                
            }System.out.println();
            
        }

    }

    public static void main(String args[])
    {
        
        patternprint(8);

    }
    
}