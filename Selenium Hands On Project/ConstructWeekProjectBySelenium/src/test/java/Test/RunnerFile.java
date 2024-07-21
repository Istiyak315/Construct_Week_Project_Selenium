package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pages.CameraPage;
import Pages.DesktopPage;
import Pages.MobilePage;
import Pages.Mp3PlayerPage;
import Pages.registerPage;
import generics.ScreenShot;
import utility.DriverFactory;
import utility.DriverNames;

public class RunnerFile {
	
	WebDriver driver;
	ScreenShot sshot;
	ExtentHtmlReporter htmlreporter;
	ExtentReports extnt;
	ExtentTest test;
	
	@BeforeTest
	public void bt() {
		driver=DriverFactory.getDriver(DriverNames.CHROME);
		
		
		driver.get("https://tutorialsninja.com/demo/");
		htmlreporter=new ExtentHtmlReporter("extent.html");
		extnt=new ExtentReports();
		extnt.attachReporter(htmlreporter);
		sshot=new ScreenShot(driver);
		
	}
	
	@Test(enabled = false)
	public void signup() throws IOException {
		
		test=extnt.createTest("Test Report");
		
		
		registerPage page=new registerPage(driver);
		
		//clicking on my account
		test.info("clicking my account");
		page.account();
		sshot.ss("clicking my account");
				
		//clicking on register
		test.info("clicking on register");
		page.registering();
				
		sshot.ss("signup page");
		//entering value in first name 
		test.info("entering value in first name");
		page.fname("Naruto");
				
		//entering value in last name
		test.info("entering value in last name");
		page.lname("suzumika");
				
		//entering value in telephone
		test.info("entering value in phone");
		page.telephone("7249683968");
				
		//entering value in email
		test.info("entering value in email");
		page.email("sistiyak316@gmail.com");
			
		//entering value in password
		test.info("entering value in password");
		page.pswrd("774583");
			
		//entering value in confirm password
		test.info("entering value in confirm password");
		page.cnfpswrd("774583");
				
		//clicking on subscribe radio button
		test.info("clicking on subscribe radio button");
		page.rdio();
				
		//clicking on privacy checkbox
		test.info("clicking on privacy checkbox");
		page.ckbox();
				
		//clicking submit button
		test.info("clicking on submit button");
		page.sbmit();
		
		test.info("Account created succesfully");
		sshot.ss("registered succesfully");
		
		
		
	}
	
	@Test 
	public void mobile() throws InterruptedException, IOException {
		
		test=extnt.createTest("Test Report");
		
        MobilePage page=new MobilePage(driver);
		
		Thread.sleep(2000);
		//entering the value in searchbox
		test.info("searching iphone");
		page.textfilled("iphone");
		
		
		
		Thread.sleep(2000);
		//clicking on searchbutton
		test.info("clicking on searchbutton");
		page.search();
		
		Thread.sleep(2000);
		//selecting product
		test.info("clicking on product");
		page.select();
		
		//title is storing in the variable
        String res = driver.getTitle();      
        
        //for assertion have created object
        SoftAssert sa = new SoftAssert();
        
        //assertion between expected and actual value
        sa.assertEquals("iPhone",res);
        
        //if assertion is passed then message will print in the console
        System.out.println("iphone Found - Assertion Successful");
        sa.assertAll();

        //screennshot taking
		sshot.ss("Iphone");
		
		Thread.sleep(2000);
		//clicking on add to cart
		test.info("clicking on add to cart");
		page.Cart();
		
		Thread.sleep(2000);
		//clicking on shopping cart
		test.info("clicking on shopping cart");
		page.shopping();
		
		Thread.sleep(2000);
		
		test.info("searching next product");
	}
	
