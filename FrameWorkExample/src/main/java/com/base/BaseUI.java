package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseUI {
	public static WebDriver driver;
	Properties property = new Properties();

	// invokes the browser
	public void invokeBrowser(String browserKey) {
		// if (property == null) {
		try {
			File file = new File(
					"C:\\Users\\lenovo\\JavaWorkOuts\\FrameWorkExample\\src\\resources\\java\\ObjectRepository\\projectConfig.properties");
			FileInputStream input = new FileInputStream(file);
			property.load(input);
		} catch (Exception e) {
			e.printStackTrace();
			// }
		}
		String browser = property.getProperty(browserKey);
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//src/resources/java/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if ((browser.equalsIgnoreCase("firefox")) || (browser.equalsIgnoreCase("mozila"))) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "//src/resources/java/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if ((browser.equalsIgnoreCase("IE")) || (browser.equalsIgnoreCase("internetexplorer"))) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "//src/resources/java/drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();

	}

	// Opens the URL
	public void openURL(String websiteURL) {
		driver.get(property.getProperty(websiteURL));
	}

	// Clicks the Element
	public void clickElement(String elementXpath) {
		driver.findElement(By.xpath(elementXpath)).click();
	}

	// Closes the Browser
	public void closeBrower() {
		driver.close();
	}

	// Closes the driver
	public void quiteBrowser() {
		driver.quit();
	}

}
