import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count =1;
      for(count = 1; count <= n; count++)
      {
        if(count % 2 != 0)
          System.out.println(count);
      }
        
	     // Type your code here
	}
}