package STADAssignment_AutomationExercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC7_VerifyTestCasePage {
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

	@Test(priority=4)
	void Validation4() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Test Cases')]")).click();
		System.out.println("Validation4--Pass");
	}
	
	@Test(priority=5)
	void Validation5()
	{
		boolean testcasetext =driver.findElement(By.xpath("//b[normalize-space()='Test Cases']")).isDisplayed();
		if(testcasetext=true)
		{
			System.out.println("Validation5--Pass");
		}
		else
		{
			System.out.println("Validation5--Fail");
		}
	}


}
