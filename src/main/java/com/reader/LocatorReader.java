package com.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LocatorReader {
	
	public static Properties LOCATOR_READER;

	
	static {
		
		LOCATOR_READER = new Properties();
			try {
				LOCATOR_READER.load(new FileInputStream("Config\\locator.properties"));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}

	}


