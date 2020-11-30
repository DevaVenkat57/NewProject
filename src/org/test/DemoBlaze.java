package org.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.demoblaze.com/");

		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println(title);

		driver.findElement(By.id("login2")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("loginusername")).sendKeys("TorresAudi");

		driver.findElement(By.id("loginpassword")).sendKeys("Torres@180");

		driver.findElement(By.xpath("//button[text()='Log in']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Laptops']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='2017 Dell 15.6 Inch']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();

		Thread.sleep(2000);

		Alert al = driver.switchTo().alert();
		al.accept();

		driver.findElement(By.xpath("//a[text()='Home ']")).click();
		
		Thread.sleep(2000);


		driver.findElement(By.xpath("//a[text()='Iphone 6 32gb']")).click();
		
		Thread.sleep(2000);


		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();

		Thread.sleep(2000);

		Alert al1 = driver.switchTo().alert();
		al1.accept();

		driver.findElement(By.xpath("//a[text()='Cart']")).click();

		WebElement table = driver
				.findElement(By.xpath("//table[@class='table table-bordered table-hover table-striped']"));
 //		String text = table.getText();
 //		System.out.println(text);
	Thread.sleep(2000);
		WebElement tableProduct = table.findElement(By.id("tbodyid"));

		List<WebElement> lsttableRows = tableProduct.findElements(By.tagName("tr"));
		for (int i = 0; i < lsttableRows.size(); i++) {
			WebElement tableRow = lsttableRows.get(i);
			List<WebElement> lstProductsAddedinCart = tableRow.findElements(By.tagName("td"));
			Thread.sleep(2000);
			for (WebElement prodCart : lstProductsAddedinCart) {
				String data = prodCart.getText();
				System.out.println(data);
			}
			System.out.println("");
		}

		WebElement productadded = driver.findElement(By.xpath("//div[@class='col-lg-1']"));
		String text2 = productadded.getText();
		System.out.println(text2);

	}

}
