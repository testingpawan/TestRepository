package com.testing;



import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Googletest
{
	
    @Test
	public void one(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\INTACT\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println("Google page opened");


	}
	
}