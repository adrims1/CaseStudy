package caseStudy;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaseStudy {
	WebDriver driver;

	
	@BeforeSuite
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Jar Files\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@BeforeTest
	public void OpenAUT() {
		driver.get("https://www.flipkart.com/");
	}
	/**
	 * @throws InterruptedException 
	 * 
	 */
	@Test
	public void Searchbook() throws InterruptedException {
		
		//driver.findElement(By.className("_2AkmmA _29YdH8")).click();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Part 1
		// Get the main window name
		String mw = driver.getWindowHandle();
		System.out.println("Main window name is:- " + mw);
		System.out.println("===============================================================");
		//Thread.sleep(5000);

		// Part 2
		// Click on the button to open a new window
		//driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		// Get the names of all the windows opened
		Set<String> allwn = driver.getWindowHandles();
		System.out.println("All window names are:- " + allwn);
		System.out.println("===============================================================");
		Thread.sleep(5000);
		// Part 3
				// Get all the window names and run them in the for loop

				for (String sw : driver.getWindowHandles()) {
					Thread.sleep(5000);

					driver.switchTo().window(sw);
					// B is my active window and I will switch from B to A window with this command

					Thread.sleep(5000);

					driver.switchTo().window(sw);
					// A is active window so it will switch from A to B window

				}
		
		  driver.findElement(By.className("LM6RPg")).sendKeys("Selenium book"); 
		  driver.findElement(By.className("vh79eN")).click();
		 // WebDriverWait wait=new WebDriverWait(driver,10);
		  //WebElement myElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title='Selenium WebDriver 1st  Edition']")));
		  WebDriverWait wait = new WebDriverWait(driver, 15);
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Selenium WebDriver 1st  Edition']"))).click();
			Thread.sleep(9000);
			
		  
				

		  
		//*[@id="container"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div[1]/div/a[2]
		  //act = new Actions(driver); act.sendKeys(Keys.ENTER);
		  //driver.findElement(By.cssSelector("//div[@class='1k1QCg']")("_2cLu-l")).click();
		  //driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("110001"); 
			//driver.findElement(By.className("_2zrpKA _14H79F")).sendKeys("247001");
			Thread.sleep(9000);
			//driver.findElement(By.id("pincodeInputId")).clear();
			//driver.findElement(By.id("pincodeInputId")).sendKeys("247001");
			
			
			//driver.findElement(By.xpath("//*[@id='pincodeInputId']")).sendKeys("247001");
			driver.findElement(By.className("_3X4tVa")).sendKeys("247001");
			
			
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"))).click();
		  driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
		 
		
	}
}
