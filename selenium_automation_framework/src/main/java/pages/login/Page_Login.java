package pages.login;

import org.openqa.selenium.WebDriver;

import pages.security_question.Page_SecurityQuestionPage;
import saf.essentials.Page;

public class Page_Login extends Page implements IPage_login {

	public Page_Login(WebDriver pageDriver) {
		super(pageDriver);
		
		
	}

	@Override
	public void typeUserName(String sUserName) {
		waitForElementDisplayed(txtUserName, 10);
		type(IPage_login.txtUserName, sUserName);
		
	}

	@Override
	public void typePassword(String sPassword) {
		waitForElementDisplayed(txtPassword, 10);
		type(IPage_login.txtPassword, sPassword);
		
	}

	@Override
	public Page_SecurityQuestionPage clickButtonLogin() {
		click(btnLogin);
		
		return new Page_SecurityQuestionPage(pageDriver);
	}
	
	

}
