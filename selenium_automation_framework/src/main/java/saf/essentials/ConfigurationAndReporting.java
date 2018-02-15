package saf.essentials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import saf.essentials.eventHandlers.EventHandler;
import saf.interfaces.SuperInterface;

/************************************************************************************
 ************************************************************************************
 * This class contains project level global configurations and TestNG Reporting capabilities
 * 
 * 
 * @author Panchdev Chauhan
 * 
 ************************************************************************************
 ************************************************************************************/
public abstract class ConfigurationAndReporting implements SuperInterface  {

	public static final int WAIT_FOR_TIME_A = 2;
	public static final int WAIT_FOR_TIME_0 = 5;
	public static final int WAIT_FOR_TIME_1 = 10;
	public static final int WAIT_FOR_TIME_2 = 15;
	public static final int WAIT_FOR_TIME_3 = 20;
	public static final int WAIT_FOR_TIME_4 = 25;
	public static final int WAIT_FOR_TIME_5 = 30;

	/**
	 * Screenshot folder
	 */
	public static String SCREENSHOT_FOLDER = "target/screenshots/";

	/**
	 * System independent path separator
	 */
	public static final String PATH_SEPARATOR = System.getProperty("file.separator");

	/**
	 * Current execution environment/maven profile
	 */
	//public static String environment = PropertyLoader.loadProperty("env");

	/**
	 * user directory path
	 */
	public final static String PATH_USER_DIR = System.getProperty("user.dir");

	/**
	 * screenshot format
	 */
	public static final String SCREENSHOT_FORMAT = ".png";

	/**
	 *  WebDriver reference to current browser page
	 *  
	 *  Note: Do not change it's name. For simplicity of code usability and development
	 */
	public WebDriver pageDriver;

	/**
	 * Driver wait
	 */
	final int PAGE_WAIT = TIME_OUT_T;// new Integer(PropertyLoader.loadProperty("selenium.pageWait"));

	/**
	 * Website URL of AUT
	 */
	//public final String websiteUrl = PropertyLoader.loadProperty("site.url");

	/*
	 * Constructor injecting the WebDriver interface
	 *
	 * @param webDriver
	 */
	public ConfigurationAndReporting(WebDriver pageDriver) {

		

		this.pageDriver = pageDriver;
		
		//this.pageDriver = getEventFiringWebDriver(this.pageDriver);

	}

	/**
	 * Page constructor initializes with last page information
	 *
	 * @param webDriver
	 * @param redirectFromAnotherPage
	 */
	public ConfigurationAndReporting(WebDriver page, boolean redirectFromAnotherPage) {

		this(page);

	}

	/**
	 * This method creates and returns instance of FiringWebDriver
	 * 
	 * @param webDriver
	 * @return
	 */
	@SuppressWarnings("unused")
	private WebDriver getEventFiringWebDriver(WebDriver webDriver) {
		EventFiringWebDriver eventDriver = new EventFiringWebDriver(webDriver);
		EventHandler handler = new EventHandler();
		eventDriver.register(handler);
		return eventDriver;
	}

	/**
	 * Prints given message on console
	 *
	 * @param msg
	 */
	public final void debug(String msg) {
		System.out.println("---------------------------------DEBUG------------------------------------------");
		System.out.println(msg);
		System.out.println("--------------------------------------------------------------------------------");

	}

	/**
	 * Generates both a console log and a reporter log for given message
	 *
	 * @param msg
	 * @param logLevel
	 */
	public void log(String msg, String logLevel) {

		if (msg.endsWith(".")) {

			msg = msg.substring(0, msg.length() - 1) + "|";

		} else {

			msg = msg + "|";

		}

		System.out.println(SPACES_THREE + "|" + msg);

		if (logLevel == PAGE) {

			Reporter.log("<br/><b><font color='DarkRed'>" + msg + "</font></b>");

		} else if (logLevel == TEST) {

			Reporter.log("<br/>" + HTML_SPACE + "<font color='Orange'>" + msg + "</font>");

		} else if (logLevel == METHOD) { // add 3 space indentation

			Reporter.log("<br/>" + HTML_SPACE_THREE + "<font color='Black'>" + msg + "</font>");

		} else if (logLevel == QUESTION) {

			Reporter.log("<br/>" + HTML_SPACE + "<i><font color='Yellow'>" + msg + "</font></i>");

		} else if (logLevel == TO_DO_STEPS) {

			Reporter.log("<br/>" + HTML_SPACE + "TODO: <i><font color='Megenta'>" + msg + "</font></i>");

		} else if (logLevel == ASSERTS) {

			Reporter.log("<br/><b>" + HTML_SPACE + "CHECKPOINT: <font color='Green'>" + msg + "</font></b>");

		} else if (logLevel == TESTCASE) {

			Reporter.log("<br/> <b>TESTCASE:<font color='DarkRed'>" + msg + "</font></b>");

		} else if (logLevel == PRE_CONDITION) {

			Reporter.log("<br/> PRECONDITION:<b><font color='Megenta'>[" + msg + "]</font></b>");

		} else if (logLevel == BUG) {

			Reporter.log("<br/><font color='Red' style='background-color: yellow;'><b> BUG: [" + msg + "]</font> </b>");

		} else if (logLevel == MANUAL_TESTING_NOTE) {

			Reporter.log("<br/><font color='Black' style='background-color: yellow;'><b> Note For Manual Testers: </b>["
					+ msg + "]</font>");

		} else if (logLevel == BUG_GIT_HUB_LINK) {

			msg = msg.replace("|", SPACE);
			Reporter.log("<br/><font color='Blue' style='background-color: yellow;'><b> ISSUE_Link:  " + "<a href='"
					+ msg + "'>" + "[" + msg + "]" + " </a></font> </b>");
			// throw new Error("Force-fail-manually. Check Bug description and Issue link in
			// log");
		} else if (logLevel == ERROR) {

			Reporter.log("<br/> <b> <font color='Red' style='background-color: white;'> [" + msg + "]</font> </b>");

		} else if (logLevel == WARNING) {

			Reporter.log("<br/> <b> <font color='Yellow' style='background-color: gray;'> [" + msg + "]</font> </b>");

		} else if (logLevel == FAILURE) {

			Reporter.log("<br/> <b> <font color='Red' size='3' > [" + msg + "]</font> </b>");

		}

	}

