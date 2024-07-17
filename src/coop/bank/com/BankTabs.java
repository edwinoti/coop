package coop.bank.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BankTabs {
	
	private WebDriver driver;
	
	public BankTabs(String driverPath) {
		System.setProperties("webdriver.chrome.driver", driverPath);
		ChromeOptions options = new ChromeOptions();
		
		this.driver = new ChromeDriver(options);
	}
	
	public void openLink() {
		driver.get("https://www.co-opbank.co.ke/");
	}
	
	public void openTabs1() {
		WebElement personalBanking = driver.findElement(By.xpath("//*[@id=\"menu-item-757\"]/a"));
		personalBanking.click();
		
		//click on sub menu
		WebElement cardMenu = driver.findElement(By.xpath("//*[@id=\"menu-item-1255\"]/a"));
		cardMenu.click();
		
		
		//click on more about card platnum
		WebElement moreAboutCardPlat = driver.findElement(By.xpath("//*[@id=\"content\"]/main/div[5]/div[2]/div[2]/div/div/div[4]/div/div[2]/div[2]/a"));
		moreAboutCardPlat.click();
		
		//fill the card information form
		
		WebElement name = driver.findElement(By.id("input_1_1"));
		name.sendKeys("Edwin");
		
		WebElement phoneNumber = driver.findElement(By.id("input_1_2"));
		phoneNumber.sendKeys("07900000000");
		
		WebElement town = driver.findElement(By.id("input_1_4"));
		town.sendKeys("Nairobi");
		
		WebElement email = driver.findElement(By.id("input_1_3"));
		town.sendKeys("edwinotieno27@gmail.com");
		
		WebElement enquiry = driver.findElement(By.id("input_1_5"));
		enquiry.sendKeys("text data");
		
		WebElement robot = driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[4]"));
		robot.click();
		
		
		
	}
	
	public void openTabs2() {
		WebElement businessBanking = driver.findElement(By.xpath("//*[@id=\"menu-item-756\"]/a"));
		businessBanking.click();
	}
	
	public void openTabs3() {
		WebElement corprateBanking = driver.findElement(By.xpath("//*[@id=\"menu-item-271381\"]/a"));
		corprateBanking.click();
	}
	
	public void openTabs4() {
		WebElement groupBanking = driver.findElement(By.xpath("//*[@id=\"menu-item-753\"]/a"));
		groupBanking.click();
	}
	
	public void openTabs5() {
		WebElement investingBanking = driver.findElement(By.xpath("//*[@id=\"menu-item-752\"]/a"));
		investingBanking.click();
	}
	
	
	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.quit();
		
	}

}
