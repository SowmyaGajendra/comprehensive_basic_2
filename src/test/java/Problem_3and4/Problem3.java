package Problem_3and4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Problem3 extends BaseClass
{
	
	
	
	@Test(priority = 1)
	public void logverify()
	{
		WebElement log = driver.findElement(By.xpath("//div[@class='coh-container nav-logo-wrap']//img"));
		
		if(log.isDisplayed())
		{
			System.out.println("Automation Any Where Log in Present on the web Page");
		}
		else
		{
			System.out.println("Automation Any where log is not Present on the Web page");
		}

	}

	@Test(priority = 2)
	public void verifyRequestDemoButton()
	{
		WebElement requestDemoButton = driver.findElement(By.xpath("(//div[@class='banner-cta-box']/a)[1]"));
		
		if(requestDemoButton.isDisplayed())
		{
			System.out.println("Request Demo Button is present on the Page");
		}
		else
		{
			System.out.println("Request Demo Button is not Present on the Page");
		}
	}

	@Test(priority = 3)
	public void verifyRequestDemoButtonIsClickableOrNot()
	{
		WebElement requestDemoButton = driver.findElement(By.xpath("(//div[@class='banner-cta-box']/a)[1]"));
		
		if(requestDemoButton.isEnabled())
		{
			System.out.println("Request Demo Button is able to Click");
		}
		else
		{
			System.out.println("Request Demo button is present but not able to click");
		}

	}

}


