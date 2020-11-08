package seleniumPack.SeleProj;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DiffTeck {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadia\\eclipse-workspacce2\\SeleProj\\Browser\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/");

		 // System.out.println(driver.findElement(ByXPath.xpath("//*[@id='content']/div/div/div/div[1]/h2")).getText());
		  //System.out.println(driver.findElement(By.tagName("h2")).getText());
		  driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
		  
		  
		  Thread.sleep(400);
		  WebElement el=driver.findElement(By.xpath("//*[@id='month']"));
		  
		  Select dropdown=new Select(el);
		  
		  dropdown.selectByVisibleText("Mar");
		  //dropdown.selectByIndex(4);
	}

}
