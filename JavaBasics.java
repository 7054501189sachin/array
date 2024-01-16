import java.util.*;
public class JavaBasics
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    while(a>0)
    {
      int lastdigit=a%10;
      System.out.println("lastdigit ");
      a=a/10;
      System.out.println();
    } 
  }
}