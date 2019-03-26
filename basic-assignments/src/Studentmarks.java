import java.util.Scanner;

public class Studentmarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		if(a>60 && b>60 && c>60) {
			System.out.println("passed");
		}
		else if(a>60 && b>60||(a>60 && c>60)||(b>60 && c>60)) {
			System.out.println("promoted");
	}
		else if(((a>60)||(a>60 && b>60 && c>60)||(b>60)||(a>60 && b>60 && c>60)||(c>60)||(a>60 && b>60 && c>60)))
				{
			System.out.println("failed");
			s.close();
				}
}
}
