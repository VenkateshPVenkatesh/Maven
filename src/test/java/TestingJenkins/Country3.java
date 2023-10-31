package TestingJenkins;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Country3 {
  @Test
  public void hi() {
	  String name = "Haiti";
	  Assert.assertEquals(name, "Haiti");
	  System.out.println("The Country is Correct as :  " +name);
  }
  
  @Test
  public void to() {
	  String name = "Togo";
	  Assert.assertEquals(name, "Togo");
	  System.out.println("The Country is Correct as :  " +name);
  }
  @Test
  public void nor() {
	  String name = "Norway";
	  Assert.assertEquals(name, "Norway");
	  System.out.println("The Country is Correct as :  " +name);
  }
  @Test
  public void il() {
	  String name = "Ireland";
	  Assert.assertEquals(name, "Ireland");
	  System.out.println("The Country is Correct as :  " +name);
  }
  @Test
  public void kw() {
	  String name = "Kuwait";
	  Assert.assertEquals(name, "Kuwait");
	  System.out.println("The Country is Correct as :  " +name);
  }
  
}
