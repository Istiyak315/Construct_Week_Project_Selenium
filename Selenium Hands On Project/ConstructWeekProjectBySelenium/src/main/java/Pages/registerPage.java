package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registerPage {
	WebDriver driver;
	
	//created constructor with classname
	
	public registerPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	//storing the My account locator in a variable
	By MyAcoount=By.cssSelector("[title=\"My Account\"]");
	
	//storing the register locator in a variable
	By register=By.linkText("Register");
	
	//storing the firstname locator in a variable
	By firstname=By.name("firstname");
	
	//storing the lastname locator in a variable
	By lastname=By.name("lastname");
	
	//storing the email locator in a variable
	By email=By.name("email");
	
	//storing the telephone locator in a variable
	By phone=By.name("telephone");
	
	//storing the  password locator in a variable
	By password=By.name("password");
	
	//storing the confirm Password locator in a variable
	By confirmPass=By.name("confirm");
	
	//storing the radio button locator in a variable
	By radio=By.name("newsletter");
	
	//storing the checkbox locator in a variable
	By checkbox=By.name("agree");
	
	//storing the submit button locator in a variable
	By submit=By.cssSelector("[type=\"submit\"]");
	
	
	//created method for My Account
	public void account() {
		driver.findElement(MyAcoount).click();
	}
	
	//created method for register
	public void registering() {
		driver.findElement(register).click();
	}
	
	//created method for firstname
	public void fname(String input) {
		driver.findElement(firstname).sendKeys(input);
	}
	
	//created method for lastname
	public void lname(String input) {
		driver.findElement(lastname).sendKeys(input);
	}
	
	//created method for email
	public void email(String input) {
		driver.findElement(email).sendKeys(input);
	}
	
	//created method for telephone
	public void telephone(String input) {
		driver.findElement(phone).sendKeys(input);
	}
	
	//created method for Password
	public void pswrd(String input) {
		driver.findElement(password).sendKeys(input);
	}
	
	//created method for confirm password
	public void cnfpswrd(String input) {
		driver.findElement(confirmPass).sendKeys(input);
	}
	
	//created method for radio Button
	public void rdio() {
		driver.findElement(radio).click();
	}
	
	//created method for checkbox
	public void ckbox() {
		driver.findElement(checkbox).click();
	}
	
	//created method for submit button


	public void sbmit() {
		// TODO Auto-generated method stub
		driver.findElement(submit).click();
	}
	
}

