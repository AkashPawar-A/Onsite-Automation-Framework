package com.onsite.core_test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	public static Properties read(String fileName)  {
		
		String filePath = "C:\\Users\\hr\\OnsiteGit\\OnsiteTestQA\\src\\main\\resources\\props\\"+ fileName;
		
		Properties properties = new Properties();
		try {
			File file = new File(filePath);
			FileInputStream fileInputSTream = new FileInputStream(file);
			properties.load(fileInputSTream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	} 
}
