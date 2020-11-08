package seleniumPack.SeleProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadia\\eclipse-workspacce2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);

		Thread.sleep(500);

		WebElement ag = driver.findElement(By.xpath("//*[@id='draggable']/p"));

		WebElement op = driver.findElement(By.xpath("//*[@id='droppable']/p"));

		Actions exp = new Actions(driver);
		exp.dragAndDrop(ag, op).build().perform(); //why using build and perform

	}

}
