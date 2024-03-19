package FirstMavenPjct;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstMavenPjct {
	
	@Test
	public void Facebook() {
		System.setProperty("webdrver.chrome.driver", "C:\\Selenium\\Web Driver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Secondclass lpage=new Secondclass(driver);
		lpage.username();
		lpage.password();
		lpage.login();
		}

}
