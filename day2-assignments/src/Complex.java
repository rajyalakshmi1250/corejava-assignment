public class Complex{
    private double real;
    private double imaginary;
      public void setRealAndImaginary(double real, double imaginary){
      this.real = real;
      this.imaginary = imaginary;
}
    
    public void displayComplexNumber(){
       System.out.println("complex number = "+real+ " + " + "i" +"("+imaginary + ")");
   }
    public Complex sumOfComplexNumbers(Complex c){
       Complex c3= new Complex();    
        c3.real=this.real+c.real;
        c3.imaginary=this.imaginary+c.imaginary;
        return c3;
   }
}
