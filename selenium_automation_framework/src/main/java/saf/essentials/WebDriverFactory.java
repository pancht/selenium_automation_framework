package saf.essentials;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaDriverService;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import saf.util.*;

/*
 * Factory to instantiate a WebDriver object. 
 * It returns an instance of the driver (local invocation)
 * or 
 * an instance of RemoteWebDriver
 * 
 * @author Panchdev Chauhan
 */
public class WebDriverFactory {

	public static OperaDriverService operaDriverService;

	/* Browsers constants */
	public static final String FIREFOX = "firefox";
	public static final String INTERNET_EXPLORER = "ie";
	public static final String CHROME = "chrome";
	public static final String OPERA = "opera";
	public static final String SAFARI = "safari";
	public static final String HTML_UNIT = "htmlunit";
	public static final String IPHONE = "iphone";

	/* Platform constants */
	public static final String WINDOWS = "windows";
	public static final String ANDROID = "android";
	public static final String XP = "xp";
	public static final String VISTA = "vista";
	public static final String MAC = "mac";
	public static final String LINUX = "linux";

	private WebDriverFactory() {
	}

	/*
	 * Factory method to return a RemoteWebDriver instance given the url of the Grid
	 * hub and a Browser instance.
	 * 
	 * @param gridHubUrl : grid hub URI
	 * 
	 * @param browser : Browser object containing info around the browser to hit
	 * 
	 * @param username : username for BASIC authentication on the page to test
	 * 
	 * @param password : password for BASIC authentication on the page to test
	 * 
	 * @return RemoteWebDriver
	 */
	public final static WebDriver getInstance(String gridHubUrl, CustomizedBrowser browser, String username,
			String password) {

		// Declare webdriver
		WebDriver webDriver = null;

		// Set browser name from parameter
		String browserName = browser.getName();

		// Check if there is no HUB
		if (gridHubUrl == null || gridHubUrl.length() == 0) {
			return getInstance(browserName, username, password);
		}

		// Set browser capabilities
		DesiredCapabilities capability = new DesiredCapabilities();

		// Enable Javascript, so that java-script queries can be executed
		capability.setJavascriptEnabled(true);

		if (CHROME.equals(browserName)) {

			// @link : https://sites.google.com/a/chromium.org/chromedriver/
			// @link :
			// https://src.chromium.org/viewvc/chrome/trunk/src/chrome/common/pref_names.cc?view=markup

			capability = DesiredCapabilities.chrome();

			ChromeOptions chromeOptions = getChromeOptions();

			capability.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

		} else if (FIREFOX.equals(browserName)) {

			// @link : https://github.com/mozilla/geckodriver

			capability = DesiredCapabilities.firefox();

			capability.setCapability("marionette", true);

		} else if (INTERNET_EXPLORER.equals(browserName)) {

			// @link : https://github.com/SeleniumHQ/selenium/wiki/InternetExplorerDriver

			capability = DesiredCapabilities.internetExplorer();

		} else if (OPERA.equals(browserName)) {

			// @link :
			// https://seleniumhq.github.io/selenium/docs/api/java/org/openqa/selenium/opera/OperaDriver.html

			// @link :
			// https://stackoverflow.com/questions/43277677/opera-browser-in-selenium-grid-driver-class-not-found?rq=1

			capability = DesiredCapabilities.operaBlink();
			System.out.println("===================================================================");
			//OperaOptions operaOptions = getOperaOptions();

			//capability.setCapability(OperaOptions.CAPABILITY, operaOptions);

		} else if (SAFARI.equals(browserName)) {

			capability = DesiredCapabilities.safari();

		} else if (ANDROID.equals(browserName)) {

			capability = DesiredCapabilities.android();

		} else if (IPHONE.equals(browserName)) {

			capability = DesiredCapabilities.iphone();

		} else {

			capability = DesiredCapabilities.htmlUnit();

			// HTMLunit Check
			/*
			 * if (username != null && password != null) { webDriver =
			 * AuthenticatedHtmlUnitDriver.create(username, password); } else { webDriver =
			 * new HtmlUnitDriver(true); }
			 */

			return webDriver;
		}

		capability = setVersionAndPlatform(capability, browser.getVersion(), browser.getPlatform());

		// Create Remote WebDriver
		try {

			// @link : https://seleniumhq.github.io/docs/grid.html
			webDriver = new RemoteWebDriver(new URL(gridHubUrl), capability);
		} catch (Exception e) {
			System.out.println("Inside Exception: >>>> ");
			e.printStackTrace();
		}

		return webDriver;
	}

