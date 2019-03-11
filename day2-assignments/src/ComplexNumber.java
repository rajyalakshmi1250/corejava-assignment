import java.util.Scanner;
public class ComplexNumber{
    public static void main(String args[]){
       double real;
       double imaginary;
       Scanner sc = new Scanner(System.in);
       Complex c1=new Complex();
       real=sc.nextDouble();
       imaginary=sc.nextDouble();
       c1.setRealAndImaginary(real,imaginary);
       c1.displayComplexNumber();

       Complex c2=new Complex();
       real=sc.nextDouble();
       imaginary=sc.nextDouble();
       c2.setRealAndImaginary(real,imaginary);
       c2.displayComplexNumber();

       Complex c3;
       c3=c1.sumOfComplexNumbers(c2);
       c3.displayComplexNumber();



}
}