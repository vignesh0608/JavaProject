package com.MiniProjectDemo.ModuleOne;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePageTesting {
	public static void main(String[] args){
		//System.setProperty("webdriver.chrome.driver", "C:\\DriversWeb\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\DriversWeb\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		//System.setProperty("webdriver.ie.driver","C:\\DriversWeb\\IE32\\IEDriverServer.exe");
		//WebDriver driver=new InternetExplorerDriver();
		
		
		
		driver.manage().window().maximize();
		
		driver.get("https:\\www.google.com");
		driver.findElement(By.name("q")).sendKeys("Vignesh Vijayakumar");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		//((WebElement) driver).sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
