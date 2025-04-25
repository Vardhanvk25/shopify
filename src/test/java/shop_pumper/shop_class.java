package shop_pumper;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class shop_class {

@Test
public static void main(String args[]) throws InterruptedException {

	ChromeDriver dr = new ChromeDriver();
	dr.manage().deleteAllCookies();
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	dr.get("https://admin.shopify.com/store/vkenter/apps/discount-app-staging-3");
	dr.findElement(By.xpath("//input[@id='account_email']")).sendKeys("govardhanmail1225@gmail.com");
	Thread.sleep(12000);
	WebElement email = dr.findElement(By.xpath("//span[text()='Continue with email']"));
	email.click();
	Thread.sleep(12000);
	dr.findElement(By.id("account_password")).sendKeys("shopifypass@");
	Thread.sleep(12000);
	dr.findElement(By.xpath("//span/span[contains(text(),'Log')]")).click();
	Thread.sleep(20000);
	dr.switchTo().frame("app-iframe");
	WebElement offer = dr.findElement(By.xpath("//span[text()='Create new offer']"));
	offer.click();
	dr.findElement(By.xpath("//span[text()='Create a Bundle']")).click();
	dr.findElement(By.xpath("//span[text()='Select Products']")).click();
	dr.switchTo().defaultContent();
	dr.findElement(By.xpath("//ul//li[@class='_Root_s76bm_1']")).click();
	dr.findElement(By.xpath("//ul//li[@class='_Root_s76bm_1'][2]")).click();
	dr.findElement(By.xpath("//span[text()='Add']")).click();
	dr.switchTo().frame("app-iframe");
	WebElement drop = dr.findElement(By.xpath("//select[@class='Polaris-Select__Input']"));
	Select dropobj = new Select(drop);
	dropobj.selectByValue("flat");
	dr.switchTo().defaultContent();
	dr.switchTo().frame("app-iframe");
	dr.findElement(By.xpath("//button//span[text()='Publish']")).click();
	//button//span[text()='Publish']
	}		
}
