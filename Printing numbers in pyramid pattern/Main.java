import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int val=1;
      for( int r=1;r<=n;r++)
      {
        for(int sp=1;sp<=(n-r);sp++)
        {
          System.out.print(" ");
        }
        for(int c=1;c<=r;c++)
        {
         System.out.print(val+" ");
          val++;
        }
         System.out.println();
      }
      
                               
	    // Type your code here
	}
}

    	// Type your code here