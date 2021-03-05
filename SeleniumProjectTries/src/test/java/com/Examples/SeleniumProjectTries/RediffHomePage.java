package com.Examples.SeleniumProjectTries;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class RediffHomePage {
	
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://DriversWeb//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.getTitle();
		driver.manage().window().maximize();
		driver.get(" https://mail.rediff.com/cgi-bin/login.cgi ");
		driver.findElement(By.partialLinkText("Create a new account")).click();
		 driver.findElement(By.xpath("//body/center/form/div/table[2]/tbody/tr[3]/td[3]/input")).sendKeys("Vignesh");
		 driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("vignesh0608");
		 driver.findElement(By.xpath("//input[@value='f']")).click();
		 String female="f";
		 
		 
		 System.out.println(driver.findElement(By.xpath("//input[@value='"+female+"']")).isSelected());
		 
		 
		 
		 
		 
		 Select testSelect=new Select(driver.findElement(By.id("country")));
		 testSelect.selectByVisibleText("India");
		 WebElement element=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[5]"));
		System.out.println(element.getText());
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();	
		System.out.println(driver.findElement(By.xpath("//body/center/form/div/table[2]/tbody/tr[3]/td[3]/input")).getAttribute("type"));
		
//		try {
//			Thread.sleep(5000);
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//		driver.navigate().to("https://www.google.com");
//		try {
//			Thread.sleep(5000);
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//		driver.navigate().back();
//		try {
//			Thread.sleep(5000);
//		}catch(Exception e) {
//			System.out.println(e);
//		}	
//		driver.navigate().refresh();
//		try {
//			Thread.sleep(5000);
//		}catch(Exception e) {
//			System.out.println(e);
//		}
		
		
		
		driver.quit();
		
		
		
	}

}
