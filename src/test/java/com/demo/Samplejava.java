package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.Base;

public class Samplejava extends Base {
	
	public static void main(String[] args)
	{
		getDriver();
		getUrl("https://www.facebook.com/");
		getCurrentUrl();
		getTitle();
		WebElement txtBoxUser = driver.findElement(By.id("email"));
		insertType(txtBoxUser, "selenium");
		WebElement txtPass = driver.findElement(By.id("pass"));
		insertType(txtPass, "67890");
		
		WebElement btnlogin = driver.findElement(By.id("login"));
		click(btnlogin);
		closeBrowser();
		
	}

	
}
