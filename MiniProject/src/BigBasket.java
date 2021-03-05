import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class BigBasket {
	WebDriver driver;
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C://DriversWeb//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
		
	}
	public void selectMenus(String menuOne,String menuTwo,String menuThree) {
		Actions action=new Actions(driver);
		
		
		List<WebElement> categoryMenu=driver.findElements(By.xpath("//div[@id='navbar']/ul/li/a"));
		for(int i=0;i<categoryMenu.size();i++) {
			String checkMenu=categoryMenu.get(i).getText();
			if(checkMenu.equals("SHOP BY CATEGORY")) {
				categoryMenu.get(i).click();
				break;
			}
		}
		
		
		List<WebElement> firstMenu=driver.findElements(By.xpath("//ul[@id='navBarMegaNav']/li"));
		for(int i=0;i<firstMenu.size();i++) {
			String checkMenu=firstMenu.get(i).getText();
			if(checkMenu.equals(menuOne)) {
				action.moveToElement(firstMenu.get(i)).build().perform();
				break;
			}
		}
		
		WebElement secondsubMenu=driver.findElement(By.partialLinkText(menuTwo));
		action.moveToElement(secondsubMenu).build().perform();
		WebElement thirdsubMenu=driver.findElement(By.partialLinkText(menuThree));
		action.moveToElement(thirdsubMenu).build().perform();
		action.click().perform();
		System.out.println("Title :"+driver.getTitle());
		System.out.println("Page URL:"+driver.getCurrentUrl());
		

	}
	public void closeDriver() {
		driver.close();
	}
	public static void main(String[] args) {
		String firstSubMenu="Beauty & Hygiene";
		String secondSubMenu="Hair Care";
		String thirdSubMenu="Hair Styling";
		BigBasket bb=new BigBasket();
		bb.createDriver();
		bb.selectMenus(firstSubMenu, secondSubMenu, thirdSubMenu);
		bb.closeDriver();

		
	}
	
}
