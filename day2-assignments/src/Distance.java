public class Distance{
    private int feet;
    private double inches;
    public void setFeetAndInches(int feet,double inches){
        this.feet=feet;
        this.inches=inches;
         
     }

    public void displayFeetAndInches(){
      System.out.println("distance in feet "+feet+ "," +inches+ "inches");
     }
     public Distance sumOfTwoDistanceVariables(Distance number){
       Distance d3=new Distance();
       d3.inches=this.inches+number.inches;
       d3.feet = 0;
       if(d3.inches>=10){
        d3.inches=d3.inches-10;
        d3.feet++;
    }
      d3.feet +=this.feet+number.feet;
      return d3;
    }
}