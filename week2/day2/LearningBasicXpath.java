package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningBasicXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//step1:launch browser
		ChromeDriver driver = new ChromeDriver();
		
		//step2:load URL
		driver.get("https://login.salesforce.com/");
		
		//maximize screen
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@1234");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	
	}

}
