package com.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	
	public static String BASE_URL;
	public static Properties CONFIG_READER;
	public static String BROWSER_TYPE;
	
static {
		
	CONFIG_READER = new Properties();
		try {
			CONFIG_READER.load(new FileInputStream("Config\\applicationconfigs.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		BASE_URL = CONFIG_READER.getProperty("baseurl");
		BROWSER_TYPE=CONFIG_READER.getProperty("browsertype");
}

}
