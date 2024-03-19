package SecondWebPage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstClass {
	
	@Test
	public void PlantsGuru() {
		System.setProperty("webdrver.chrome.driver", "C:\\Selenium\\Web Driver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.plantsguru.com/index.php?route=account/login");
		driver.manage().window().maximize();
		SecondClassWeb lpage=new SecondClassWeb(driver);
		lpage.username();
		lpage.password();
		lpage.login();
		//driver.quit();
	}

}
