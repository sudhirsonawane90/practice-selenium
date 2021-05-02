package TestPHPTravels;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class NewPractice2May {

	public static void main(String[] args) {
		
		
		try {
			System.setProperty("wedbdriver.chrome.driver", "F:\\Study\\chromedriver_win32 (90)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String title1 = driver.findElement(By.xpath("//div[@class='row']//div")).getText();
			String title2 = driver.findElement(By.xpath("(//div[@class='row']//div)[2]")).getText();
			String simpleText = driver.findElement(By.xpath("//div[@class='col-md-12']//b")).getText();
			System.out.println("Main Title is: " +title1+ " Normal title is: " +title2+ " Simple text is: " +simpleText);
			String getURL = driver.findElement(By.linkText("This is a link")).getText();
			System.out.println("Link is: " +getURL);
			driver.findElement(By.xpath("//div[@class='col-md-12']//a[1]")).click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.navigate().back();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//div[@class='col-md-12']//input")).sendKeys("TextBox text");
			driver.findElement(By.xpath("//div[@class='col-md-12']//button")).click();
			WebElement radioButton = driver.findElement(By.xpath("(//div[@class='col-md-12']//input)[2]"));
			radioButton.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement CheckBox = driver.findElement(By.xpath("//input[@value='Automation']"));
			CheckBox.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement dropdown = driver.findElement(By.xpath("//div[@class='col-md-12']//select[1]"));
			Select dvalue = new Select(dropdown);
			dvalue.selectByIndex(3);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Actions action = new Actions(driver);
			WebElement locator = driver.findElement(By.xpath("(//div[@class='col-md-12']//button)[2]"));
			action.doubleClick(locator).perform();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Alert alert = driver.switchTo().alert();
			alert.accept();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			JavascriptExecutor Js = (JavascriptExecutor) driver;
			Js.executeScript("window.scrollBy(0,250)");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//div[@class='col-md-12']//button)[3]")).click();
			Alert alrt = driver.switchTo().alert();
			alrt.accept();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("html[1]/body[1]/div[1]/div[12]/div[1]/p[1]/button[1]")).click();
			Alert confm = driver.switchTo().alert();
			confm.dismiss();
			String alertboxmessage = driver.findElement(By.xpath("//p[@id='demo']")).getText();
			System.out.println(alertboxmessage);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			try {
				WebElement from = driver.findElement(By.xpath("//div[@class='col-md-12']//img[1]"));
				WebElement to = driver.findElement(By.xpath("//div[@class='col-md-12']//div[1]"));
				Actions act = new Actions(driver);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				act.dragAndDrop(from, to).perform();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			File Screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(Screenshot1, new File("F:\\Study\\Screenshots\\Practice2\\Practice2.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.close();
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
