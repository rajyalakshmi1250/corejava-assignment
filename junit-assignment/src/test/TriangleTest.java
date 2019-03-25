package test;
import org.junit.Test;
import main.Triangle;
import static org.junit.Assert.*;
public class TriangleTest{
    @Test
    public void testTriangleWhichIsRightAngle(){
       Triangle triangle = new Triangle(3,4,5);
       assertTrue(triangle.isRightAngle());
    }
    @Test
    public void testTriangleWhichIsNotRightAngle(){
       Triangle triangle = new Triangle(2,4,5);
       assertFalse(triangle.isRightAngle());
    }
    @Test
    public void testTriangleWhichIsIsosceles(){
       Triangle triangle = new Triangle(3,3,5);
       assertTrue(triangle.isIsosceles());
    }
    @Test
    public void testTriangleWhichIsNotIsosceles(){
       Triangle triangle = new Triangle(3,4,5);
       assertFalse(triangle.isIsosceles());
    }
    @Test
    public void testTriangleWhichIsEquilateral(){
       Triangle triangle = new Triangle(3,3,3);
       assertTrue(triangle.isEquilateral());
    }
    @Test
    public void testTriangleWhichIsNotEquilateral(){
       Triangle triangle = new Triangle(3,5,7);
       assertFalse(triangle.isEquilateral());
    }
   @Test
    public void testTriangleWhichIsScalene(){
       Triangle triangle = new Triangle(3,1,5);
       assertTrue(triangle.isScalene());
    }
    @Test
    public void testTriangleWhichIsNotScalene(){
       Triangle triangle = new Triangle(5,4,5);
       assertFalse(triangle.isScalene());
    }
    
}