package com.camp.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class baseCamp_class {
	public static Properties propcamp;
	public static WebDriver driver;
	public baseCamp_class() {
		propcamp = new Properties();
		try {
			FileInputStream flscamp = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\camp\\Configure\\ConfigureCamp.properties");
			propcamp.load(flscamp);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void initBrowserCamp() {
		
		String browsersetcamp = propcamp.getProperty("BROWSERCAMP1");
		int e=10;
		
		if (browsersetcamp.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir") + "\\WebDriverCamp\\chromedriver.exe");
			driver = new ChromeDriver();
            driver.manage().timeouts().pageLoadTimeout(tesDataCamp.pageLoadTimeoutcamp, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(tesDataCamp.implicitlyWaitcamp, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("Camp Chrome Browser Launch");
		}
		
		else if (browsersetcamp.equals("FF")) {
			
		}
	}
	
	public static void getURLcamp (String URL) {
		driver.get(propcamp.getProperty("URLCamp"));
		
	}
	
	
}
