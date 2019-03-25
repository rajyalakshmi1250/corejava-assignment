import java.util.Scanner;
public class Searchvalue {
	public static void main(String[] args) {
		
		int array[] = new int[4];

	
	int search;
	int i;
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 4 elements" );
	//n = sc.nextInt();
	//System.out.println("enter" +n+ "integers");
	
	
	
	for(i=0;i<array.length;i++) 
	{
		   array[i]=sc.nextInt();
	}
	System.out.println("enter value to search");
	search = sc.nextInt();
		  for(i=0;i<array.length;i++) {
			  if(array[i]==search) {
				  System.out.println("search element is found at location "+i);
				  break;
			  }
		  }
	
}	

}
