package com.Examples.SeleniumProjectTries;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class AmazonTry {
	public static WebDriver driver; 
	private List<WebElement> products; 
	private String baseUrl; 
	int countProducts;
	boolean loopUntil=true;
	
	// Method is used to Set the driver properties
	public void createDriver(String browser) {
		if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C://DriversWeb//geckodriver.exe");
			baseUrl="https://www.amazon.in/ ";
			driver=new FirefoxDriver();
		}else if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C://DriversWeb//chromedriver.exe");
			baseUrl="https://www.amazon.in/ ";
			driver=new ChromeDriver();
		}
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}
	public void selectingProducts() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile smartphones under 30000");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		products=driver.findElements(By.xpath("//div[@data-component-id and @data-index]"));
		countProducts=products.size();
		System.out.println("Page:1"+"    Contains:"+products.size());
		driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		
			System.out.println(e);
		} int pageNo=2;
		do{			
			List<WebElement> prod=driver.findElements(By.xpath("//div[@data-component-id and @data-index]"));
			int tempCount=prod.size();
			System.out.println("Page:"+pageNo+"    Contains:"+tempCount);
			countProducts=countProducts+tempCount;
			System.out.println("Total Count:"+(countProducts));
			try {
			if(driver.findElement(By.xpath("//a[contains(text(),'Next')]")).isDisplayed()) {
				driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
				pageNo++;
			}
			
			else {
				pageNo++;
				 prod=driver.findElements(By.xpath("//div[@data-component-id and @data-index]"));
				 tempCount=prod.size();
				System.out.println("Page:"+pageNo+"    Contains:"+tempCount);
				countProducts=countProducts+tempCount;
				System.out.println("Total Count:"+(countProducts));
				loopUntil=false;
			}
			}catch(Exception e) {
				System.out.println(e);
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			
				System.out.println(e);
			}
		}while(loopUntil);
	}
	public static void main(String[] args) {
		
		AmazonTry at=new AmazonTry();
		at.createDriver("chrome");
		at.selectingProducts();
		
	}

}
