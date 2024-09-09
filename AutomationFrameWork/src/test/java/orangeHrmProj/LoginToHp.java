package orangeHrmProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToHp {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginPage lp=new LoginPage(driver);
		lp.getUsnTextField().sendKeys("Admin");
		lp.getPwdTextField().sendKeys("admin123");
		lp.getLoginButton().click();

	}

}