	/*
	 * Factory method to return a WebDriver instance given the browser to hit
	 * 
	 * @param browser : String representing the local browser to hit
	 * 
	 * @param username : username for BASIC authentication on the page to test
	 * 
	 * @param password : password for BASIC authentication on the page to test
	 * 
	 * @return WebDriver instance
	 */
	public final static WebDriver getInstance(String browser, String username, String password) {

		// Declare webdriver
		WebDriver webDriver = null;

		if (CHROME.equals(browser)) {

			ChromeOptions chromeOptions = getChromeOptions();

			webDriver = new ChromeDriver(chromeOptions);

		} else if (FIREFOX.equals(browser)) {

			// System.setProperty("webdriver.gecko.driver", "C:\\testing\\geckodriver.exe");
			FirefoxProfile ffProfile = new FirefoxProfile();

			// Authenication Hack for Firefox
			if (username != null && password != null) {
				ffProfile.setPreference("network.http.phishy-userpass-length", 255);
			}

			webDriver = new FirefoxDriver();

		} else if (INTERNET_EXPLORER.equals(browser)) {

			webDriver = new InternetExplorerDriver();

		} else if (OPERA.equals(browser)) {

			// @link :
			// https://stackoverflow.com/questions/29144693/unable-to-launch-opera-using-selenium

			OperaOptions operaOptions = getOperaOptions();
			webDriver = new OperaDriver(operaOptions);

		} else if (SAFARI.equals(browser)) {

			webDriver = new SafariDriver();

		} else if (IPHONE.equals(browser)) {
			try {
				// webDriver = new IPhoneDriver();
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else if (ANDROID.equals(browser)) {
			// webDriver = new AndroidDriver();

		} else {

			// HTMLunit Check
			if (username != null && password != null) {
				webDriver = AuthenticatedHtmlUnitDriver.create(username, password);
			} else {
				webDriver = new HtmlUnitDriver(true);
			}
		}

		return webDriver;
	}

	/*
	 * Helper method to set version and platform for a specific browser
	 * 
	 * @param capability : DesiredCapabilities object coming from the selected
	 * browser
	 * 
	 * @param version : browser version
	 * 
	 * @param platform : browser platform
	 * 
	 * @return DesiredCapabilities
	 */
	private final static DesiredCapabilities setVersionAndPlatform(DesiredCapabilities capability, String version,
			String platform) {
		if (MAC.equalsIgnoreCase(platform)) {
			capability.setPlatform(Platform.MAC);
		} else if (LINUX.equalsIgnoreCase(platform)) {
			capability.setPlatform(Platform.LINUX);
		} else if (XP.equalsIgnoreCase(platform)) {
			capability.setPlatform(Platform.XP);
		} else if (VISTA.equalsIgnoreCase(platform)) {
			capability.setPlatform(Platform.VISTA);
		} else if (WINDOWS.equalsIgnoreCase(platform)) {
			capability.setPlatform(Platform.WINDOWS);
		} else if (ANDROID.equalsIgnoreCase(platform)) {
			capability.setPlatform(Platform.ANDROID);
		} else {
			capability.setPlatform(Platform.ANY);
		}

		if (version != null) {
			capability.setVersion(version);
		}
		return capability;
	}

	/*
	 * Helper method to set ChromeDriver location into the right ststem property
	 */
	private final static void setChromeDriver() {

		String os = System.getProperty("os.name").toLowerCase().substring(0, 3);

		String chromeBinary = "src/main/java/resources/drivers/chromedriver" + (os.equals("win") ? ".exe" : "");

		System.setProperty("webdriver.chrome.driver", chromeBinary);
	}

	private static void isSupportedPlatform(String browser) {

		boolean is_supported = true;

		Platform current = Platform.getCurrent();

		if (INTERNET_EXPLORER.equals(browser)) {

			is_supported = Platform.WINDOWS.is(current);

		} else if (SAFARI.equals(browser)) {

			is_supported = Platform.MAC.is(current) || Platform.WINDOWS.is(current);

		}

		assert is_supported : "Platform is not supported by " + browser.toUpperCase() + " browser";
	}

	private static ChromeOptions getChromeOptions() {

		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("user-data-dir=C:\\Users\\DELL\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
		chromeOptions.addArguments("test-type");
		chromeOptions.addArguments("start-maximized");
		chromeOptions.addArguments("--js-flags=--expose-gc");
		chromeOptions.addArguments("--enable-precise-memory-info");
		chromeOptions.addArguments("--disable-popup-blocking");
		chromeOptions.addArguments("--disable-default-apps");
		chromeOptions.addArguments("--disable-infobars");

		return chromeOptions;
	}

	private static OperaOptions getOperaOptions() {

		OperaOptions operaOptions = new OperaOptions();
		operaOptions.setBinary(new File("C:\\Program Files\\Opera\\50.0.2762.58\\opera.exe"));

		return operaOptions;

	}
	
	private static SafariOptions getSafariOptions() {
		
		SafariOptions safariOptions = new SafariOptions();
				
		return safariOptions;
	}
}
