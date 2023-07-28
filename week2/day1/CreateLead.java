package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	
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
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("IT Solutions");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Santoshi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Aparajithan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Santo");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing Solutions");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("santoshiaparajithan@gmail.com");
		WebElement drop = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select options=new Select(drop);
		options.selectByValue("NY");
		driver.findElement(By.className("smallSubmit")).click();
		
		
	}

}
