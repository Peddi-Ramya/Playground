import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
 int has=0;
      for(int val=1;val<=n;val++)
      {
        for(int i=0;i<n;i++)
        {
    if(val==arr[i])
              {
                has = 1;
                break;
              }
          else
            has=0;
        }
            if(has==0)
            {
              System.out.print(val);
            }
            
            }
    }
}

        // Type your code here
    
