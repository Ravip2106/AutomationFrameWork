package DataDrivenFramework;

import java.io.IOException;

import org.apache.commons.math3.geometry.spherical.twod.Edge;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login implements  IAutoConstrant{
	static WebDriver driver;

	public static void main(String[] args) throws IOException{
   Flib lib=new Flib();
   String browser=Flib.getDataFromProperty(PROP_PATH, BROWSER);
       String url= Flib.getDataFromProperty(PROP_PATH,URL );
       if(browser.equals("chrome")) 
    	   driver=new ChromeDriver();
       else if(browser.equals("firefox"))
    	   driver=new FirefoxDriver();
       else if(browser.equals("edge"))
    	   driver=new EdgeDriver();
       else
    	   System.out.println("Invalid Browser");
       driver.manage().window().maximize();
       driver.get(url);
		

	}

}
