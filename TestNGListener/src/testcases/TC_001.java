package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listener.ModifyListener;

@Listeners(ModifyListener.class)
public class TC_001 {

	@Test
	public void tc001() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.theTestingWorld.com");
	}
}
