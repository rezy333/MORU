package MORU.MORU;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
	public static WebDriver driver;
	@Test
	public static void loginn() {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("https://qa-desk-demo.livelyworks.net/#!/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.id("emailOrUsername")).sendKeys("demoadmin ");
	driver.findElement(By.id("password")).sendKeys("demopass12");
	driver.findElement(By.id("remember_me")).click();
	driver.findElement(By.cssSelector(".lw-btn.btn.btn-success.lw-responsive-btn")).click();
	
	
	

}
	

}
