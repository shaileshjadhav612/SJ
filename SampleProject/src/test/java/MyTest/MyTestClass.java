package MyTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTestClass {

	WebDriver driver;
	@Test(priority=1)
	public void  SampleMethods()
	{
		
		
		Assert.assertTrue(false);
	}
	@Test(priority=0)
	public void sample2()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.close();
		
	}
	

}
