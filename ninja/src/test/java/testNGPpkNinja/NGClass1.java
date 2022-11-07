package testNGPpkNinja;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NGClass1 {
	@Test
	public void methodA() throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

//======================login Credential=============================================

		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("(//a[text()='Login'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sarodeash28@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ashish28");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Account']")).isDisplayed());
//======================Search Item=====================================================
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Samsung Galaxy Tab 10.1");
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();

//==========================Add Item===========================================
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[@class='price']")).isDisplayed());
		
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
//=============================================================================================
		// driver.findElement(By.xpath("//div[*='shopping cart']/a[text()='shopping
		// cart']")).click();
//===============================go kart=======================================
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@data-toggle='dropdown'])[2]")).click();

		// div[@id='cart']
		driver.findElement(By.xpath("(//p[@class='text-right']/a)[1]")).click();
		// driver.findElement(By.xpath("")).click();

//=============================add qty=============================
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("2");
		driver.findElement(By.xpath("//button[@data-original-title='Update']")).click();
		
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).isDisplayed());
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.close();
//=========================test2==========================================
		
	}
	
	@Test
	public void iphone() throws InterruptedException 
	{
WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
//======================login Credential=============================================
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("(//a[text()='Login'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sarodeash28@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ashish28");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Account']")).isDisplayed()); 
//======================Search Item=====================================================
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("iphone");
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		
//==========================Add Item===========================================
		Assert.assertTrue(driver.findElement(By.xpath("//p[@class='price']")).isDisplayed());
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
//=============================================================================================
		//	driver.findElement(By.xpath("//div[*='shopping cart']/a[text()='shopping cart']")).click();
//===============================go kart=======================================
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@data-toggle='dropdown'])[2]")).click();	
		
				//div[@id='cart']
	driver.findElement(By.xpath("(//p[@class='text-right']/a)[1]")).click();	
	//	driver.findElement(By.xpath("")).click();
		
//=============================add qty=============================
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("2");
		driver.findElement(By.xpath("//button[@data-original-title='Update']")).click();
		driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).isDisplayed());
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		
		driver.close();
		
	}

}
