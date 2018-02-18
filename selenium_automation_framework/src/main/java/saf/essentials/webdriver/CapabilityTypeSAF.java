package saf.essentials.webdriver;

import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilityTypeSAF {

	static void setBrowserName(DesiredCapabilities capability, String sBrowserName) {
		capability.setCapability(CapabilityType.BROWSER_NAME, sBrowserName);
	}

	static void setPlatform(DesiredCapabilities capability, String sPlatform) {
		capability.setCapability(CapabilityType.PLATFORM, sPlatform);
	}

	static void supportJavaScript(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
	}

	static void disableSupportJavaScript(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, false);
	}

	static void enableTakesScreenshotCapability(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
	}

	static void disableTakeScreenshotCapability(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.TAKES_SCREENSHOT, false);
	}

	static void setVersion(DesiredCapabilities capability, String sVersion) {
		capability.setCapability(CapabilityType.VERSION, sVersion);
	}

	static void setVersionBrowser(DesiredCapabilities capability, String sVersion) {
		capability.setCapability(CapabilityType.BROWSER_VERSION, sVersion);
	}

	static void enableSupportAlerts(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.SUPPORTS_ALERTS, true);
	}

	static void disableSupportAlerts(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.SUPPORTS_ALERTS, false);
	}

	static void enableSupportSqlDatabase(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.SUPPORTS_SQL_DATABASE, true);
	}

	static void disableSupportSqlDatabase(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.SUPPORTS_SQL_DATABASE, false);
	}

	static void enableSupportLocationContext(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.SUPPORTS_LOCATION_CONTEXT, true);
	}

	static void disableSupportLocationContext(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.SUPPORTS_LOCATION_CONTEXT, false);
	}

	static void enableSupportApplicationCache(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.SUPPORTS_APPLICATION_CACHE, true);
	}

	static void disableSupportApplicationCache(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.SUPPORTS_APPLICATION_CACHE, false);
	}

	static void enableSupportFindingByCss(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.SUPPORTS_FINDING_BY_CSS, true);
	}

	static void disableSupportFindingByCss(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.SUPPORTS_FINDING_BY_CSS, false);
	}

	static void setProxy(DesiredCapabilities capability, String sProxyServerIPWithPort) {
		capability.setCapability(CapabilityType.PROXY, sProxyServerIPWithPort);
	}

	static void enableSupportsWebStorage(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.SUPPORTS_WEB_STORAGE, true);
	}

	static void disableSupportsWebStorage(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.SUPPORTS_WEB_STORAGE, false);
	}

	static void enableRotable(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.ROTATABLE, true);
	}

	static void disableRotable(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.ROTATABLE, false);
	}

	static void setApplicationName(DesiredCapabilities capability, String sApplicationName) {
		capability.setCapability(CapabilityType.APPLICATION_NAME, sApplicationName);
	}

	/**
	 * Enable this capability to accept all SSL certs by defaults.
	 * 
	 * @param capability
	 */
	static void enableAcceptSslCertificates(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	}

	static void disableAcceptSslCertificates(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, false);
	}

	static void enableAcceptInsecureCertificates(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	}

	static void disableAcceptInsecureCertificates(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, false);
	}

	static void enableHasNativeEvents(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.HAS_NATIVE_EVENTS, true);
	}

	static void disableHasNativeEvents(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.HAS_NATIVE_EVENTS, false);
	}

	static void enableUnexpectedAlertBehaviour(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, true);
	}

	static void disableUnexpectedAlertBehaviour(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, false);
	}

	static void enableUnhandledPromptBehaviour(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.UNHANDLED_PROMPT_BEHAVIOUR, true);
	}

	static void disableUnhandledPromptBehaviour(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.UNHANDLED_PROMPT_BEHAVIOUR, false);
	}

	static void enableElementScrollBehaviour(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.ELEMENT_SCROLL_BEHAVIOR, true);
	}

	static void enableHasTouchScreen(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.HAS_TOUCHSCREEN, true);
	}

	static void disableHasTouchScreen(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.HAS_TOUCHSCREEN, false);
	}

	static void enableOverlappingCheckDisabled(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.OVERLAPPING_CHECK_DISABLED, true);
	}

	static void disableOverlappingCheckDisabled(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.OVERLAPPING_CHECK_DISABLED, false);
	}

	static void setLoggingPreferences(DesiredCapabilities capability, LoggingPreferences logging) {
		capability.setCapability(CapabilityType.LOGGING_PREFS, logging);
	}

	static void enableEnableProfilingCapability(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.ENABLE_PROFILING_CAPABILITY, true);
	}

	static void disableEnableProfilingCapability(DesiredCapabilities capability) {
		capability.setCapability(CapabilityType.ENABLE_PROFILING_CAPABILITY, false);
	}

	static void setPageLoadStrategy(DesiredCapabilities capability, String... sPageLoadStrategy) {

		if (sPageLoadStrategy.length == 0) {
			capability.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, IPageLoadStrategy.NORMAL);
		} else {
			capability.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, sPageLoadStrategy);
		}

	}

}
