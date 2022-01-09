package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {




		WebDriverManager.chromedriver().setup();		

		//Launch the Chrome Browser

		ChromeDriver driver = new ChromeDriver();

		//Load the URL

		driver.get("http://leaftaps.com/opentaps/control/main");

		//Maximize the Browser

		driver.manage().window().maximize();


		// Getting Username element and entering value

		WebElement Username = driver.findElement(By.id("username"));	
		Username.sendKeys("DemoSalesManager");

		//Getting Password element and entering value in 

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		//Click CRM/SFA

		driver.findElement(By.linkText("CRM/SFA")).click();


		//Click on Leads Tab

		driver.findElement(By.linkText("Leads")).click();


		//Click on Find Leads

		driver.findElement(By.linkText("Find Leads")).click();
		
		
		//Click on the First Lead
		
		driver.findElement(By.linkText("10034")).click();
		
		//Click on duplicate lead button
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.close();
	}
}
