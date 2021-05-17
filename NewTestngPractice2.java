package Test1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTestngPractice2 {
	
	WebDriver driver = new ChromeDriver();
	
  @Test(priority = 1)
  public void f() {
	  //FirstName & LastName
	  driver.findElement(By.name("firstname")).sendKeys("Sudhir");
	  driver.findElement(By.name("lastname")).sendKeys("Sonawane");
  }
  
  @Test(priority = 2)
  public void priority2(){
	  //Sex and Year of experience
	  driver.findElement(By.xpath("//input[@value='Male']")).click();
	  driver.findElement(By.xpath("//span[text()='6 ']/following::input")).click();
  }
  
  @Test(priority = 3)
  public void priority3(){
	  //Date and Profession
	  driver.findElement(By.xpath("//span[text()='7 ']/following::input")).sendKeys("12/12/2012");
	  driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
  }
  
  @Test(priority = 4)
  public void priority4(){
	  //Profile picture choose file
	  WebElement uploadPhoto = driver.findElement(By.xpath("//input[@type='file']"));
	  uploadPhoto.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Koala.jpg");
  }
  
  @Test(priority = 5)
  public void priority5(){
	  //Flavors of Selenium
	  driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();
  }
  
  @Test(priority = 6)
  public void priority6(){
	  //Scroll down
	  JavascriptExecutor Js = ((JavascriptExecutor) driver);
	  Js.executeScript("window.scrollBy(0,200)");
  }
  
  @Test(priority = 7)
  public void priority7(){
	  //Continents
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  WebElement dropdown = driver.findElement(By.name("continents"));
	  Select dValue = new Select (dropdown);
	  dValue.selectByIndex(5);
  }
  
  @Test(priority = 8)
  public void priority8(){
	  //Selenium Commands
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  WebElement SeleniumCommands = driver.findElement(By.name("selenium_commands"));
	  Select ScValue = new Select(SeleniumCommands);
	  ScValue.selectByIndex(2);
  }
  
  @Test(priority = 9)
  public void priority9(){
	  //Take Screenshot
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  try {
		FileUtils.copyFile(screenshot1, new File("F:\\Study\\Screenshots\\PracticeTestNG 2\\PracticeForm.jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
  }
  
  @Test(priority = 10)
  public void priority10(){
	  //Click on Button
	  WebElement buttonClick = driver.findElement(By.xpath("//button[text()='Button']"));
	  Actions action = new Actions(driver);
	  action.click().build().perform();
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Study\\chromedriver_win32 (90)\\chromedriver.exe");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

  @BeforeTest
  public void beforeTest() {
	  driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
