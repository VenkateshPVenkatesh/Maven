package TestingJenkins;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Country2 {
  @Test
  public void pe() {
	  String name = "Peru";
	  Assert.assertEquals(name, "Peru");
	  System.out.println("The Country is Correct as :  " +name);
  }
  
  @Test
  public void ti() {
	  String name = "Taywan";
	  Assert.assertEquals(name, "Taywan");
	  System.out.println("The Country is Correct as :  " +name);
  }
  @Test
  public void ger() {
	  String name = "Germany";
	  Assert.assertEquals(name, "Germany");
	  System.out.println("The Country is Correct as :  " +name);
  }
  @Test
  public void ang() {
	  String name = "Angola";
	  Assert.assertEquals(name, "Angola");
	  System.out.println("The Country is Correct as :  " +name);
  }
  @Test
  public void ir() {
	  String name = "Iraq";
	  Assert.assertEquals(name, "Iraq");
	  System.out.println("The Country is Correct as :  " +name);
  }
  
}
