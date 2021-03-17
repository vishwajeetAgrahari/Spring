package com.appsdeveloperblog.app.ws.shared;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Utils {
	
	private final Random Random = new SecureRandom();
	private final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public String generateUserID(int length) {
		return generateRandomString(length);
	}

	private String generateRandomString(int length) {
		StringBuilder returnValue = new StringBuilder(length);
		for(int i=0; i < length; i++) {
			returnValue.append(ALPHABET.charAt(Random.nextInt(ALPHABET.length())));
		}
		return new String(returnValue);
	}

}
