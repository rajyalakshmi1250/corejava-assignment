import java.util.*;
public class DistanceTest{
    public static void main(String args[]){
       int feet;
       double inches;
       Scanner sc = new Scanner(System.in);
       Distance d1=new Distance();
       feet=sc.nextInt();
       inches=sc.nextDouble();
       d1.setFeetAndInches(feet,inches);
       d1.displayFeetAndInches();

       Distance d2=new Distance();
       feet=sc.nextInt();
       inches=sc.nextDouble();
       d2.setFeetAndInches(feet,inches);
       d2.displayFeetAndInches();
        
       Distance d3;
       d3=d1.sumOfTwoDistanceVariables(d2);
       d3.displayFeetAndInches();


}


}