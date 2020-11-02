package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;
	  public Properties prop;
		
	    
		public WebDriver Initializebrowser() throws IOException{
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\Data.properties");
			prop=new Properties();
			
		    
		    prop.load(fis);
		
	    String browsername=System.getProperty("browser");
	    
	    if(browsername.contains("Chrome")){
	    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\Pgobjects\\chromedriver.exe");
	    	ChromeOptions options=new ChromeOptions();
	    	if(browsername.contains("headless")){
	    	options.addArguments("headless");
	    	}
	    	driver=new ChromeDriver(options);
	    }
	    else if(browsername.equalsIgnoreCase("ie")){
	    	driver =new EdgeDriver();
	    	
	    }
	    else if(browsername.equalsIgnoreCase("firefox")){
	    	driver=new FirefoxDriver();
	    }
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    
	   return driver;
	    
		}

}
