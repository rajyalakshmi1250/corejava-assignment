import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n;
      int c;
      int d;
      
      int swap;
  Scanner sc = new Scanner(System.in);
   System.out.println("enter number");
   n=sc.nextInt();
   int array[] = new int[n];
   System.out.println("enter" +n+ "number");
   for(c=0;c<n;c++) 
	   array[c]=sc.nextInt();
	  for(c=0;c<n;c++) {
		  for(d=0;d<n-c-1;d++) {
			  if(array[d]>array[d+1])
			  {
				  swap=array[d];
				  array[d]=array[d+1];
				  array[d+1]=swap;
			  }
		  }
	  }
		  for(c=0;c<n;c++)
			  System.out.println(array[c]);
		  sc.close();
   
 }


}
