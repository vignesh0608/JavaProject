package com.MiniProject.RediffMail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
public class CreateRediffAccount {
	public static WebDriver driver; 
	private List<WebElement> countries; //To store country List
	private String baseUrl; //contains the  URL of the WebPage
	Select selectCountry;
	
	
	// Method is used to Set the driver properties
	public void createDriver(String browser) {
		if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C://DriversWeb//geckodriver.exe");
			baseUrl="https://mail.rediff.com/cgi-bin/login.cgi ";
			driver=new FirefoxDriver();
		}else if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C://DriversWeb//chromedriver.exe");
			baseUrl="https://mail.rediff.com/cgi-bin/login.cgi ";
			driver=new ChromeDriver();
		}
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}
	

	// Methods Closes All the Browser Tabs
	public void closeBrowser() {
		driver.quit();
	}
	
	
	//Method finds the WebElement and stores into a list
	public void setCountryValues() {
		driver.findElement(By.partialLinkText("Create a new account")).click();
		WebElement country=driver.findElement(By.xpath("//*[@id='country']"));
		selectCountry=new Select(country);
		countries=selectCountry.getOptions();
	}
	
	
	//Method Displays the Country list and Does the expected Test cases
	public void getCountryValues(){
		for(int i=0;i<countries.size();i++) {
			System.out.println((i+1)+" "+countries.get(i).getText());
		}
		System.out.println("Total Number of Countires"+countries.size());
		System.out.println("Selected Country is:"+(selectCountry.getFirstSelectedOption().getText()));
		String name=selectCountry.getFirstSelectedOption().getText();
		if(name.equals("India")) {
			System.out.println("Selected Country matches the expected Country!!!");
		}
		else {
			System.out.println("Selected Country is not matched with the  expected Country!!!");
		}	
	}
	
	
	//Method used to select the country
	public void selectCountry(String countryName) {
		selectCountry.selectByVisibleText(countryName);
	}
	
	
	//Main Function
	public static void main(String[] args) {
		CreateRediffAccount cra=new CreateRediffAccount();
		String countryName="India";
		cra.createDriver("firefox");
		cra.setCountryValues();
		cra.selectCountry(countryName);
		cra.getCountryValues();
		cra.closeBrowser();
		countryName="Niger";
		cra.createDriver("chrome");
		cra.setCountryValues();
		cra.selectCountry(countryName);
		cra.getCountryValues();
		cra.closeBrowser();
	}

}
