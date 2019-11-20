package blue.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException, AWTException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srile\\Documents\\New folder\\SriNew\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		
		
		WebElement btn2 = driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[6]"));
		btn2.click();

		Thread.sleep(3000);

		
		WebElement f = driver.findElement(By.xpath("//a[@title='Chairs']"));
		f.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
