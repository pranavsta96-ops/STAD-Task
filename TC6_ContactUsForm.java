package STADAssignment_AutomationExercise;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC6_ContactUsForm {

	WebDriver driver;
	
	//Launching the browser

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
		
		@Test(priority=4)
		void Validation4()
		{
			driver.findElement(By.xpath("//a[normalize-space()='Contact us']")).click();
			System.out.println("Validation4--Pass");
		}
		
		@Test(priority=5)
		void Validation5()
		{
			boolean text=driver.findElement(By.xpath("//h2[normalize-space()='Get In Touch']")).isDisplayed();
			if(text=true)
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
			driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Pranav Singh");
			driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("pranav1@yopmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("QA Automation");
			driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("I Love Coding");
				
		}
		
		@Test(priority=7)
		void Validation7()
		{
			driver.findElement(By.xpath("//input[@name='upload_file']")).sendKeys("C:\\Users\\thaku\\OneDrive\\Desktop\\Pranav Pic 2.jpg");
			System.out.println("Validation7--Pass");
		}
		
		@Test(priority=8)
		void Validation8() throws InterruptedException
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='submit']")).click();
			System.out.println("Validation8--Pass");
		}
		
		@Test(priority=9)
		void Validation9() throws InterruptedException
		{
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			System.out.println("Validation9--Pass");
			
		}
		
		@Test(priority=10)
		void Validation10()
		{
			boolean success=driver.findElement(By.xpath("//div[@class='status alert alert-success']")).isDisplayed();
			if(success=true)
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
			driver.findElement(By.xpath("//span[normalize-space()='Home']")).click();
			Thread.sleep(2000);
			WebElement homeicon =driver.findElement(By.xpath("//i[@class='fa fa-home']"));
			if(homeicon.isEnabled())
			{
				System.out.println("Validation11--Pass");
			}
			else
			{
				System.out.println("Validation11--Fail");
			}
		}
		
		@Test(priority=12)
		void Validation12() throws InterruptedException
		{
			
			driver.close();
		}

}
