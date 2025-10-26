package STADAssignment_AutomationExercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC8_VerifyAllProducts {
	
	WebDriver driver;
	
	
	void pause() throws InterruptedException
	{
		Thread.sleep(2000);
	}
	
	@Test(priority=1)
	void Validation1()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	@Test(priority=2)
	void Validation2()
	{
	   driver.get("https://automationexercise.com/");
	   driver.manage().window().maximize();
	}
	
	@Test(priority=3)
	void Validation3()
	{
		WebElement home=driver.findElement(By.xpath("//a[normalize-space()='Home']"));
		if(home.isEnabled())
		{
			System.out.println("Validation3--- Home Page Visible");
		}
		else
		{
			System.out.println("Validation3---Home Page is not Visible");
		}
	}
	
	@Test(priority=4)
	void Validation4()
	{
		driver.findElement(By.xpath("//a[@href='/products']")).click();
	}
	
	@Test(priority=5)
	void Validation5() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions act = new Actions(driver);
		pause();
	  WebElement mouseoverfirst= driver.findElement(By.xpath("//img[@src='/get_product_picture/1']"));
	  act.moveToElement(mouseoverfirst).perform();
	  
	  if(mouseoverfirst.isDisplayed())
	  {
		  System.out.println("Validation5---Starting product is visible");
	  }
	  
	  else
	  {
		  System.out.println("Validation5---Starting product is not visible");
	  }
	  pause();
	  
	  WebElement mouseoverlast = driver.findElement(By.xpath("//img[@src='/get_product_picture/43']"));
	  js.executeScript("arguments[0].scrollIntoView();", mouseoverlast);
	 
	  act.moveToElement(mouseoverlast).perform();
	  

	  if(mouseoverlast.isDisplayed())
	  {
		  System.out.println("Validation5---Last product is visible");
	  }
	  
	  else
	  {
		  System.out.println("Validation5---Last product is not visible");
	  }
	  
	  
	}
	
	@Test(priority=6)
	void Validation6()
	{
		 WebElement featureproduct= driver.findElement(By.xpath("//div[@class='features_items']"));	
		 if(featureproduct.isDisplayed())
		 {
			 System.out.println("Validation5--- True");
		 }
		 else
		 {
			 System.out.println("Validation5---False");
		 }
	}
	
	@Test(priority=7)
	void Validation7()
	{
		driver.findElement(By.xpath("//a[@href='/product_details/1']")).click();
	}
	
	@Test(priority=8)
	void Validation8()
	{
		WebElement reviewdisplay =driver.findElement(By.xpath("//ul[@class='nav nav-tabs']"));
		if(reviewdisplay.isDisplayed())
		{
			System.out.println("Validation7-Pass!");
		}
		else
		{
			System.out.println("Validation7-Fail!");
		}
	}
	
	@Test(priority=9)
	void Validation9()
	{
		System.out.println("Validate-productname visible");
		WebElement pname=driver.findElement(By.xpath("//h2[normalize-space()='Blue Top']"));
		if(pname.isDisplayed())
		{
			System.out.println("Visible");
		}
		else
		{
			System.out.println("Not Visible");
		}
		System.out.println("Validate-productcategory is visible");
		WebElement category =driver.findElement(By.xpath("//p[normalize-space()='Category: Women > Tops']"));
		if(category.isDisplayed())
		{
			System.out.println("Visible");
		}
		else
		{
			System.out.println("Not Visible");
		}
		
		System.out.println("Validate-productpriceisvisible");
		WebElement price =driver.findElement(By.xpath("//span[normalize-space()='Rs. 500']"));
		if(price.isDisplayed())
		{
			System.out.println("Visible");
		}
		else
		{
			System.out.println("Not visible");
		}
		
		System.out.println("Validate-availibility of product");
		
		WebElement available =driver.findElement(By.xpath("//b[normalize-space()='Availability:']"));
		
		if(available.isDisplayed())
		{
			System.out.println("Visible");
		}
		else
		{
			System.out.println("Not visible");
		}
		
		System.out.println("Validate-Condition of product");
		
		WebElement condition =driver.findElement(By.xpath("//b[normalize-space()='Condition:']"));
		if(condition.isDisplayed())
		{
			System.out.println("Visible");
		}
		else
		{
			System.out.println("Not visible");
		}
		
		System.out.println("Validate Brand");
		
		WebElement brand =driver.findElement(By.xpath("//b[normalize-space()='Brand:']"));
		
		if(brand.isDisplayed())
				{
			 		System.out.println("Visible");
				}
		else
		{
			System.out.println("Not visible");
		}
	}
	
	@Test(priority=10)
	void Validation10() throws InterruptedException
	{
		pause();
		driver.close();
	}

}
