package STADAssignment_AutomationExercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC1_RegisterUser {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	void pause() throws InterruptedException
	{
		Thread.sleep(1000);
	}
	
	@Test(priority=1)
	void Validation1()   //working
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
	}
	
	@Test(priority=2)

	void Validation2()  //working
	{
		driver.get("https://automationexercise.com/products");
		driver.manage().window().maximize();
	}
	
	@Test(priority=3)

	void Validation3() //Working
	{
		
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).isEnabled();
		
		
	}
	
	@Test(priority=4)

	void Validation4() //working
	{
		driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
	}
	
	@Test(priority=5)

	void Validation5() //working
	{
		driver.findElement(By.xpath("//h2[normalize-space()='New User Signup!']")).isDisplayed();
	}
	
	@Test(priority=6)

	void Validation6()  //working
	{
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("MS Dhoni");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("mahi007@yopmail.com");
	}
	
	@Test(priority=7)

	void Validation7()  //working
	{
		driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();
	}
	
	@Test(priority=8)

	void Validation8() throws InterruptedException 
	{
		pause();
		driver.findElement(By.xpath("//input[@value='MS Dhoni']")).isDisplayed(); pause();
		driver.findElement(By.xpath("//input[@value='mahi007@yopmail.com'][1]")).isDisplayed();
		
	}
	
	@Test(priority=9)

	void Validation9() throws InterruptedException
	{

		pause();
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click(); pause();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Abcd@1234"); pause();
		
		Select days= new Select(driver.findElement(By.xpath("//select[@id='days']")));
		Select months = new Select(driver.findElement(By.xpath("//select[@id='months']")));
		Select years = new Select(driver.findElement(By.xpath("//select[@id='years']")));
		
		days.selectByVisibleText("7"); pause();
		months.selectByVisibleText("July"); pause();
		years.selectByVisibleText("1981"); pause();
			
	}
	
	@Test(priority=10)

	void Validation10()
	{
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
	}
	
	@Test(priority=11)

	void Validation11()
	{
		driver.findElement(By.xpath("//input[@id='optin']")).click();
	}
	
	@Test(priority=12)

	void Validation12() throws InterruptedException
	{
		pause();
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Mahendra Singh"); pause();
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Dhoni"); pause();
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Chennai Super Kings"); pause();
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Kailash Bhawan"); pause();
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("RingRoad"); pause();
		
		Select country = new Select(driver.findElement(By.xpath("//select[@id='country']")));
		country.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Jharkhand"); pause();
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Ranchi"); pause();
		driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("834005"); pause();
		driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("9229227922"); pause();
		
	}
	
	@Test(priority=13)

	void Validation13() throws InterruptedException
	{
		pause();
		driver.findElement(By.xpath("//button[normalize-space()='Create Account']")).click(); 
	}
	
	@Test(priority=14)

	void Validation14() throws InterruptedException
	{
		pause();
		driver.findElement(By.xpath("//b[normalize-space()='Account Created!']")).isDisplayed();
	}
	
	@Test(priority=15)

	void Validation15() throws InterruptedException
	{
		pause();
		driver.findElement(By.xpath("//a[normalize-space()='Continue']")).click();
	}
	
	@Test(priority=16)

	void Validation16() throws InterruptedException
	{
		pause();
		driver.findElement(By.xpath("//b[normalize-space()='MS Dhoni']")).isDisplayed();
	}
	
	@Test(priority=17)

	void Validation17() throws InterruptedException
	{
		pause();
		driver.findElement(By.xpath("//a[normalize-space()='Delete Account']")).click();
	}
	
	@Test(priority=18)

	void Validation18() throws InterruptedException
	{
		pause();
		driver.findElement(By.xpath("//b[normalize-space()='Account Deleted!']")).isDisplayed();
	}
	
	@Test(priority=19)
	void Validation19()
	{
		driver.close();
	}

}
