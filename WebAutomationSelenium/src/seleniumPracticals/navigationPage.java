package seleniumPracticals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationPage {

	public static void main(String[] args) throws InterruptedException {
	
		//1. setup chrome driver configuration
				System.setProperty("webdriver.chrome.driver","C:\\Users\\INSIGHT\\eclipse-workspace\\WebAutomationSelenium\\ThirdPartyResource\\ChromeDrivers\\104.exe");
				
				String baseurl="file:///E:/QA%20course/SLIIT%20SQA%20Batch%2021%20Recordings/Lecture%20Materials/Day%205,6,7,8%20and%209/Practical%20HTML-Materials/Navigation%20Windows.html";
				
				//2.Initialize the web driver component and assign the chomedriver
				WebDriver chromeDriver=new ChromeDriver();
				
				//3. maximize the window
				chromeDriver.manage().window().maximize();
				
				//4.call the web page
				chromeDriver.get(baseurl);
				Thread.sleep(5000);
				
				
				
				WebElement textBox=chromeDriver.findElement(By.xpath("//*[@id=\"regForm\"]/div[1]/p[1]/input"));
				textBox.sendKeys("Malshi ");
				Thread.sleep(5000);
				System.out.println("username has sent");
				
				WebElement textBox1=chromeDriver.findElement(By.xpath("/html/body/form/div[1]/p[2]/input"));
				textBox1.sendKeys("Tharusha ");
				Thread.sleep(5000);
				System.out.println("username has sent");
				
				
				
				WebElement opt1RadioButton=chromeDriver.findElement(By.xpath("//*[@id=\"regForm\"]/div[1]/p[3]/input[1]"));
				WebElement opt2RadioButton=chromeDriver.findElement(By.xpath("//*[@id=\"regForm\"]/div[1]/p[3]/input[2]"));
				opt2RadioButton.click();
				
				if(opt1RadioButton.isSelected()) {
					System.out.println("I have been selected opt1");	
				}else {
					System.out.println("I have been selected opt2");
				}
				
				WebElement button=chromeDriver.findElement(By.xpath("//*[@id=\"nextBtn\"]"));
				button.click();
				System.out.println("submit button has selected");
				
				WebElement textBox2=chromeDriver.findElement(By.xpath("//*[@id=\"regForm\"]/div[2]/p[1]/input"));
				textBox2.sendKeys("kkkkkk ");
				Thread.sleep(5000);
				System.out.println("username has sent");
				
				WebElement textBox3=chromeDriver.findElement(By.xpath("//*[@id=\"regForm\"]/div[2]/p[2]/input"));
				textBox3.sendKeys("123456987 ");
				Thread.sleep(5000);
				System.out.println("username has sent");
				
				WebElement button1=chromeDriver.findElement(By.xpath("//*[@id=\"prevBtn\"]"));
				button1.click();
				System.out.println("submit button has selected");
				
				WebElement button2=chromeDriver.findElement(By.xpath("//*[@id=\"nextBtn\"]"));
				button2.click();
				System.out.println("submit button has selected");
	}

}
