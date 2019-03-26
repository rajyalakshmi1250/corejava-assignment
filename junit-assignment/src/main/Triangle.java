package main;
public class Triangle{
      private int side1;
      private int side2;
      private int side3;

      public Triangle(){
     }

      public Triangle(int side1,int side2,int side3){
      this.side1=side1;
      this.side2=side2;
      this.side3=side3;
     }
      public boolean isRightAngle(){
      int hypotenues;
      int perpendicular;
      int base;

      if(side1>side2 && side1>side3){
      hypotenues=side1;
      perpendicular=side2;
      base=side3;
     }
  else if(side2>side3 && side2>side1){
       hypotenues=side2;
       perpendicular=side1;
       base=side3;
     }
  else {
       hypotenues=side3;
       perpendicular=side1;
       base=side2;
     }
   
   if(hypotenues*hypotenues == perpendicular*perpendicular +base*base){
       return true;
    }
   else {
       return false;
        }
   


    }
     public boolean isIsosceles(){
     if(side1 == side2 || side1==side3 || side2==side3){
       return true;
        }
   else{
       return false;
        }
   }
     public boolean isEquilateral(){
     if(side1 == side2 || side2==side3 || side3==side1){
       return true;
        }
   else{
       return false;
        }
   }
     public boolean isScalene(){
     if(side1 != side2 && side2!=side3 && side3!=side1){
       return true;
        }
   else{
       return false;
        }
   }
   
}
