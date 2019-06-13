import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CaseStudy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Jar Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().setScriptTimeout(100, TimeUnit.SECONDS);
		driver.get("https://www.edureka.co/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"search-inp\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"search-inp\"]")).sendKeys("Selenium");
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER);
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Selenium Certification Training"))).click();
		///add steps
		 
		//driver.findElement(By.linkText("Selenium Certification Training")).click();
	
		
		
		//title
		String appTitle = driver.getTitle();
		
		System.out.println(appTitle);
		
		///ask
		
		boolean Result = appTitle.contains("Selenium Certification");
				//equals("Selenium Certification Training");
		
		System.out.println(Result);
		
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Browse")).click();
		//driver.findElement(By.linkText("See all courses")).click();
		//Thread.sleep(5000);
		
		///driver.findElement(By.("cat_btn hidden-xs giTrackElementHeader")).click();
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.linkText("See all courses"))).click();
		
		driver.quit();


	}

}
