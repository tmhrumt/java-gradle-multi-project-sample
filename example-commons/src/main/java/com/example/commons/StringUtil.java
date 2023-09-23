package com.example.commons;

import org.apache.commons.lang3.RandomStringUtils;

public class StringUtil {
  public static String getRandomUpperString(int length) {
    return RandomStringUtils.randomAlphanumeric(length).toUpperCase();
  }
}
