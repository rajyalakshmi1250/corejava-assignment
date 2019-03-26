
public class Employee{
	
	
         	 private int employeeid;
          	 private String employeename;
           	 private double monthlyBasic;

            	 
            	 private static double pf=0.10;
             	 private static double esic=0.0475;
                 private static double hra= 0.50;
             	 private static int conveyance = 800;
             	 private static int medical = 1250 ;

       		
  
        

        public Employee(int employeeid, String employeename, double monthlyBasic){
            this.employeeid=employeeid;
            this.employeename=employeename;
            this.monthlyBasic=monthlyBasic;
    }
    
     	 public double getAnnualBasic(){
        	 return (12 * monthlyBasic);
          
    }
      	 public double getMonthlyGrossSalary(){
                 
         	 return (monthlyBasic +(hra *monthlyBasic) + medical + conveyance);
    }
       	 public double getAnnualGrossSalary(){
        	 return 12 * getMonthlyGrossSalary();

    }
   	 public double getMonthlyDeductions(){
                double monthlyDeductions = 0;
                if(getMonthlyGrossSalary() <= 10000)
                monthlyDeductions = monthlyDeductions+50;
              else
                monthlyDeductions = monthlyDeductions+100;
                if(monthlyBasic<=5000)
                monthlyDeductions = monthlyDeductions+(esic *monthlyBasic);
                 monthlyDeductions = monthlyDeductions+(pf *monthlyBasic);
      		return monthlyDeductions;
 
    }
       	 public double getMonthlyTakeHome(){
     		 return (getMonthlyGrossSalary() - getMonthlyDeductions());

    }
    	 public double getAnnualTakeHome(){
     		 return 12 *getMonthlyTakeHome();

    }
}
    

	