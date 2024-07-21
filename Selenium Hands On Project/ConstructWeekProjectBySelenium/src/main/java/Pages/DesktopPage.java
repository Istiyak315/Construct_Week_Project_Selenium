package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DesktopPage {
	
	WebDriver driver;
	
	//created constructor with classname
	
	public DesktopPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	//storing the searchBox locator in a variable
	By SearchBox=By.name("search");
	
	//storing the search button locator in a variable
	By searchicon=By.xpath("//button[@class='btn btn-default btn-lg']");
	
	//storing the product locator in a variable
	By selectProduct=By.linkText("MacBook Pro");
	
	//storing the Add to cart locator in a variable
	By addToCart=By.id("button-cart");
	
	//storing the Shopping cart locator in a variable
	By shoppingCart=By.linkText("shopping cart");
	
	//created method for search box
	public void textfilled(String input) {
		driver.findElement(SearchBox).sendKeys(input);
	}
	
	//created method for search button
	public void search() {
		driver.findElement(searchicon).click();
	}
	
	//created method for product
	public void select() {
		driver.findElement(selectProduct).click();
	}
	
	//created method for add to cart
	public void Cart() {
		driver.findElement(addToCart).click();
	}
	
	//created method for shopping cart
	public void shopping() {
		driver.findElement(shoppingCart).click();
	}
}

