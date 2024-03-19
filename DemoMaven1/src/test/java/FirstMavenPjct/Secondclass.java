package FirstMavenPjct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Secondclass {
	WebDriver driver;
	
	public Secondclass(WebDriver driver) {
		this.driver = driver;
	}
	public void username()
	{
		driver.findElement(By.name("email")).sendKeys("vilsy");
	}
	public void password()
	{
		driver.findElement(By.name("pass")).sendKeys("vilsy123");
	}
	public void login()
	{
		driver.findElement(By.name("login")).click();
	}
}
