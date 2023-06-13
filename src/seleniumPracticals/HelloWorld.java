package seleniumPracticals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.Setup chrome driver configuration
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INSIGHT\\eclipse-workspace\\WebAutomationSelenium\\ThirdPartyResource\\ChromeDrivers\\V102.exe");
		
		//2.Initialize the web driver component and assign chrome driver
		WebDriver driver =new ChromeDriver();
		
		//3.call chrome browser maximize it and keep in the full screen
		driver.manage().window().maximize();
		
		//4Provide the url and call the web page
		driver.get("https://www.sliit.lk/");
	}

}
