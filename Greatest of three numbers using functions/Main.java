import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner sc =new Scanner(System.in);
      int n1= sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int n = GRE(n1,n2);
      System.out.println(GRE(n,n3));
    }
  public static int GRE(int m1,int m2)
  { 
    int gre =0;
    if(m1>m2)
    {
      gre=m1;
    }
    else
    {
      gre=m2;
    }
    return gre;
	    // Type your code here
}
}