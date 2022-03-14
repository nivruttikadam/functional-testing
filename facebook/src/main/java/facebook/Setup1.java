package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup1 {
	public static WebDriver initDriver() {
		WebDriver driver = new ChromeDriver();
		return driver;
		
	}
}
