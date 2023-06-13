package seleniumPracticals;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 

public class facebookLogin {

	public static void main(String[] args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INSIGHT\\eclipse-workspace\\WebAutomationSelenium\\ThirdPartyResource\\ChromeDrivers\\V102.exe");
		
		// 1.Setup chrome driver configuration
		String baseURL="file:///E:/QA%20course/Selenium%20Resources/Practical%20HTML-Materials/Selenium%20Web%20Controllers.html";
		
		//2.Initialize the web driver component and assign chrome driver
		WebDriver choromeDriver =new ChromeDriver();
		
		//3.call chrome browser maximize it and keep in the full screen
		choromeDriver.manage().window().maximize();
		
		//4Provide the url and call the web page
		choromeDriver.get(baseURL);
	
		//Identify webElement 
	WebElement opt1RadioButton=choromeDriver.findElement(By.id("vfb-7-1"));
	WebElement opt2RadioButton=choromeDriver.findElement(By.id("vfb-7-2"));
	WebElement opt3RadioButton=choromeDriver.findElement(By.id("vfb-7-3"));
	
	opt2RadioButton.click();
	
	if(opt1RadioButton.isSelected()) {
		System.out.println("I have been selected opt1");	
	}else {
		System.out.println("I have been selected opt2");
	}
	
	
	
	WebElement checkBox1=choromeDriver.findElement(By.xpath("//*[@id=\"vfb-6-0\"]"));
	WebElement checkBox2=choromeDriver.findElement(By.xpath("//*[@id=\"vfb-6-1\"]"));
	WebElement checkBox3=choromeDriver.findElement(By.xpath("//*[@id=\"vfb-6-2\"]"));
	
	checkBox3.click();
	if(checkBox2.isSelected()) {
		System.out.println("I have been selected opt1");	
	}else {
		System.out.println("I have been selected opt2");
	}
	
	
	Select fruits=new Select (choromeDriver.findElement(By.id("fruits")));
	fruits.selectByVisibleText("Banana");
	fruits.selectByIndex(2);
	
	Select country=new Select(choromeDriver.findElement(By.name("country")));
	country.selectByVisibleText("ARUBA");
	
	
	WebElement button=choromeDriver.findElement(By.name("submit"));
	button.click();
	System.out.println("submit button has selected");
	
	
	WebElement textBox=choromeDriver.findElement(By.name("userName"));
	textBox.sendKeys("Malshi Livera");
	System.out.println("Sample text ahs been sent");
	
	Thread.sleep(3000);
	
	choromeDriver.findElement(By.linkText("your destination")).click();
	System.out.println("Hyperlink has selected");
	
	
		
	
	
	
	
	
	
	
}
}