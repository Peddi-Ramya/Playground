import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      while(n>=100)
      {
        n=n/10;
      }
      int sum =n%10;
      System.out.println(sum);
    }
	    // Type your code here
	}