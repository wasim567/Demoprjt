package Pgobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpageobjects {

	
 WebDriver driver;
 public Loginpageobjects(WebDriver driver) {
	 this.driver=driver;
	// TODO Auto-generated constructor stub
}




	private By loginlink=By.xpath("//*[@id='homepage']/header/div[1]/div/nav/ul/li[4]/a");
	private By emailid=By.id("user_email");
	private By pwd=By.id("user_password");
	private By login=By.cssSelector("input[value='Log In']");
	private By popup=By.xpath("//button[text()='NO THANKS']");
	
	
	public WebElement Loginlink(){
		return driver.findElement(loginlink);
		
		
	}
	
	public WebElement Emailid(){
		return driver.findElement(emailid);
		
		
	}
	public WebElement Password(){
		return driver.findElement(pwd);
		
		
	}
	public int popupsize(){
		return driver.findElements(popup).size();
	}
	public WebElement popup(){
		return driver.findElement(popup);	
	}
	
	public WebElement Login(){
		return driver.findElement(login);
		
		
	}
	
	

}
