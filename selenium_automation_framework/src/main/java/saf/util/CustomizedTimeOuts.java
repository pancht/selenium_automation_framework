package saf.util;

import saf.interfaces.IFlags;

public class CustomizedTimeOuts {

	/**
	 * Pauses for given number of mili-seconds
	 *
	 * @param miliSeconds
	 */
	public final static void pauseMilis(long miliSeconds) {
		try {
			Thread.sleep(miliSeconds);
		} catch (InterruptedException e) {
			if (IFlags.ENABLE_DEBUG_MESSAGES) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Pauses for given number of seconds
	 *
	 * @param seconds
	 */
	public final static void pause(int seconds) {
		pauseMilis(seconds * 1000);
	}

}
