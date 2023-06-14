package seleniumPracticals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {

	public static void main(String[] args)throws InterruptedException {
		
		// 1.Setup chrome driver configuration
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INSIGHT\\eclipse-workspace\\WebAutomationSelenium\\ThirdPartyResource\\ChromeDrivers\\V102.exe");
		
		
		String burl="https://www.facebook.com/login/";
		
		//2.Initialize the web driver component and assign chrome driver
		WebDriver chromeDriver=new ChromeDriver();
		
		//3.call chrome browser maximize it and keep in the full screen
		chromeDriver.manage().window().maximize();
		
		//4.Provide the url and call the web page
		chromeDriver.get(burl);
		
		WebElement textBox=chromeDriver.findElement(By.xpath("//*[@id=\"email\"]"));
		textBox.sendKeys("a@gmail.com");
		System.out.println("username has sent");
		
		
		WebElement textBox1 =chromeDriver.findElement(By.xpath("//*[@id=\"pass\"]"));
		textBox1.sendKeys("*****");
		System.out.println("password has sent");
		
		WebElement button=chromeDriver.findElement(By.name("login"));
		button.click();
		System.out.println("submit button has selected");
		
		
		
	}

}
