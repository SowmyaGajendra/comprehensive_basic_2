package Problem_3and4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	public ChromeDriver driver;
	@BeforeClass
	public void automationAnyWhere() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.automationanywhere.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
