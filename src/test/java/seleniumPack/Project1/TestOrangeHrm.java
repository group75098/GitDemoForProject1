package seleniumPack.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOrangeHrm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadia\\eclipse-workspacce2\\SeleProj\\Browser\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://127.0.0.1/orangehrm-4.4/symfony/web/index.php/auth/login");
		  
		  driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("group75098");
		  driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("zondaF12!");
		  driver.findElement(By.xpath("//*[@class='button']")).click();
		  
		  //linkText
		  driver.findElement(By.linkText("Welcome iftekher")).click();
		  
		  Thread.sleep(300);
		  driver.findElement(By.linkText("Logout")).click();
		  

	}

}
