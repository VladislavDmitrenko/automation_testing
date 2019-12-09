
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test4CreateProject {
	private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    
	@Before
	public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://leantesting.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
	
	@Test
	public void testCreateProject() throws Exception {
		driver.get(baseUrl + "/");
		driver.findElement(By.xpath("//a[@class=\'btn-github\']")).click();
		driver.findElement(By.id("Project_name")).clear();
		driver.findElement(By.id("Project_name")).sendKeys("TestProject");
		driver.findElement(By.xpath("//button[@type=\'submit\']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\'Version_version_number\']")).click();
		driver.findElement(By.id("Version_version_number")).clear();
		driver.findElement(By.id("Version_version_number")).sendKeys("v.1.0");
		driver.findElement(By.xpath("(//button[@type=\'submit\'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id=\'modal-project-section\']//button[@class=\'btn btn-lg btn-lg-w-100 btn-primary-blue\'][contains(text(),\'Next\')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),\'Finish\')]")).click();
		Thread.sleep(10000);
		try {
            assertEquals("TestProject", driver.findElement(By.cssSelector("h3")).getText());
        	} catch (Error e) {
        		verificationErrors.append(e.toString());
        	}
        	driver.findElement(By.cssSelector("span.arrow-down")).click();
        	driver.findElement(By.xpath("(//a[contains(text(),'Logout')])[2]")).click();
    }
	@After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    @SuppressWarnings("unused")
	private boolean isElementPresent(final By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    @SuppressWarnings("unused")
	private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    @SuppressWarnings("unused")
	private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
	