import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class MGP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bekge\\OneDrive\\Desktop\\Work\\Drivers\\chromedriver94.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://moneygaming.qa.gameaccount.com/");

		driver.findElement(By.cssSelector(".newUser.green")).click();
		driver.findElement(By.name("map(firstName)")).sendKeys("Ulugbek");
		driver.findElement(By.name("map(lastName)")).sendKeys("Yusupov");
		driver.findElement(By.id("form")).click();
		

		Boolean verifyTitle = driver.findElement(By.cssSelector("label[for='dob']")).getText().equalsIgnoreCase("This field is required");
		assertTrue(verifyTitle);
		
		driver.close();
		
				

	}

	private static void assertTrue(Boolean verifyTitle) {
		// TODO Auto-generated method stub
		
		
	}

}
