package TestingJenkins;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Country1 {
  @Test
  public void fin() {
	  String name = "Finland";
	  Assert.assertEquals(name, "Finland");
	  System.out.println("The Country is Correct as :  " +name);
  }
  
  @Test
  public void sco() {
	  String name = "Scotland";
	  Assert.assertEquals(name, "Scotland");
	  System.out.println("The Country is Correct as :  " +name);
  }
  @Test
  public void ger() {
	  String name = "Germany";
	  Assert.assertEquals(name, "Germany");
	  System.out.println("The Country is Correct as :  " +name);
  }
  @Test
  public void eg() {
	  String name = "Egypt";
	  Assert.assertEquals(name, "Egypt");
	  System.out.println("The Country is Correct as :  " +name);
  }
  @Test
  public void spa() {
	  String name = "Spain";
	  Assert.assertEquals(name, "Spain");
	  System.out.println("The Country is Correct as :  " +name);
  }
  
}
