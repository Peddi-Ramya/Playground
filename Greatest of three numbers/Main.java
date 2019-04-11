import java.util.Scanner;
class Main {
	public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      int n1=sc.nextInt();  
      int n2=sc.nextInt(); 
      int n3=sc.nextInt();
      int max=0;
      if(n1>n2)
      {
        max=n1;
      }
      
    else
    {
      max=n2;
    }
      if(max>n3)
      {
        System.out.println(max);
      }
      else
      {
        System.out.println(n3);
      } 
          
        
		// Type your code here
    }
}