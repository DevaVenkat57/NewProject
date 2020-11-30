package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RedBusTask {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.redbus.in/");

		driver.manage().window().maximize();

		String url = driver.getCurrentUrl();
		System.out.println(url);

		String title = driver.getTitle();
		System.out.println(title);

		// Actions acc = new Actions(driver);

		WebElement txtSource = driver.findElement(By.id("src"));

		txtSource.sendKeys("Chennai (All Locations)",Keys.ENTER);

//		Robot rob = new Robot();
//
//		rob.keyPress(KeyEvent.VK_ENTER);
//		rob.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.id("dest")).sendKeys("Bangalore (All Locations)",Keys.ENTER);

//		rob.keyPress(KeyEvent.VK_ENTER);
//		rob.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.id("onward_cal")).click();

		WebElement table = driver.findElement(By.xpath("//table[@class='rb-monthTable first last']"));
		List<WebElement> lstTableRows = table.findElements(By.tagName("tr"));
		WebElement tableRow = lstTableRows.get(7);
		WebElement lstTableData = tableRow.findElement(By.tagName("td"));
		WebElement tableData = lstTableData.findElement(By.xpath("//td[@class='current day']"));
		tableData.click();

		Thread.sleep(5000);
		WebElement ser = driver.findElement(By.xpath("//button[text()='Search Buses']"));

		ser.click();

		// boolean enabled = ser.isEnabled();
		// ser.click();
		// // driver.quit();
	}

}
