import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner sc =new Scanner(System.in);
      String str1=sc.nextLine();
    
      int str1_len=str1.length();
     
      int front=0;
      int end=str1_len-1;
      boolean is_pali=true;
      while(front<end)
      {
 
        if(str1.charAt(front) != str1.charAt(end))
        {
          is_pali=false;
          break;
        }
      front++;
        end--;
      }
      if(is_pali==true)
      {
        System.out.print("Yes");
      }
      else
      {
System.out.print("No");
      }
         
        // Type your code here
    } 
}