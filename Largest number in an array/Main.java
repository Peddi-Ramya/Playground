import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int arrs=sc.nextInt();
      int arr[]=new int[arrs];
      for(int i=0;i<arrs;i++)
      {
        arr[i]  = sc.nextInt();
        
      }  
      int max=0;
      if(arr[0]>arr[1])
      {
        max=arr[0];
      }
      else
      {
        max=arr[1];
      }
      for(int i=2;i<arrs;i++)
      {
        if(max<arr[i])
        {
          max=arr[i];
        }
      }
      System.out.println(max);
      // Type your code here
    }
}