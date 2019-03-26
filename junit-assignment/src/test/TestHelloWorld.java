import static org.junit.Assert.*;
import org.junit.Test;
public class TestHelloWorld {
    String message = "Hello world";
    TestHelloWorld t = new TestHelloWorld(message);

   @Test
     public void testPrintMessage(){
     assertEquals(message,t.printMessage());
  }
   
}