	@Test
	public void laptop() throws InterruptedException, IOException {
		
        test=extnt.createTest("Test Report");
		
        DesktopPage page=new DesktopPage(driver);
		
		Thread.sleep(2000);
		//entering the value in searchbox
		test.info("searching macbook");
		page.textfilled("macbook");
		
		
		
		Thread.sleep(2000);
		//clicking on searchbutton
		test.info("clicking on searchbutton");
		page.search();
		
		Thread.sleep(2000);
		//selecting product
		test.info("clicking on product");
		page.select();

        //screennshot taking
		sshot.ss("MacBook Pro");
		
		//title is storing in the variable
        String res = driver.getTitle();      
        
        //for assertion have created object
        SoftAssert sa = new SoftAssert();
        
        //assertion between expected and actual value
        sa.assertEquals("MacBook Pro",res);
        
        //if assertion is passed then message will print in the console
        System.out.println("MacBook Pro Found - Assertion Successful");
        sa.assertAll();
		
		Thread.sleep(2000);
		//clicking on add to cart
		test.info("clicking on add to cart");
		page.Cart();
		
		Thread.sleep(2000);
		//clicking on shopping cart
		test.info("clicking on shopping cart");
		page.shopping();
		
		Thread.sleep(2000);
		
		test.info("searching next product");
		
	}
	
	@Test
	public void Camera() throws InterruptedException, IOException {
		
        test=extnt.createTest("Test Report");
		
        CameraPage page=new CameraPage(driver);
		
		Thread.sleep(2000);
		//entering the value in searchbox
		test.info("searching camera");
		page.textfilled("Nikon");
		
		Thread.sleep(2000);
		//clicking on searchbutton
		test.info("clicking on searchbutton");
		page.search();
		
		Thread.sleep(2000);
		//selecting product
		test.info("clicking on product");
		page.select();

        //screennshot taking
		sshot.ss("Nikon");
		
		//title is storing in the variable
        String res = driver.getTitle();      
        
        //for assertion have created object
        SoftAssert sa = new SoftAssert();
        
        //assertion between expected and actual value
        sa.assertEquals("Nikon D300",res);
        
        //if assertion is passed then message will print in the console
        System.out.println("Camera Found - Assertion Successful");
        sa.assertAll();
		
		Thread.sleep(2000);
		//clicking on add to cart
		test.info("clicking on add to cart");
		page.Cart();
		
		
		
		Thread.sleep(2000);
		//clicking on shopping cart
		test.info("clicking on shopping cart");
		page.shopping();
		
		
		Thread.sleep(2000);
		
		test.info("searching next product");
	}
	
	@Test
	public void mp3() throws InterruptedException, IOException {
		
        test=extnt.createTest("Test Report");
		
        Mp3PlayerPage page=new Mp3PlayerPage(driver);
		
		Thread.sleep(2000);
		//entering the value in searchbox
		test.info("searching ipod");
		page.textfilled("ipod");
		
		
		
		Thread.sleep(2000);
		//clicking on searchbutton
		test.info("clicking on searchbutton");
		page.search();
		
		Thread.sleep(2000);
		//selecting product
		test.info("clicking on product");
		page.select();
		
		//title is storing in the variable
        String res = driver.getTitle();      
        
        //for assertion have created object
        SoftAssert sa = new SoftAssert();
        
        //assertion between expected and actual value
        sa.assertEquals("iPod Shuffle",res);
        
        //if assertion is passed then message will print in the console
        System.out.println("iPod Found - Assertion Successful");
        sa.assertAll();

        //screennshot taking
		sshot.ss("iPod");
		
		Thread.sleep(2000);
		//clicking on add to cart
		test.info("clicking on add to cart");
		page.Cart();
		
		Thread.sleep(2000);
		
		
		//clicking on shopping cart
		test.info("clicking on shopping cart");
		page.shopping();
		sshot.ss("Shopping Cart");
		
		Thread.sleep(2000);
		
		test.info("searching next product");
	}
	
	@AfterTest
	public void close() {
		
		driver.quit();
		extnt.flush();
	}
}
	