	/**
	 * 
	 * @param step
	 */
	public final void step(String step) {
		log(step, METHOD);
	}

	public final void testcase(String testcase) {
		log(testcase, TESTCASE);
	}

	public final void test(String test) {
		log(test, TEST);
	}

	public final void note(String note) {
		log(note, MANUAL_TESTING_NOTE);
	}

	public final void question(String question) {
		log(question, QUESTION);
	}

	public final void todoNote(String todoNote) {
		log(todoNote, TO_DO_STEPS);
	}

	public final void bug(String bug, String git_link) {
		log(bug, BUG);
		log(git_link, BUG_GIT_HUB_LINK);
	}

	public final void checkpoint(String failureMessage) {
		try {
			Assert.assertEquals("ERROR IN [BROWSER] CONSOLE FOUND", "NO ERROR IN [BROWSER] CONSOLE",
					EXPECTED_MATCH_NOT_FOUND);
			log(failureMessage, ASSERTS);
		} catch (Throwable e) {
			log(failureMessage, FAILURE);
			// throw new Error(e);
		}
	}

	public final void checkpoint(String successMessage, Object actual, Object expected) {
		try {
			Assert.assertEquals(actual, expected, EXPECTED_MATCH_NOT_FOUND);
			log(successMessage, ASSERTS);
		} catch (Throwable e) {
			log(successMessage, FAILURE);
			// throw new Error(e);
		}
	}

	public final void error(String errorMessage) {
		log(errorMessage, ERROR);
	}

	public final void error(String successMessage, Object actual, Object expected) {
		try {
			Assert.assertEquals(actual, expected, EXPECTED_MATCH_NOT_FOUND);
			log(successMessage, ASSERTS);
		} catch (Throwable e) {
			log(successMessage + "<br/>ERROR: <br/>Expected[" + expected + "] <br/>Found[" + actual + "]",
					ERROR);
		}
	}

	public final void warning(String warningMessage) {
		log(warningMessage, WARNING);
	}

	public final void warning(String successMessage, Object actual, Object expected) {
		try {
			Assert.assertEquals(actual, expected, EXPECTED_MATCH_NOT_FOUND);
			log(successMessage, ASSERTS);
		} catch (Throwable e) {
			log(successMessage + "<br/>ERROR: <br/>Expected[" + expected + "] <br/>Found[" + actual + "]",
					WARNING);
		}
	}

	public final String getErrorLog(String errorMessage) {
		return "<br/> <b> <font color='Red' style='background-color: white;'> [" + errorMessage + "]</font> </b>";
	}

	public final String getWarningLog(String warningMessage) {
		return "<br/> <b> <font color='Yellow' style='background-color: gray;'> [" + warningMessage + "]</font> </b>";
	}

	/**
	 * Returns "TRUE" if given element is displayed on current page else returns
	 * <Error message with element details>
	 *
	 * @param _ele
	 * @param pageName
	 *
	 * @return String
	 */
	public final String isDisplayed(WebElement _ele, String pageName) {
		// log("....Checking visibility of element["+_ele + "]", "DoNotLog");
		if (_ele.isDisplayed()) {
			return "TRUE";
		}
		return "[" + _ele + "]Element not displayed on " + pageName;
	}

	/**
	 * Returns current page name
	 *
	 * @param obj
	 *
	 * @return String
	 */
	public final String getPageName(Object obj) {
		return obj.getClass().getSimpleName();
	}

	/**
	 * Returns substring from given string and with given start and end indexes
	 *
	 * @param from
	 * @param start
	 * @param end
	 *
	 * @return String
	 */
	public final String subString(String from, String start, String end) {
		return from.substring(from.indexOf(start) + start.length(), from.indexOf(end));
	}

	public abstract Object goBack();

	public abstract Object goBack(String pageName);

	public abstract String getPageTitle();

	public abstract void verifyPageUI();
	
	
	
		
	
	

	
	
	
}
