package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	
	public static void main(String[] args)throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saurabh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver komal=new ChromeDriver();
		Thread.sleep(4000);
		komal.get("https://www.amazon.com/");
		
	}
	
	

}
