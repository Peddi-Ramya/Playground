import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      for( int r=1;r<=n;++r)
      {
        for(int sp=1;sp<=(n-r);sp++)
        {
          System.out.print(" ");
        }
        for(int c=1;c<=(2*r-1);++c)
        {
         System.out.print("*");
        }
         System.out.println();
      }
      
                               
	    // Type your code here
	}
}
