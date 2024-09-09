package LearningPomPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	
	@FindBy(name="username")
	private WebElement usnTextField;
	
	@FindBy(name="pwd")
	private WebElement pwdTextField;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	

}
