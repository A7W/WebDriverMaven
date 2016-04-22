package ToolsQA.MavenFirstProject;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebAppUnderTest 
{
	
	@Test
	public void NavigateToURL() throws InterruptedException {
		
		WebDriver driver  = new FirefoxDriver();
		System.out.println("The Browser is open");
		
		driver.get("http://www.bbc.com");
		System.out.println("The URL is entered");
		System.out.println("...waiting for 5 seconds before closing Browser");
		
		Thread.sleep(5000L);
		System.out.println("...waiting for 5 seconds");
		
		driver.close();
		System.out.println("The Browser is closed");
}
}
