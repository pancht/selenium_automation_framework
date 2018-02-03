package pages.login;

import org.openqa.selenium.By;

import pages.security_question.Page_SecurityQuestionPage;

interface IPage_login {

	By txtUserName = By.xpath("//label[text()='User Name:']/../input");
	
	By txtPassword = By.xpath("//label[text()='Password:']/../input");
	
	By btnLogin = By.xpath("//input[@value='Login']");
	
	public void typeUserName(String sUserName);
	
	public void typePassword(String sPassword);
	
	public Page_SecurityQuestionPage clickButtonLogin();
}
