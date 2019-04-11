import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
       int arr_size = in.nextInt();
       int arr[] = new int[arr_size];
       for(int index = 0; index <= arr_size - 1; index++){
           arr[index] = in.nextInt();
       }
      int val=in.nextInt();
      int sum=0;
      for(int i=0;i<arr_size;i++)
      {
        for(int i1=i+1;i1<arr_size;i1++)
        {
           sum= arr[i]+arr[i1];
        
        if(sum==val)
        {
          System.out.print(arr[i]+","+ " " +arr[i1]+"\n");
        }
         
        }// Type your code here
  
    }
     
}
}