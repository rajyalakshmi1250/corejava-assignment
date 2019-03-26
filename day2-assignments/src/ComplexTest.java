import java.util.Scanner;
public class ComplexTest{
    public static void main(String args[]){
      
       Scanner sc = new Scanner(System.in);
       Complex c1=new Complex();
       System.out.println("enter number");
       c1.setRealAndImaginary(sc.nextDouble(),sc.nextDouble());
       c1.displayComplexNumber();

       Complex c2=new Complex();
       
       System.out.println("enter real number");
       c2.setRealAndImaginary(sc.nextDouble(),sc.nextDouble());
       c2.displayComplexNumber();

       Complex c3;
       System.out.println("Addition of two complex numbers");
       c3=c1.sumOfComplexNumbers(c2);
       c3.displayComplexNumber();



}
}