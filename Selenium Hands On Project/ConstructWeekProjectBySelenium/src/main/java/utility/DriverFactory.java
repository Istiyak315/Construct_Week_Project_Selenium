package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	 static WebDriver driver;
	
	public static WebDriver getDriver(String driverName) {
		
		if(driverName.equals(DriverNames.CHROME)) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
	}

}
