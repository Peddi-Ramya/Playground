import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        for(int index = 0; index <= (arr_size - 1); index++)
        {
            arr[index] = in.nextInt();
        }
      zero_end(arr,arr_size);
    }
  public static void zero_end(int arr[],int n)
  {
    int count=0;
    for(int i=0;i<=(n-1);i++)
    {
      if(arr[i]>0)
      {
        System.out.print(arr[i]+" ");
        count++;
      }
    }
    for(int i=count;i<n;i++)
    {
      arr[i]=0;
      System.out.print(arr[i]+" ");
    }
       // Type your code here
    }
}
