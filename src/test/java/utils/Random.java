package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class Random {

    public static String generateRandomEmail() {
        String randomString = RandomStringUtils.randomAlphabetic(10);
        return randomString + "@example.com";
    }
}