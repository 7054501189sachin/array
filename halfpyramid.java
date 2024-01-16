

public class halfpyramid
{
    public static void patternprint(int n)
    {
        for(int i=1;i<=n;i++)
        {
            // space peint
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String args[])
    {
        
        patternprint(4);

    }
    
}