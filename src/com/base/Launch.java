package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class Launch {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new SafariDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement txtLogin = driver.findElement(By.xpath("//h2[contains(text(),'f')]"));
		String text = txtLogin.getText();
		System.out.println(text);
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("spk9009");
		String attribute = txtPassword.getAttribute("value");
		System.out.println(attribute);

		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("ptaveenkmr484@gmail.com");

		String attribute2 = txtUserName.getAttribute("value");
		System.out.println(attribute2);
		Thread.sleep(3000);

		WebElement txtPassword1 = driver.findElement(By.id("pass"));
		txtPassword1.click();

	}

}
