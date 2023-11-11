package Problem_3and4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Problem4 extends BaseClass
{
	
	@Test(priority = 1,enabled = true)
	public void verifyProductLink()
	{
		WebElement products = driver.findElement(By.xpath("(//ul[@class='coh-menu-list-container coh-unordered-list menu-level-1 coh-ce-646fa54d']/li)[1]"));
		
		if(products.isDisplayed())
		{
			System.out.println("Products link is present");
		}
		else
		{
			System.out.println("Products link is not present");
		}
	}
	
	@Test(priority = 2,enabled = false)
	public void verifySolutionLink()
	{
		WebElement solutions = driver.findElement(By.xpath("(//ul[@class='coh-menu-list-container coh-unordered-list menu-level-1 coh-ce-646fa54d']/li)[2]"));
		
		if(solutions.isDisplayed())
		{
			System.out.println("Solutions link is present");
		}
		else
		{
			System.out.println("Solutions link is not present");
		}
	}
	
	@Test(priority = 4,enabled = true)
	public void verifyResoursesLink()
	{
		WebElement resourses = driver.findElement(By.xpath("(//ul[@class='coh-menu-list-container coh-unordered-list menu-level-1 coh-ce-646fa54d']/li)[3]"));
		
		if(resourses.isDisplayed())
		{
			System.out.println("Resourses link is present");
		}
		else
		{
			System.out.println("Resourses link is not present");
		}
	}
	
	@Test(priority = 3,enabled = true)
	public void verifyBeyondrpaLink()
	{
		WebElement beyondrpa = driver.findElement(By.xpath("(//ul[@class='coh-menu-list-container coh-unordered-list menu-level-1 coh-ce-646fa54d']/li)[4]"));
		
		if(beyondrpa.isDisplayed())
		{
			System.out.println("beyondrpa link is present");
		}
		else
		{
			System.out.println("beyondrpa link is not present");
		}
	}
	
	@Test(priority = 5,enabled = true,timeOut = 1000)
	public void verifyCompanyLink()
	{
		WebElement company = driver.findElement(By.xpath("(//ul[@class='coh-menu-list-container coh-unordered-list menu-level-1 coh-ce-646fa54d']/li)[5]"));
		
		if(company.isDisplayed())
		{
			System.out.println("company link is present");
		}
		else
		{
			System.out.println("company link is not present");
		}
	}
	

}
