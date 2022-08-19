package week2.day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Divya");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("San");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Divya@123");
	WebElement Date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select option=new Select(Date);
	option.selectByIndex(6);
	WebElement Month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Select option1=new Select(Month);
	option1.selectByIndex(7);
	WebElement Year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	Select option2=new Select(Year);
	option2.selectByIndex(25);
	driver.findElement(By.xpath("//label[@class='_58mt']")).click();
	
	
}
}
