package try_catch;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
		
		  try { int a = 5/0; System.out.println(a);
		  
		  } catch (ArithmeticException e) { e.printStackTrace(); }
		 
//	  int a = 5/0; System.out.println(a);
	  System.out.println("hi");
  }
}
