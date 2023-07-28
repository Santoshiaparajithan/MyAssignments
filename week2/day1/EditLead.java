package week2.day1;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.locators.RelativeLocator;


public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//step1:launch browser
				ChromeDriver driver = new ChromeDriver();
				
				//step2:load URL
				driver.get("http://leaftaps.com/opentaps/control/login");
				
				//maximize screen
				driver.manage().window().maximize();
				
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Find Leads")).click();
				
				WebElement fnam=driver.findElement(By.xpath("(//div[@id='center-content-column']/descendant::input[contains(@name,'firstName')])"));
				fnam.click();
				fnam.sendKeys("Santoshi");
				
				WebElement flbtn=driver.findElement(By.xpath("(//div[@id='center-content-column']/descendant::button[contains(text(),'Find Leads')])"));
				flbtn.click();
				
				driver.get("http://leaftaps.com/crmsfa/control/viewLead?partyId=11783");
				driver.get("http://leaftaps.com/crmsfa/control/updateLeadForm?partyId=11783");
				driver.findElement(By.id("updateLeadForm_companyName")).clear();
				driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Software Testing Solutions Pvt Ltd");
				
				WebElement update=driver.findElement(By.xpath("//input[@value='Update']"));
				update.click();
				
			//	Thread.sleep(2000);
				
			//	driver.close();
				
	
			
	}

}
