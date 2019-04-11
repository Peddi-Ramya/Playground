import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    int batch=arr[0]+arr[1]+arr[2];
    boolean s=true;
    for(int i=3;i<n;i=i+3)
    {
      int cur=arr[i]+arr[i+1]+arr[i+2];
      if(cur != batch)
      {
        s=false;
      }
    }
    if(s==true)
    {
      System.out.print("Perfect Batch");
    }
    else
    {
      System.out.print("Not a Perfect Batch");
    }
    //Try your code here
  }
}