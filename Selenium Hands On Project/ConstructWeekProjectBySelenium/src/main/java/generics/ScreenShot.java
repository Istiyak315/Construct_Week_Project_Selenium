package generics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	WebDriver driver;
	public ScreenShot(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void ss(String filename) throws IOException {
		String path="C:\\Users\\singh\\Desktop\\Construct Weak Project\\screenshots\\snaps\\";
		
		
		
			TakesScreenshot screenshot=(TakesScreenshot) driver;
			File file=screenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File(path+filename+".png"));
		
	}

}
