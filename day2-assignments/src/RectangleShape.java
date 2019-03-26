import java.util.*;
public class RectangleShape{
     public static void main(String args[]){
       double length;
       double breadth;  
 
        Scanner sc = new Scanner(System.in);

        length=sc.nextDouble();
        breadth=sc.nextDouble(); 
       
        Rectangle r = new Rectangle(length,breadth);
        r.areaOfRectangle();  
        r.perimeterOfRectangle();
        System.out.println(r.tostring());
        
         length=sc.nextDouble();
         breadth=sc.nextDouble(); 

        Rectangle r1 = new Rectangle(length,breadth);
        r1.areaOfRectangle();  
        r1.perimeterOfRectangle();
        System.out.println(r1.tostring());  
       
        if(r.areaOfRectangle()==r1.areaOfRectangle()) 
        System.out.println("Area of Rectangle are same");
     else
         
        System.out.println("Area of Rectangle are not same");
}
}