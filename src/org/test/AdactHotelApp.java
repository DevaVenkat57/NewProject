package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactHotelApp {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://adactinhotelapp.com/");
		driver.manage().window().maximize();

		WebElement txtUserName = driver.findElement(By.id("username"));
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtUserName.sendKeys("DevaVenkat57");
		txtPassword.sendKeys("Audi@560");

		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();

		WebElement dDnLocation = driver.findElement(By.id("location"));
		Select sel = new Select(dDnLocation);
		sel.selectByValue("Adelaide");

		WebElement dDnHotel = driver.findElement(By.id("hotels"));
		Select sel1 = new Select(dDnHotel);
		sel1.selectByIndex(3);

		WebElement dDnRoom = driver.findElement(By.id("room_type"));
		Select sel2 = new Select(dDnRoom);
		sel2.selectByValue("Super Deluxe");

		WebElement dDnNumberofRooms = driver.findElement(By.id("room_nos"));
		Select sel3 = new Select(dDnNumberofRooms);
		sel3.selectByValue("3");

		WebElement txtCheckInDate = driver.findElement(By.id("datepick_in"));
		txtCheckInDate.clear();
		txtCheckInDate.sendKeys("25/11/2020");

		WebElement txtCheckOutDate = driver.findElement(By.id("datepick_out"));
		txtCheckOutDate.clear();
		txtCheckOutDate.sendKeys("27/11/2020");

		WebElement dDnAdultsPerRoom = driver.findElement(By.id("adult_room"));
		Select sel4 = new Select(dDnAdultsPerRoom);
		sel4.selectByVisibleText("3 - Three");

		WebElement dDnChildPerRoom = driver.findElement(By.id("child_room"));
		Select sel5 = new Select(dDnChildPerRoom);
		sel5.selectByVisibleText("2 - Two");

		WebElement btnSubmit = driver.findElement(By.id("Submit"));
		btnSubmit.click();

		WebElement btnRadioButton = driver.findElement(By.id("radiobutton_0"));
		btnRadioButton.click();

		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();

		WebElement txtFirstName = driver.findElement(By.id("first_name"));
		txtFirstName.sendKeys("James");

		driver.findElement(By.id("last_name")).sendKeys("Henry");

		driver.findElement(By.id("address")).sendKeys("Mint Street Texas United States");

		driver.findElement(By.id("cc_num")).sendKeys("7854457896321452");

		WebElement dDnCCType = driver.findElement(By.id("cc_type"));
		Select sel6 = new Select(dDnCCType);
		sel6.selectByValue("MAST");

		WebElement dDnExpiryDate = driver.findElement(By.id("cc_exp_month"));
		Select sel7 = new Select(dDnExpiryDate);
		sel7.selectByVisibleText("February");

		WebElement dDnExpiryYear = driver.findElement(By.id("cc_exp_year"));
		Select sel8 = new Select(dDnExpiryYear);
		sel8.selectByVisibleText("2022");

		driver.findElement(By.id("cc_cvv")).sendKeys("982");
		
		driver.findElement(By.id("book_now")).click();

		// driver.quit();

	}

}
