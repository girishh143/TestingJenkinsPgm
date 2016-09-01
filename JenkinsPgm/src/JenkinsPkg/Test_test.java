package JenkinsPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_test {

	
	@org.testng.annotations.Test
	public void testMathod(){
		System.out.println("Instance is running===");
		System.out.println("Instance is running===");
		System.out.println("Instance is running===");
		System.out.println("Instance is running===");
		System.out.println("Instance is running===");
		 
		 WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.getTitle();
		driver.getCurrentUrl();
 	}
	
}
