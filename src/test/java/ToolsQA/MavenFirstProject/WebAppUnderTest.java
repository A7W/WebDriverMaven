package ToolsQA.MavenFirstProject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebAppUnderTest 
{
	
	@Test
	public void NavigateToURL() throws InterruptedException {
		
	
		WebDriver driver  = new FirefoxDriver();
		WebElement element;
		
		System.out.println("The browser opens");
		
		driver.get("http://www.gmail.com");
		System.out.println("The URL is entered");
		System.out.println("...waiting for 5 seconds before closing Browser");
		
		Thread.sleep(5000L);
		System.out.println("...waiting for 5 seconds");
		
		System.out.println("Finding Element & start entering txt");
		//finding element for username txtbox
		element =  driver.findElement(By.id("Email"));
		//sending strings to element
		element.sendKeys("jenkinsfirstbuild@email.com");
		
		driver.close();
		System.out.println("The Browser is closed");
		
}
}
