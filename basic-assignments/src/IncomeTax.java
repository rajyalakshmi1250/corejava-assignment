import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		  long salary;
		Scanner sc = new Scanner(System.in);
		salary = sc.nextLong();
		if(salary >= 0 && salary <= 80000) 
			System.out.println("taxpayable is nill");
		else if(salary >= 180001 && salary <= 300000) 
			System.out.println("tax payable is" +salary * 0.01);
		
		else if(salary >= 300000 && salary <= 500000) 
			System.out.println("tax payable is" +salary * 0.02);
		
		else if(salary >= 500000 && salary <= 1000000)
			System.out.println("tax payable is " +salary * 0.03);
			
		
		sc.close();
		
		
		
	}

}
