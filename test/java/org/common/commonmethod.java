package org.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class commonmethod
{
	public static WebDriver driver = null;
	public static WebDriver browserLaunchChrome()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\workspace\\seleproj\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public static void btclick(WebElement element)
	{
		element.click();
	}
	public static void type(WebElement element,String data)
	{
		element.sendKeys(data);
	}
	public static void loadurl(String url)
	{
		driver.get(url);
	}
}
