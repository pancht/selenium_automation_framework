package saf.essentials.webdriver;

interface IPageLoadStrategy {

	/**
	 * This strategy causes Selenium to wait for the full page loading <br/>
	 * (html content and subresources downloaded and parsed).
	 * 
	 * Webdriver uses "normal" as Default
	 */
	String NORMAL = "normal" ;
	
	/**
	 * This stategy causes Selenium to wait for the DOMContentLoaded event <br/>
	 * (html content downloaded and parsed only).
	 */
	String EAGER = "eager" ;
	
	/**
	 * This strategy causes Selenium to return immediately <br/>
	 * after the initial page content is fully received (html content downloaded).
	 */
	String NONE = "none" ;
}
