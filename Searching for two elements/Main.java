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
      int ele1=-1;
      int ele2=-1;
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      for(int i=0;i<arrs;i++)
      {
        if(n1==arr[i])
        {
          ele1=i;
        }
        if(n2==arr[i])
        {
          ele2=i;
        }
      }
      System.out.println(ele1);
      System.out.println(ele2);
    }
          
        
        // Type your code here
    }
