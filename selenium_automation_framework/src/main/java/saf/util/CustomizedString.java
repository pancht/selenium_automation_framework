package saf.util;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import saf.interfaces.IValues;

public class CustomizedString {

	/**
	 * Generates and returns random string of given length
	 *
	 * @param length
	 * @return
	 */
	public static final String generateString(int length) {
		Random rng = new Random();
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		// int length = characters.length();

		char[] text = new char[length];
		for (int i = 0; i < length; i++) {
			text[i] = characters.charAt(rng.nextInt(characters.length()));
		}
		return new String(text);
	}

	/*
	 * To generate alpha numeric numbers
	 */
	public static final String generateStringWithAllowedSplChars(int length, String allowdSplChrs) {
		String allowedChars = "abcd" + // alphabets
				allowdSplChrs + // numbers
				"123456789";
		return RandomStringUtils.random(length, allowedChars);
	}
	
	/**
	 * generate a rundom number of given length and returns it
	 *
	 * @param length
	 * @return
	 */
	public static final String AutogenerateNumber(int length) {
		return RandomStringUtils.randomNumeric(length);
	}
	
	

	/**
	 * Returns string representation of given integer
	 *
	 * @param anIntegerValue
	 *
	 * @return String
	 */
	public String toString(int anIntegerValue) {
		return anIntegerValue + IValues.EMPTY_STRING;
	}

}
