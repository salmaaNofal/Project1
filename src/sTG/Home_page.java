package sTG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Home_page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.out.println("salma" );
		
		

		WebDriver drivers ;
		drivers= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
	

 drivers.get("https://www.booking.com/");
 drivers.findElement(By.id("ss")).sendKeys("Dubai"); Thread.sleep(3000);
 drivers.findElement(By.xpath(
 "//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button/span[1]")).click();
		 
		
		
		  drivers.get("https://www.saucedemo.com/");
		  drivers.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(
		  "standard_user");
		  drivers.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(
		  "secret_sauce");
		  drivers.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		 
		drivers.getTitle();
		String mytitle=drivers.getTitle();
		
		System.out.print(mytitle);
	}

}
