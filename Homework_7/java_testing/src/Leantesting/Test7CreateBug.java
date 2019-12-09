
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
import org.openqa.selenium.support.ui.Select;


public class Test7CreateBug {
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
    public void testCreateBug() throws Exception {
        driver.get(baseUrl + "/");
        driver.findElement(By.xpath("//a[@class=\'btn-github\']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a.link.link-blue-1")).click();
        Thread.sleep(3000);
        try {
            assertEquals("TestProject", driver.findElement(By.cssSelector("h3")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.cssSelector("div.sprite-sidebar.sprite-sidebar-bug")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button.btn-report-empty")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("ReportBugFormModal_title")).clear();
        driver.findElement(By.id("ReportBugFormModal_title")).sendKeys("TestBug");
        new Select(driver.findElement(By.id("ReportBugFormModal_severity"))).selectByVisibleText("Major");
        new Select(driver.findElement(By.id("ReportBugFormModal_device_type_id"))).selectByVisibleText("Windows PC");
        Thread.sleep(3000);
        new Select(driver.findElement(By.id("ReportBugFormModal_device_id"))).selectByVisibleText("Asus Generic/All");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".js-button-bug-create.btn.btn-lg.btn-lg-w-100.btn-primary-blue")).click();
        Thread.sleep(3000);
        try {
            assertEquals("TestBug", driver.findElement(By.cssSelector("div.text-col.word-break > div")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
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