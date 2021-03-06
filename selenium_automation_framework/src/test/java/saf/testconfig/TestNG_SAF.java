package saf.testconfig;

import java.io.File;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;


import saf.essentials.WebDriverFactory;
import saf.essentials.eventHandlers.EventHandler;
import saf.interfaces.IFlags;
import saf.interfaces.IValues;
import saf.util.CustomizedBrowser;
import saf.util.PropertyLoader;

/**
 * All TestNG Annotations are used here Except @Test, which will be used in
 * Test-case classes under autotests package
 * 
 * @author Panchdev Chauhan
 *
 */
public class TestNG_SAF {
	/**
	 * WebDriver reference to current browser page
	 * 
	 * Note: Do not change it's name. For simplicity of code usability and
	 * development
	 */
	protected WebDriver pageDriver = null;

	/**
	 * URL of website under test
	 */
	protected String sWebsiteUrl =null;
	
	/**
	 * Proxy URL
	 */
	static String HTTP_PROXY_URL = null;
	
	/**
	 * Screenshot folder
	 */
	public static final String SCREENSHOT_FOLDER = "target/screenshots/";

	/**
	 * screenshot format
	 */
	public static final String SCREENSHOT_FORMAT = ".png";

	/**
	 * OS dependent path separator
	 */
	public static final String PATH_SEPARATOR = System.getProperty("file.separator");

	/**
	 * user directory path
	 */
	protected final static String PATH_USER_DIR = System.getProperty("user.dir");

	/**
	 * Jenkins Screenshot URL
	 */
	public static String JENKINS_SCREENSHOT_URL = ""; // =
														// "https://dev.visyond.com/job/Visyond%20Selenium%20Suite/ws/target/screenshots/";

	@BeforeMethod
	public void beforeMethod() {
		// System.out.println("Inside @BeforeMethod Method");

	}

	@AfterMethod
	public void afterMethodTakeScreenshotIfTestFailedAndCleanUpIfRequired(ITestResult result) {
		// System.out.println("Inside @AfterMethod Method");

		Object[] parameters = result.getParameters();
		String sScreenshotName = null ;
		
		if( parameters.length >0 ) {
			sScreenshotName = result.getName().concat(parameters[0].toString()).replace("@", IValues.EMPTY_STRING).replace(".", IValues.EMPTY_STRING);
		} else {
			sScreenshotName = result.getName();
		}
		
		try {
			if (!result.isSuccess()) {
				if (pageDriver != null) {
					try {
						File f = ((TakesScreenshot) pageDriver).getScreenshotAs(OutputType.FILE);
						FileUtils.copyFile(f,
								new File(SCREENSHOT_FOLDER + sScreenshotName + SCREENSHOT_FORMAT).getAbsoluteFile());
					} catch (Throwable e) {

					}
				}

			}
		} catch (Throwable e) {
		} finally {
			try {

				pageDriver.quit();
			} catch (Throwable e) {
			}
		}
		Reporter.log("Screenshot:[" + sScreenshotName + SCREENSHOT_FORMAT + "]");
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}

	@BeforeClass
	public void beforeClass() {
		// System.out.println("Inside @BeforeClass Method");
	}

	@AfterClass
	public void afterClass() {
		// System.out.println("Inside @AfterClass Method");
	}

	@BeforeTest
	public void beforeTest() {
		// System.out.println("Inside @BeforeTest Method");
	}

	@AfterTest
	public void afterTest() {
		// System.out.println("Inside @AfterTest Method");

	}

	@BeforeSuite
	public void beforeSuite() {
		// System.out.println("Inside @BeforeSuite Method");
	}

	@AfterSuite
	public void afterSuite() {
		// System.out.println("Inside @AfterSuite Method");
	}

