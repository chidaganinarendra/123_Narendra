package Facebook;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class facebook {
	
	

		WebDriver driver;

		@Test(priority=1)
		public void user_is_on_login_page() {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(
					"https://www.facebook.com/?stype=lo&deoia=1&jlou=AffZDTItIvv-XvhvbVrsvx2nj9ANH_r_OnyjbgczlmkwhL9i0McXcavO3G-H8O9OYaRUIX3-XymChpxNHacXpuxRB0h1hk3sTmZd_iOqYEHAew&smuh=42997&lh=Ac-sKZowaTQgE_LK4EE");
			driver.manage().window().maximize();
		}

		@Test(priority=2)
		public void user_enter_the_vaild_username_and_password() {

			WebElement web1 = driver.findElement(By.id("email"));
			web1.sendKeys("chidaganinarendra@gmail.com");
			WebElement web2 = driver.findElement(By.id("pass"));
			web2.sendKeys("8374008934");
		}

		@Test(priority=3)
		public void click_on_login_button() throws InterruptedException {
			WebElement web3 = driver.findElement(By.xpath("//button [@name ='login']"));
			web3.click();

			Thread.sleep(3000);
		}

		@Test(priority=4)
		public void user_is_navigated_to_home_page() {
			//Assert.assertTrue(
				//	driver.findElements(By.xpath("//*[@id=\'mount_0_0_Jw\']/div/div[1]/div/div[2]/div[4]/div/div[1]/div[1]/ul/li[3]/span/div/a/span/svg"))
				//			.size() > 0,
				//	"User is navigated to Home page");

		}

		@Test(priority=5)
		public void user_takethe_screen_shot() throws IOException, InterruptedException {

			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			Files.copy(src, new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Screen Shot\\GoogleScreenShot.jpg"));

			Thread.sleep(3000);

		}

		@Test(priority=6)
		public void close_the_browser() {

			// driver.close();

		}

	}

