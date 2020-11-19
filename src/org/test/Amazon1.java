package org.test;

import java.awt.AWTException;
import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.amazon.in/");

		driver.manage().window().maximize();

		WebElement productSearch = driver.findElement(By.id("twotabsearchtextbox"));
		productSearch.sendKeys("dell laptop", Keys.ENTER);

		System.out.println("****List of Products for Dell Laptop****");

		// Storing the products List in Set to remove Duplicates
		Set<String> productList = new LinkedHashSet<>();

		for (int i = 1; i <= 22; i++) {

			WebElement txtProduct = driver.findElement(
					By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])" + "[" + i + "]"));
			String productInfo = txtProduct.getText();
			productList.add(productInfo);

		}
		// Iterating and displaying the products in Set
		for (String product : productList) {
			System.out.println(product);

		}
		driver.quit();

	}
}
