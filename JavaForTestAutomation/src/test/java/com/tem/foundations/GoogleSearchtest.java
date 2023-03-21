package com.tem.foundations;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

/**
 * @author CB815KC
 * @project JavaDemo
 * @date 08 March 2023
 */

public class GoogleSearchtest {

	private WebDriver driver;
	By registerLocator = By.linkText("REGISTER");
	By registerpageLocator = By.xpath("//img [@src='images/mast_register.gif']");
	By registeruserLocator = By.id("email");
	By pswuserLocator = By.name("password");
	By confirmuserLocator = By.cssSelector("input[name='confirmPassword']");
	By BtnuserregiterLocator = By.cssSelector("input[type='submit']");

	By userLocator = By.name("userName");
	By passwordLocator = By.cssSelector("input[type='password']");
	By LoginLocator = By.name("submit");

	By FlighLocator = By.linkText("Flights");
	By viewflightsLocator = By.xpath("//img [@src='images/mast_flightfinder.gif'] ");

	By HotelLocator = By.linkText("Hotels");
	By viewhotelsLocator = By.xpath("//img [@src='images/mast_construction.gif'] ");
	By BackhomeLocator = By.xpath("//img [@src='images/home.gif'] ");

	By Signoffuser = By.linkText("SIGN-OFF");

	@Before
	public void Setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CB815KC\\eclipse-workspace\\JavaForTestAutomation\\src\\test\\resources\\drivers\\chromedriver.exe"); // Logs

		// Initialize browser
		driver = new ChromeDriver();
		// * Open URL
		driver.get("https://demo.guru99.com/test/newtours/");
		// Maximize window
		driver.manage().window().maximize();
	}

	@After
	public void Teardown() {
		// driver.quit();
	}

	@Test
	public void RegisterUser() throws InterruptedException {

		driver.findElement(registerLocator).click();
		if (driver.findElement(registerpageLocator).isDisplayed())
			;
		driver.findElement(registeruserLocator).sendKeys("usertest1");
		driver.findElement(pswuserLocator).sendKeys("Em123456");
		driver.findElement(confirmuserLocator).sendKeys("Em123456");
		driver.findElement(BtnuserregiterLocator).click();

	}

	@Test
	public void signin() throws InterruptedException {
		if (driver.findElement(userLocator).isDisplayed()) {
			driver.findElement(userLocator).sendKeys("usertest1");
			driver.findElement(passwordLocator).sendKeys("Em123456");
			driver.findElement(LoginLocator).click();
		}
	}

	@Test
	public void ViewBooking() throws InterruptedException {

		driver.findElement(FlighLocator).click();
		if (driver.findElement(viewflightsLocator).isDisplayed()) {

		}

	}

	@Test
	public void SearchHotels() throws InterruptedException {

		driver.findElement(HotelLocator).click();
		By viewhotelsLocator = By.xpath("//img [@src='images/mast_construction.gif']");
		driver.findElement(BackhomeLocator).click();

	}

	@Test
	public void Signoff() throws InterruptedException {

		driver.findElement(Signoffuser).click();
		if (driver.findElement(Signoffuser).isDisplayed());

	}
}