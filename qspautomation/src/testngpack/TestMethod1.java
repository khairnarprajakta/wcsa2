package testngpack;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class TestMethod1 {
  @Test
  public void method1() 
  {
	  Reporter.log("method1 "+Thread.currentThread().getId(),true);

  }
  
  @Test
  public void method2()
  {
	  Reporter.log("method2 "+Thread.currentThread().getId(),true);
  }
}
