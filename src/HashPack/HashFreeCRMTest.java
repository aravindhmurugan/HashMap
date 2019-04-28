package HashPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HashFreeCRMTest {
	
	public WebDriver driver;
	public String Credentials;
	public String Credentialsinfo[];
		
		@BeforeMethod
		public void setUp() {
			
			System.setProperty("webdriver.chrome.driver","E:/My Backups/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://classic.crmpro.com");
		}
		
		@Test
		
		public void loginfreecrm() throws InterruptedException {
			
			Credentials = HashData.getUserLoginInfo().get("unpwd");
			Credentialsinfo = Credentials.split("_");
			
			driver.findElement(By.name("username")).sendKeys(Credentialsinfo[0]);
			driver.findElement(By.name("password")).sendKeys(Credentialsinfo[1]);
			
//			Thread.sleep(7000);
			
//			driver.switchTo().frame("intercom-borderless-frame");
			
//			Actions action = new Actions(driver);
			
//			action.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'intercom-chat-card-author')]"))).build().perform();
			
//			Thread.sleep(1000);
		
//			driver.findElement(By.xpath("//div[contains(@class,'intercom-borderless-dismiss-button')]//span")).click();
			
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			Thread.sleep(1000);
			
			driver.switchTo().frame("mainpanel");
			
			Select select = new Select(driver.findElement(By.name("slctMonth")));
			
			select.selectByVisibleText(HashData.getmonthmap().get(5));
	}
		
		@AfterMethod
			
		public void tearDown(){
			driver.quit();
			}
	}


