package com.org.abcCompany.config;

import java.io.FileInputStream;
import java.util.Properties;

public class Config {
	private static final Properties configProperties = new Properties();
	private static final Properties testData = new Properties();
	private static final Properties pomClass1 = new Properties();

	private static final String pathConstant = "src\\resources\\";
	private static final String propertiesFilePathofTestData = pathConstant + "TestData.properties";
	private static final String propertiesFilePathofPOMClass1 = pathConstant + "POMClass1.properties";

	static {   
		loadConProperties();
	}

	private static void loadConProperties() {
		try {
			configProperties.clear();
			// System.out.println("path is: "+propertiesFilePathofTestData);
			testData.load(new FileInputStream(propertiesFilePathofTestData));
			pomClass1.load(new FileInputStream(propertiesFilePathofPOMClass1));

			configProperties.putAll(pomClass1);
			configProperties.putAll(testData);

		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

	public static String getProperty(String name) {
		return configProperties.getProperty(name);
	}

	public static boolean hasKey(String key) {
		return configProperties.containsKey(key);
	}

}
