
public class ArmstrongNumber {
public static void main(String[] args) {
	int number=153;
	int a;
	
	int sum=0;
	int d;
	d=number;
	while(number!=0)
	{
		a=number%10;
		

		number=number/10;
		sum=sum+(a*a*a);
	}
	if(d==sum)
	System.out.println("Amstrong Number");
	else
		System.out.println("not Amstrong Number");
	

		
}
}
