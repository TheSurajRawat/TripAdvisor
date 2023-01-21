package com.tripadvisor.utilities;

import java.util.Properties;

public class Config {
	
	private final String EXPLICIT_WAIT_PROPERTY_NAME = "explicitWaitTime";

	private Properties properties;

	public Config(Properties properties) {
		this.properties = properties;
	}

	public Properties getProperties() {
		return properties;
	}

	public int getExplicitWaitTime() {
		return getInt(EXPLICIT_WAIT_PROPERTY_NAME);
	}

	public int getInt(String key) {
		return Integer.parseInt(getString(key).trim());
	}

	public String getString(String key) {
		String value = properties.getProperty(key);
		if (value == null) {
			value = "";
		}
		return value;
	}

}
