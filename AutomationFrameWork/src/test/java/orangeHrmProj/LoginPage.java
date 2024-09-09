package orangeHrmProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage (WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")
	private WebElement usnTextField;
	
	@FindBy(name="password")
	private WebElement pwdTextField;
	
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement loginButton;

	public WebElement getUsnTextField() {
		return usnTextField;
	}

	public WebElement getPwdTextField() {
		return pwdTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
}
