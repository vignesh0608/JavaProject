package com.Examples.SeleniumProjectTries;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SampleDemo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://DriversWeb//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();		
		//driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		try{
			Thread.sleep(5000);
		}catch(Exception e) {
			System.out.println(e);
		}
//		WebElement selectDates=driver.findElement(By.id("DepartDate"));
//		Date newDate=new Date("22/02/2021");
//		String dates=newDate.toString();
//		selectDates.sendKeys("22022021");
//		System.out.println(dates);
//		selectDates.sendKeys(dates);
//		System.out.println(selectDates.getText());
		
		
		
		
		driver.get("https://www.google.com");
		//System.out.println(driver.manage().window().getSize());
//		System.out.println(driver.manage().window().getPosition());
//		System.out.println(driver.getWindowHandle());
//		System.out.println(driver.getTitle());
		
		
		driver.navigate().to("https://www.facebook.com");
		
//		
//		try{
//			Thread.sleep(5000);
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//		
//		driver.navigate().back();
//		
//		try{
//			Thread.sleep(5000);
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//		
//		driver.navigate().forward();
//		
//		try{
//			Thread.sleep(5000);
//		}catch(Exception e) {
//			System.out.println(e);
//		}
		driver.findElement(By.partialLinkText("Create New Account")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		try{
//			Thread.sleep(5000);
//		}catch(Exception e) {
//			System.out.println(e);
//		}
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement firstname;
		firstname=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		firstname.sendKeys("Vignesh");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Vijayakumar");
		driver.findElement(By.name("reg_email__")).sendKeys("vignesh@gmail.com");
		WebElement bdate=driver.findElement(By.name("birthday_day"));

		
		
		
		
		Select bday=new Select(bdate);
		bday.selectByVisibleText("6");
		System.out.println(bdate.isSelected());
		System.out.println(driver.findElement(By.name("birthday_day")).isDisplayed());
		System.out.println(bdate.isEnabled());
		List<WebElement> dates=driver.findElements(By.name("birthday_day"));
		for(int i=0;i<dates.size();i++) {
			System.out.println(dates.get(i).getText());
			
		}
		
		
		//driver.quit();
	}

}
