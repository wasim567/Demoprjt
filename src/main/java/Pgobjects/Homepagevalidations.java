package Pgobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepagevalidations {
	
 WebDriver driver;
 public Homepagevalidations(WebDriver driver) {
	 this.driver=driver;
	// TODO Auto-generated constructor stub
}




	private By loginvalidate=By.xpath("//div[@class='text-center']/h2");
	
	
	public WebElement Loginvalidate(){
		return driver.findElement(loginvalidate);
		
	}

}
