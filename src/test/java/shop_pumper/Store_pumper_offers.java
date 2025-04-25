package shop_pumper;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Store_pumper_offers {
 
	@Test
	 public static void main() throws InterruptedException {
		ChromeDriver dr = new ChromeDriver();
		dr.manage().deleteAllCookies();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.get("https://vkenter.myshopify.com/");
		dr.findElement(By.id("password")).sendKeys("ahldeu");
		dr.findElement(By.xpath("//button[text()='Enter']")).click();
		Thread.sleep(5000);
		dr.findElement(By.linkText("over white")).click();
		WebElement Validate = dr.findElement(By.xpath("//button[contains(text(),'Add Bundle To Cart')]"));
		boolean Result = Validate.isDisplayed();
		if(Result=true){
			System.out.println("Test passed");
		}
		else{
			System.out.println("Test failed");
		}
		Thread.sleep(5000);
		dr.close();	
	}

}
