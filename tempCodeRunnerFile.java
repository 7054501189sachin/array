

public class tempCodeRunnerFile
{public static void patternprint(int n)
    {
        for(int i=1;i<=n;i++)
        {
            // space pr//int
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
    public static void halfpyramid(int n)
    {
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(" "+j);
            }
            System.out.println();
        }
        
        
    }
    

    public static void main(String args[])
    {
        
       // patternprint(4);
       halfpyramid(18);

    }
    
}