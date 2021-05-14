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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomatePractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Study\\chromedriver_win32 (90)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("window.scrollBy(0,2500)");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String fb = driver.findElement(By.xpath("//li[@class='facebook']//a[1]")).getAttribute("href");
		System.out.println("FollowUs facebook link is: " +fb);
		String twitter = driver.findElement(By.xpath("//li[@class='twitter']//a[1]")).getAttribute("href");
		System.out.println("FollowUs Twitter link is: " +twitter);
		String YouTube = driver.findElement(By.xpath("//li[@class='youtube']//a[1]")).getAttribute("href");
		System.out.println("FollowUs YouTube link is: " +YouTube);
		String GooglePlus = driver.findElement(By.xpath("//li[@class='google-plus']//a[1]")).getAttribute("href");
		System.out.println("FollowUs Google Plus link is: " +GooglePlus);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String StoreInfo = driver.findElement(By.xpath("//section[@id='block_contact_infos']/div[1]")).getText();
		System.out.println(StoreInfo);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor Js1 = (JavascriptExecutor) driver;
		Js1.executeScript("window.scrollBy(100,0)");
		driver.findElement(By.linkText("Sign in")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor Js2 = (JavascriptExecutor) driver;
		Js2.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.id("email_create")).sendKeys("aaa12oAT@aaa32111.com");
		driver.findElement(By.xpath("(//button[@type='submit']//span)[2]")).click();
		driver.findElement(By.xpath("//label[@for='id_gender1']")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Abcdefg");
		driver.findElement(By.id("customer_lastname")).sendKeys("Zyxuvh");
		driver.findElement(By.id("passwd")).sendKeys("ABCD123");
		WebElement dropdown = driver.findElement(By.xpath("//div[@id='uniform-days']//select[1]"));
		Select dropvalue = new Select(dropdown);
		dropvalue.selectByValue("24");
		WebElement dropdown1 = driver.findElement(By.xpath("//div[@id='uniform-months']//select[1]"));
		Select dropvalue1 = new Select(dropdown1);
		dropvalue1.selectByIndex(1);
		WebElement dropdown2 = driver.findElement(By.xpath("//div[@id='uniform-years']//select[1]"));
		Select dropvalue2 = new Select(dropdown2);
		dropvalue2.selectByIndex(32);
		driver.findElement(By.id("newsletter")).click();
		JavascriptExecutor Js3 = (JavascriptExecutor) driver;
		Js3.executeScript("window.scrollBy(0,100)");
		driver.findElement(By.id("firstname")).sendKeys("Sudhir");
		driver.findElement(By.id("lastname")).sendKeys("Sonawane");
		driver.findElement(By.id("company")).sendKeys("Confidential");
		driver.findElement(By.id("address1")).sendKeys("Republic of Dombivali");
		driver.findElement(By.id("city")).sendKeys("Dombivali");
		WebElement stateDrop = driver.findElement(By.xpath("//div[@id='uniform-id_state']//select[1]"));
		Select stateValue = new Select(stateDrop);
		stateValue.selectByIndex(10);
		driver.findElement(By.id("postcode")).sendKeys("43232");
		JavascriptExecutor Js4 = (JavascriptExecutor) driver;
		Js4.executeScript("window.scrollBy(100,600)");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("phone_mobile")).sendKeys("9821117318");
		driver.findElement(By.id("alias")).sendKeys("Dombivali East");
		driver.findElement(By.xpath("//span[text()='Register']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@alt='My Store']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot1, new File("F:\\Study\\Screenshots\\PracticeWord1Project\\HomePageAfterSignIn.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions action = new Actions(driver);
		WebElement mainMenu = driver.findElement(By.xpath("//a[@title='Women']"));
		action.moveToElement(mainMenu).perform();
		File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot2, new File("F:\\Study\\Screenshots\\PracticeWord1Project\\MouseHover.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		try {
			WebElement subMenu = driver.findElement(By.xpath("//a[@title='Casual Dresses']"));
			subMenu.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("layered_id_attribute_group_3")).click();
		JavascriptExecutor Js5 = (JavascriptExecutor) driver;
		Js5.executeScript("window.scrollBy(0,400)");
		Actions action_ProductView = new Actions(driver);
		WebElement ProductImage = driver.findElement(By.xpath("//a[@class='product_img_link']//img[1]"));
		action_ProductView.moveToElement(ProductImage).perform();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		File screenshot3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot3, new File("F:\\Study\\Screenshots\\PracticeWord1Project\\MouseHoverOnProductImage.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement AddtoCart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		AddtoCart.click();
		File screenshot4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot4, new File("F:\\Study\\Screenshots\\PracticeWord1Project\\addtocart.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions action2 = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(@class,'btn btn-default')]//span)[2]")));
		WebElement firstDiv = driver.findElement(By.xpath("(//a[contains(@class,'btn btn-default')]//span)[2]"));
		action2.moveToElement(firstDiv).click().build().perform();
		File screenshot5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot5, new File("F:\\Study\\Screenshots\\PracticeWord1Project\\ProceedForCheckout.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[contains(@class,'cart_quantity_up btn')]//i[1]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'button btn')]//span[1]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		File screenshot6 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot6, new File("F:\\Study\\Screenshots\\PracticeWord1Project\\proceedtocheckout2.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[contains(@class,'button btn')]//span[1]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='uniform-cgv']//input[1]")).click();
		File screenshot7 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot7, new File("F:\\Study\\Screenshots\\PracticeWord1Project\\proceedToCheckoutCheckBox.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[contains(@class,'button btn')]//span[1]")).click();
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='payment_module']//a)[2]")));
		driver.findElement(By.xpath("(//p[@class='payment_module']//a)[2]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(@class,'button btn')]//span[1]")).click();
		File screenshot8 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot8, new File ("F:\\Study\\Screenshots\\PracticeWord1Project\\ConfirmedOrder.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ConfirmedOrderDetails = driver.findElement(By.xpath("//div[contains(@class,'center_column col-xs-12')]//div[1]")).getText();
		System.out.println(ConfirmedOrderDetails);
		driver.close();
		

	}

}
