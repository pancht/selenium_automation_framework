package saf.essentials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.DefaultCredentialsProvider;
import com.gargoylesoftware.htmlunit.WebClient;

/**
 * 
 * @author Panchdev Chauhan
 *
 */
public class AuthenticatedHtmlUnitDriver extends HtmlUnitDriver {
	
	private static String USERNAME;
	private static String PASSWORD;

	private AuthenticatedHtmlUnitDriver() {
	}

	public final static WebDriver create(String username, String password) {
		USERNAME = username;
		PASSWORD = password;
		return new AuthenticatedHtmlUnitDriver();
	}

	@Override
	public final WebClient newWebClient(BrowserVersion browserVersion) {
		WebClient client = super.newWebClient(browserVersion);
		DefaultCredentialsProvider provider = new DefaultCredentialsProvider();
		provider.addCredentials(USERNAME, PASSWORD);
		client.setCredentialsProvider(provider);
		return client;
	}
}