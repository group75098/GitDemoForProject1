package seleniumPack.SeleProj;

import org.apache.tools.ant.taskdefs.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		//Open the Browser 
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadia\\eclipse-workspacce2\\SeleProj\\Browser\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://jqueryui.com/droppable/");
		 
//		  System.out.println("This is the home page title :"+driver.getTitle());
//		  
//		  String title=driver.getTitle();
//		  
//		  if(title.equalsIgnoreCase("Facebook - Log In or Sign Up")){
//		   
//		   System.out.println("Opened the right page ");
//		  }
//		  else
//		  {
//		   System.out.println("Opened wrong page ");
//		  }
//		  
//		  driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Somebody seems like ......");
//		  driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Password...... ");
//		  driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		  System.out.println(driver.findElement(By.xpath("//*[@id='content']/p[1]")).getText());
		  System.out.println(driver.findElement(By.xpath("//*[@id='draggable']/p")).getText());
		  
		  
		  

	}

}
