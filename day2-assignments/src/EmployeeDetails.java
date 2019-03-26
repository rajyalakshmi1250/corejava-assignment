import java.util.Scanner;
public class EmployeeDetails{
      public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
                 int employeeid;
          	 String employeename;
           	 double monthlyBasic;

           employeeid = sc.nextInt();
           employeename = sc.next();
           monthlyBasic = sc.nextDouble();	
    	   Employee e = new Employee(employeeid, employeename, monthlyBasic);

     	   double annualBasic = e.getAnnualBasic();
     	   System.out.println("AnnualBasic" + annualBasic);

      	   double monthlyGrossSalary= e.getMonthlyGrossSalary();
     	   System.out.println("MonthlyGrosssalary" + monthlyGrossSalary);

     	   double annualGrossSalary= e.getAnnualGrossSalary();
     	   System.out.println("AnnualGrosssalary" + annualGrossSalary);

    	   double monthlyDeductions= e.getMonthlyDeductions();
    	   System.out.println("MonthlyDeductions" + monthlyDeductions);

     	   double monthlyTakeHome= e.getMonthlyTakeHome();
    	   System.out.println("MonthlyTakeHome" + monthlyTakeHome);

    	   double annualTakeHome= e.getAnnualTakeHome();
    	   System.out.println("AnnualTakeHome" + annualTakeHome);
}
}
     
     
