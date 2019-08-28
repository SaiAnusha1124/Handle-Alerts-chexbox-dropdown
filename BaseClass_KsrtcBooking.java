package automationjar.session;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass_KsrtcBooking
{
	private WebDriver driver;
	@Test(priority = 0)
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saianusha.podichervu\\eclipse-workspace\\Automation.jar\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ksrtc.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test(priority = 2)
	public void searchBus() 
	{
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']")).click();
	}
	@Test(priority = 3)
	public void acceptalert() 
	{
		Alert a = driver.switchTo().alert();
		System.out.println("Alert statement is:" + a.getText());
		a.accept();
	}
	@Test(priority = 4)
	public void selectingCheckBox() 
	{
		driver.findElement(By.xpath("//div[@class='custom-control custom-checkbox pt-2']")).click();
	}
	@Test(priority=5)
	public void departuredate()
	{
		driver.findElement(By.xpath("//input[@name=\"txtJourneyDate\"]")).click();
	}
	@Test(priority=6)
	public void returndate()
	{
		driver.findElement(By.xpath("//input[@name=\"txtReturnJourneyDate\"]")).click();
	}
	public WebDriver getDriver()
	{
		return this.driver;
	}
}
