package Git_Maven_Project.Git_Repo;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//Secure shell cryptography
public class LoginTest {
public static WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\LatestChromeDriverExe\\chromedriver.exe");
		driver=new ChromeDriver();
		
		}
	
	@Test
	public void doLogin(){
		System.out.println("Executing Login Test");
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("vairajapu@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("vai2017raj");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
	
	@AfterTest
	public void QuitDriver(){
	if (driver!=null)
		driver.close();
	}
	

}
