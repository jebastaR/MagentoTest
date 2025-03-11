package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void launchBrowser(String browserName) throws Exception {
		
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}else {
			throw new Exception("Enter Valid URL");
		}
	}
	
	public static void visibilityOfElement(WebElement element) {
		WebDriverWait wb = new WebDriverWait(driver, Duration.ofSeconds(30));
		wb.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void launchUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public static void elementSendKeys(WebElement element, String value) {
		visibilityOfElement(element);
		element.sendKeys(value);
	}
	
	public static void elementClick(WebElement element) {
		visibilityOfElement(element);
		element.click();
	}

	public static String getPropertyValue(String key) throws Exception {
		File file = new File(System.getProperty("user.dir")+"/Config/config.properties");
		
		FileInputStream inputStream = new FileInputStream(file);
		
		Properties properties = new Properties();
		
		properties.load(inputStream);
		
		String property = properties.getProperty(key);
		
		return property;
		
	}
	
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
		
	}
	
	public static boolean isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}
}
