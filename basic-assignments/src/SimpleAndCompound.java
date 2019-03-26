import java.util.Scanner;

public class SimpleAndCompound {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int principal;
		int time;
		float rate;
		principal = sc.nextInt();
		time = sc.nextInt();
		rate = sc.nextFloat();
		float simpleinterest = (principal*time*rate);
		System.out.println(simpleinterest);
		int compoundperyear;
		compoundperyear = sc.nextInt();
		
		float compoundinterest = (float)(principal*Math.pow((1+(rate/compoundperyear)),compoundperyear*time));
		
		System.out.println(compoundinterest);
		
		
	}

}