	/**
	 * Returns new browser window for user
	 *
	 * @return Webdriver
	 */
	@BeforeMethod
	protected void getNewLaunchPage() {

		WebDriver newPage = null;

		new PropertyLoader();
		// Load values from property file
		String environment = PropertyLoader.loadProperty("env");

		@SuppressWarnings("unused")
		String useremail = PropertyLoader.loadProperty("user.email");

		@SuppressWarnings("unused")
		String username = PropertyLoader.loadProperty("user.username");

		@SuppressWarnings("unused")
		String password = PropertyLoader.loadProperty("user.password");

		String websiteUrl = PropertyLoader.loadProperty("site.url");
		sWebsiteUrl = websiteUrl;

		String gridHubUrl = PropertyLoader.loadProperty("grid2.hub");

		String browserName = PropertyLoader.loadProperty("browser.name");

		String browserVersion = PropertyLoader.loadProperty("browser.version");

		String browserPlatform = PropertyLoader.loadProperty("browser.platform");

		@SuppressWarnings("unused")
		String productVersion = PropertyLoader.loadProperty("product.version");

		String loadCertificate = PropertyLoader.loadProperty("browser.loadCertificate");

		System.out.println("Grid Hub URL>>>>:[" + gridHubUrl + "]");

		if (IFlags.ENABLE_DEBUG_MESSAGES) {
			System.out.println("CURRENT ENVIRONMENT:[" + environment + "]");
		}

		if (environment.contains("ci")) {
			// SCREENSHOT_FOLDER =
			// "https://vci.trousev.pro/job/Selenium/ws/target/screenshots/";
		}
		// System.out.println("SCREENSHOT FOLDER:[" + SCREENSHOT_FOLDER + "]");

		CustomizedBrowser browser = new CustomizedBrowser();
		browser.setName(browserName);
		browser.setVersion(browserVersion);
		browser.setPlatform(browserPlatform);

		
		String proxyServerUrl = PropertyLoader.loadProperty("proxy.server.url");
		String proxyServerPort = PropertyLoader.loadProperty("proxy.server.port");
		HTTP_PROXY_URL = proxyServerUrl + ":" + proxyServerPort;

		/**
		 * Create a Proxy() Object
		 * And initialize it 
		 */
		Proxy proxy = new Proxy();
		proxy.setHttpProxy(HTTP_PROXY_URL).setFtpProxy(HTTP_PROXY_URL).setSslProxy(HTTP_PROXY_URL).setSslProxy(HTTP_PROXY_URL);
		
		/**
		 * Set Browser Capabilities
		 */
		/*DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability(CapabilityType.PROXY, proxy);*/
		
		
		try {
			if (loadCertificate.equals("true")) {
				// try {
				if (gridHubUrl == null || gridHubUrl.length() == 0) {
					System.out.println("Launch local firefox driver");
					DesiredCapabilities cap = DesiredCapabilities.firefox();
					//cap.setCapability(CapabilityType.PROXY, proxy);
					newPage = new FirefoxDriver(cap);
					
				} else {
					System.out.println("Launch Remote firefox driver");
					DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					capabilities.setCapability("marionette", true);
					
					if(proxyServerUrl.length()>0) {
						capabilities.setCapability(CapabilityType.PROXY, proxy);
					}
					newPage = new RemoteWebDriver(new URL(gridHubUrl), capabilities);
				}

			} else {
				// Launch custom profile without certificate
				// This is on Jenkins machine, we donot need to launch/add certificate to
				newPage = WebDriverFactory.getInstance(gridHubUrl, browser, null, null);

			}

		} catch (Throwable e) {
			if (IFlags.ENABLE_DEBUG_MESSAGES) {
				System.out.println("EXCEPTION LAUNCHING GRID:" + e.getMessage() + "\n" + "CAUSE:" + e.getCause());
			}

			// newPage.quit();
		}

		pageDriver = newPage;

		// pageDriver = getEventFiringWebDriver(pageDriver);

		// return newPage;

	}

	@SuppressWarnings("unused")
	private WebDriver getEventFiringWebDriver(WebDriver webDriver) {
		EventFiringWebDriver eventDriver = new EventFiringWebDriver(webDriver);
		EventHandler handler = new EventHandler();
		eventDriver.register(handler);
		return eventDriver;
	}

}
