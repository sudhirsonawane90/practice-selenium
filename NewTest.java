package Test1;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver = new ChromeDriver();
  @Test
  public void mainTest() {
	  driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.name("firstname")).sendKeys("Sudhir");
	  driver.findElement(By.name("lastname")).sendKeys("Sonawane");
	  driver.findElement(By.id("sex-0")).click();
	  driver.findElement(By.id("exp-6")).click();
	  driver.findElement(By.id("datepicker")).sendKeys("10/11/2005");
	  driver.findElement(By.id("profession-1")).click();
	  driver.findElement(By.id("tool-2")).click();
	  WebElement drpValue = driver.findElement(By.id("continents"));
	  Select newValue = new Select(drpValue);
	  newValue.selectByIndex(4);
	  WebElement optionCheckboxes = driver.findElement(By.id("selenium_commands"));
	  Select newSelect = new Select(optionCheckboxes);
	  newSelect.selectByIndex(2);
	  newSelect.selectByIndex(3);
	  List<WebElement> options = newSelect.getOptions();
	  for(WebElement option: options) {
		  System.out.println(option.getText());
	  }
	  WebElement upload = driver.findElement(By.id("photo"));
	  upload.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Koala.jpg");
	  File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  try {
		FileUtils.copyFile(screenshot1, new File("F:\\Study\\Screenshots\\PracticeForm\\Screenshot1.jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 driver.findElement(By.xpath("//div[@class='control-group']//a[1]")).click();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 WebElement button = driver.findElement(By.id("submit"));
	 Actions action = new Actions(driver);
	 action.moveToElement(button).click().build().perform();
  }
  
  @BeforeClass
  public void Before_Class() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Study\\chromedriver_win32 (90)\\chromedriver.exe");
//	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  
  @AfterClass
  public void After_Class() {
	  driver.close();
  }
}
