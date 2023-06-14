package seleniumPracticals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLogin {

	public static void main(String[] args) throws InterruptedException {
		//1. setup chrome driver configuration
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INSIGHT\\eclipse-workspace\\WebAutomationSelenium\\ThirdPartyResource\\ChromeDrivers\\104.exe");
		
		String baseurl="https://www.instagram.com/accounts/login/?";
		
		//2.Initialize the web driver component and assign the chomedriver
		WebDriver chromeDriver=new ChromeDriver();
		
		//3. maximize the window
		chromeDriver.manage().window().maximize();
		
		//4.call the web page
		chromeDriver.get(baseurl);
		Thread.sleep(5000);
	
		WebElement textBox=chromeDriver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));
		textBox.sendKeys("ha@gmail.com");
		Thread.sleep(5000);
		System.out.println("username has sent");
		
		WebElement textBox1=chromeDriver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"));
		textBox1.sendKeys("12345m");
		Thread.sleep(5000);
		System.out.println("username has sent");
		
		WebElement button=chromeDriver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div[1]/div[2]/form/div/div[3]"));
		button.click();
		System.out.println("submit button has selected");
	
	}

}
