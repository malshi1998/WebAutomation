package seleniumPracticals;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class instaLog {
 
public String baseUrl="https://www.instagram.com/accounts/login/?"; 
	
	String driverPath= "C:\\Users\\INSIGHT\\eclipse-workspace\\WebAutomationSelenium\\ThirdPartyResource\\ChromeDrivers\\104.exe";
	public WebDriver driver;
  


	

public void cllBrowser() {
	
	System.setProperty("webdriver.chrome.driver", driverPath);
	driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(baseUrl);
}
	@Test
	public void login() throws InterruptedException {

		WebElement textBox=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));
		textBox.sendKeys("ha@gmail.com");
		Thread.sleep(5000);
		
		WebElement textBox1=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"));
		textBox1.sendKeys("12345m");
		Thread.sleep(5000);
		
		WebElement button=driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div[1]/div[2]/form/div/div[3]"));
		button.click();
	} 

}
