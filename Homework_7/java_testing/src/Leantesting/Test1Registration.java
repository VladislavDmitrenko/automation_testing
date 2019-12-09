
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


public class Test1Registration {
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
  public void testRegistration() throws Exception {
	  driver.get(baseUrl + "/");
	  driver.findElement(By.xpath("//a[contains(text(),\'Sign up\')]")).click();
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("email")).sendKeys("yellow31@gmail.com");
	  driver.findElement(By.id("username")).clear();
	  driver.findElement(By.id("username")).sendKeys("yellow3103");
	  driver.findElement(By.id("password")).clear();
	  driver.findElement(By.id("password")).sendKeys("yellow31");
	  driver.findElement(By.cssSelector("button.btn.btn-form")).click();
	  try {
		  assertEquals("Your account was successfully created", driver.findElement(By.cssSelector("h2")).getText());
	  } catch (Error e) {
          verificationErrors.append(e.toString());
      }
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