package SecondWebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecondClassWeb {
WebDriver driver;
	
	public SecondClassWeb(WebDriver driver){
		this.driver = driver;
	}
	public void username()
	{
		driver.findElement(By.id("input-email")).sendKeys("vilsy@gmail.com");
	}
	public void password()
	{
		driver.findElement(By.name("password")).sendKeys("vilsy123");
	}
	public void login()
	{
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input[1]")).click();
	}
}
