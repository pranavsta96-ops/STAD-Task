package STADAssignment_AutomationExercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC5_AlreadyRegisteredUserSignIN {
	
    WebDriver driver;
    
    @Test(priority=1)
	void Validation1()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Test Validations");
		System.out.println("Validation1--Pass");

	}
	
	//opening the url
	@Test(priority=2)
	void Validation2()
	{
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		
		System.out.println("Validation2--Pass");
	}

	//homebutton enable
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


	//click on signup/signin button
	@Test(priority=4)
	void Validation4() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
		System.out.println("Validation4--Pass");
	}
	
	@Test(priority=5)
	void Validation5()
	{
		WebElement signuptext =driver.findElement(By.xpath("//h2[normalize-space()='New User Signup!']"));
		if(signuptext.isDisplayed())
		{
			System.out.println("Validation5--Pass");
		}
		else
		{
			System.out.println("Vaslidation5--Fail");
		}
		
	}
	
	@Test(priority=6)
	void Validation6() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Pranav Singh");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("dummy@yopmail.com");
			
	}
	
	@Test(priority=7)
	void Validation7()
	{
		driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();
		System.out.println("Validation7--Pass");
	}
	
	@Test(priority=8)
	void Validation8() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean errortext =driver.findElement(By.xpath("//p[normalize-space()='Email Address already exist!']")).isDisplayed();
		if(errortext=true)
		{
			System.out.println("Validation8--Pass");
		}
		else
		{
			System.out.println("Validation8--Fail");
		}
	}
		
		@Test(priority=9)
		void Validation9()
		{
			driver.close();
		}
		
}
	





