package actionTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

    private WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void keyDown() {
        driver.get("https://letcode.in/edit/");
        WebElement input = driver.findElement(By.id("fullName"));
        Actions actions = new Actions(driver);
        actions.keyDown(input, Keys.SHIFT)
                .sendKeys("shubham")
                .build().perform();
    }

    @Test
    public void keyUp() {
        driver.get("https://letcode.in/edit/");
        WebElement input = driver.findElement(By.id("join"));
        Actions actions = new Actions(driver);
        actions.keyDown(input, Keys.SPACE)
                .keyUp(Keys.SPACE)
                .sendKeys("tester.")
                .keyDown(Keys.TAB)
                .keyUp(Keys.TAB)
                .build().perform();
    }

    @Test
    public void senKeys() {
        driver.get("https://letcode.in/edit/");
        WebElement input = driver.findElement(By.id("fullName"));
        Actions actions = new Actions(driver);
        actions.sendKeys(input, "Shubham")
                .build().perform();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}
