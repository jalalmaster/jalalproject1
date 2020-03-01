package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
public static WebDriver driver = null;
public void setEnvironment() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\eclipse-workspace\\photon\\FrameworkTest\\Driver\\chromedriver.exe");
}

public void openBrowser() {
driver = new ChromeDriver();	
}

public void winMax() {
driver.manage().window().maximize();	
}

public void clickFunction(WebElement click,String data) {
click.sendKeys(data);	
}

public void backNavigation(WebElement backNav) {
for (int i = 0; i < 5; i++) {
backNav.click();	
}	
}
public void frontNavigation(WebElement frontNav) {
	for (int i = 0; i < 5; i++) {
		frontNav.click();	
		}	
}

public void waitMethod() {
driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);	
}

public void sleepMethod() throws InterruptedException {
Thread.sleep(5000);	
}

public void dataEnter(WebElement element,String data) throws AWTException {
element.clear();
element.sendKeys("286");
Robot r = new Robot();
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

}

}
