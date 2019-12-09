
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


public class Test8DeleteBug {
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
    public void testDeleteBug() throws Exception {
        driver.get(baseUrl + "/");
        driver.findElement(By.xpath("//a[@class=\'btn-github\']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a.link.link-blue-1")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class=\'sprite-sidebar sprite-sidebar-settings\']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class=\'seamless-view triggerable\'][contains(text(),\'TestProject\')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("Seamless_Project_name")).sendKeys("TestBug");
        driver.findElement(By.cssSelector("div.sprite-sidebar.sprite-sidebar-bug")).click();
        Thread.sleep(3000);
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