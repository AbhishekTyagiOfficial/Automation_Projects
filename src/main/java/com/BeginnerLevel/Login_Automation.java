package com.BeginnerLevel;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Login_Automation {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		String[] usernames = { 
				"locked_out_users",
				"problem_users",
				"performance_glitch_users",
				"standard_user" 
				};
		
		String password = "secret_sauce";
		boolean LogedIn = false;
		
		for (String user : usernames)
		{
			WebElement UserName = driver.findElement(By.id("user-name"));
			UserName.sendKeys(user);
			
			Thread.sleep(1000);
			
			WebElement UserPass = driver.findElement(By.id("password"));
			UserPass.sendKeys(password);
			
			Thread.sleep(1000);
			
			WebElement Login = driver.findElement(By.id("login-button"));
			Login.click();
			
			if (driver.getCurrentUrl().contains("inventory"))
			{
				System.out.println("User Loged In : " + user);
				LogedIn = true;
				break;
			} else {
				System.out.println("User Not Loged In : " + user);
				driver.navigate().refresh();
			}
			
		}
		if (!LogedIn) {
			System.out.println("Users ID and Password not match ");
		}
		
		Thread.sleep(2000);

		WebElement item1 = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		item1.click();

		Thread.sleep(1000);

		WebElement addtocart1 = driver.findElement(By.xpath("//button[text()='Add to cart']"));

		addtocart1.click();

		Thread.sleep(3000);

		WebElement remove1 = driver.findElement(By.xpath("//button[@id='remove']"));
		remove1.click();

		Thread.sleep(1000);

		WebElement addtocart2 = driver.findElement(By.xpath("//button[text()='Add to cart']"));
		addtocart2.click();

		Thread.sleep(2000);

		WebElement cart = driver.findElement(By.xpath("//a[@data-test='shopping-cart-link']"));
		cart.click();

		WebElement checkout = driver.findElement(By.xpath("//button[@name='checkout']"));
		checkout.click();

		WebElement fname = driver.findElement(By.id("first-name"));
		fname.sendKeys("sher");

		WebElement lname = driver.findElement(By.id("last-name"));
		lname.sendKeys("Tiger");

		WebElement zip = driver.findElement(By.xpath("//input[@data-test='postalCode']"));
		zip.sendKeys("248002");

		Thread.sleep(2000);

		WebElement contbtn = driver.findElement(By.id("continue"));
		contbtn.click();

		Thread.sleep(1000);

		// Take ScreenShot
		try {
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			File destination = new File("Screenshot.png");

			FileHandler.copy(screenshot, destination);

			System.out.println("Take Screenshot successfully");
		} catch (Exception e) {
			e.getMessage();
		}

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		WebElement finishbtn = driver.findElement(By.id("finish"));
		finishbtn.click();

		Thread.sleep(1000);

		WebElement backhome = driver.findElement(By.xpath("//button[@id='back-to-products']"));
		backhome.click();

		Thread.sleep(1000);

		// Dropdown
		Select objselect = new Select(driver.findElement(By.className("product_sort_container")));
		objselect.selectByIndex(2);

		Thread.sleep(1000);

		WebElement hamburger = driver.findElement(By.id("react-burger-menu-btn"));
		hamburger.click();

		Thread.sleep(1000);

		WebElement hamburgerclsbtn = driver.findElement(By.id("react-burger-cross-btn"));
		hamburgerclsbtn.click();
		
		Thread.sleep(2000);
		
		driver.quit();

	

	}

}
