import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt(); 
      int n2 = sc.nextInt(); 
      int n3 = sc.nextInt();
      int n= GCD(n1,n2);
      System.out.print(GCD(n,n3));
    }
  public static int GCD(int m1, int m2)
  { 
    int min,gcd=0;
    if(m1<=m2)
    {
      min=m1;
    }
    else
    {
      min=m2;
    }
    while(min>=1)
    {
      if((m1%min==0)&&(m2%min==0))
         {
           gcd = min;
           break;
         }
         min--;
         }
         return gcd;
         }
    
	    // Type your code here
	
}