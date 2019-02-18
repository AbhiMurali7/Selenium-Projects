package gloginpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Glogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.get("https://www.gmail.com");
		d.findElement(By.id("identifierId")).sendKeys("abhimurali7196@gmail.com");
		d.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		d.findElement(By.name("password")).sendKeys("123456");
		d.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();


	}

}
