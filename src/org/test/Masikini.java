package org.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Masikini {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://masikini.com/");

		driver.findElement(By.xpath("//a[text()='Laptops']")).click();

		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[text()='ASUS TUF Gaming Laptop, 15.6”...']")).click();

		Thread.sleep(10000);

		driver.findElement(By.xpath("//a[text()='ADD TO CART ']")).click();

		Thread.sleep(5000);

		driver.findElement(By.id("Lemail")).sendKeys("torresaudi180@gmail.com", Keys.ENTER);
		driver.findElement(By.id("Lpass")).sendKeys("Torres@180", Keys.ENTER);

		driver.findElement(By.xpath("//button[text()='Login']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='ADD TO CART ']")).click();

		driver.findElement(By.xpath("(//a[@href='cart.php'])[3]")).click();

		List<WebElement> lstProducts = driver.findElements(By.xpath("//h6[@class='text-primary']"));
		System.out.println("****Products in Cart****");
		for (int i = 0; i < lstProducts.size(); i++) {
			WebElement product = lstProducts.get(i);
			System.out.println(product.getText());
		}

		// driver.findElement(By.xpath("//button[text()='SIGNUP NOW']")).click();
		//
		// driver.findElement(By.xpath("//button[text()='CREATE MASIKINI
		// ACCOUNT']")).click();
	}

}
