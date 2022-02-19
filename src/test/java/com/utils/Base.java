package com.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;

	public static void getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ravi Kiran\\eclipse-workspace\\Trinee\\com.Greentechnologies\\src\\driver\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void quitBrowser() {
		driver.quit();

	}

	public static void insertType(WebElement ele, String value) {
		ele.sendKeys(value);

	}

	public static void click(WebElement ele) {
		ele.click();
	}

	public void iwait(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
}
