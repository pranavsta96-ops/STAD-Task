package STADAssignment_AutomationExercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC4_LogoutUser {
	WebDriver driver;
	
	
	@Test(priority=1)
	void Validation1()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority=2)
	void Validation2()
	{
		driver.get("https://automationexercise.com/");
		System.out.println("Validation2--Pass");
	}
	
	@Test(priority=3)
	void Validation3()
	{
		WebElement homepageicon =driver.findElement(By.xpath("//i[@class='fa fa-home']"));
		
		if(homepageicon.isEnabled())
		{
			System.out.println("Validation3--Pass");
		}
		else
		{
			System.out.println("Validation3--Fail");
		}
	}


		@Test(priority=4)
		void Validation4() throws InterruptedException
		{
			driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
			System.out.println("Validation4--Pass");
		}
		
		@Test(priority=5)
		void Validation5() throws InterruptedException
		{
			WebElement logindisplays=driver.findElement(By.xpath("//h2[normalize-space()='Login to your account']"));
			if(logindisplays.isDisplayed())
			{
				System.out.println("Validation5--Pass");
			}
			else
			{
				System.out.println("Validation5--Fail");
			}
		}
	
	@Test(priority=6)
	void Validation6()
	{	
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("dummy@yopmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Abcd@1234");
		System.out.println("Validation6--Pass");	
	}
	
	
		@Test(priority=7)
		void Validation7()
		{
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
			System.out.println("Validation7--Pass");
		}
	
	@Test(priority=8)
	void Validation8()
	{
		WebElement loggedintext=driver.findElement(By.xpath("//li[10]//a[1]"));
		if(loggedintext.isDisplayed())
		{
			System.out.println("Validation7--Pass");
		}
		else
		{
			System.out.println("Validation7--Fail");
		}
	}
	
	@Test(priority=9)
	void Validation9()
	{
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		System.out.println("Validation9--Pass");
	}
	
	@Test(priority=10)
	void Validation10()
	{
		boolean displaylogin=driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).isDisplayed();
		if(displaylogin=true)
		{
			System.out.println("Validation10--Pass");
		}
		else
		{
			System.out.println("Validation10--Fail");
		}
	}
	
	@Test(priority=11)
	void Validation11() throws InterruptedException
	{
		driver.quit();
		System.out.println("Validation11--Pass");
	}
	
	
		
	

}
