import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int trun=0;
      for(int r=1;r<=n;r++)
      {
        for(int c=1;c<=r;c++)
        {
          if(trun==0)
          {
            System.out.print("*");
            trun=1;
          }
          else
          {
            System.out.print("#");
            trun=0;
          }
        }
    System.out.print("\n");
  		// Type your code here
    }
}
    
}