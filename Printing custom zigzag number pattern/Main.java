import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
       Scanner in  = new Scanner(System.in);
	    int n = in.nextInt();
 
	    for(int curr_row = 1; curr_row <= n; curr_row++)
	    {
             // Handle stars for each row
	         for(int curr_col = 1; curr_col <= n; curr_col++)
	         {
                
	                // When row no and col no are equal, print "*"
                    // Otherwise print space
	                if(((curr_row % 2 == 0) && (curr_col == 1))||
	                  ((curr_row % 2 == 1)&&(curr_col == n)))
	                {
	                    System.out.print(curr_row+1);
	                }
                    
	                else
	                {
	                    System.out.print(curr_row);
	                }
	         }
	         System.out.println();
	    }
	}
}