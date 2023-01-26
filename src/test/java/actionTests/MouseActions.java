package actionTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

    private WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void clickAndHold() {
        driver.get("https://letcode.in/buttons/");
        WebElement button = driver.findElements(By.id("isDisabled")).get(1);
        Actions actions = new Actions(driver);
        actions.clickAndHold(button)
                .build().perform();
    }

    @Test
    public void contextClick() {
        driver.get("https://demoqa.com/buttons");
        WebElement button = driver.findElement(By.id("rightClickBtn"));
        Actions actions = new Actions(driver);
        actions.contextClick(button)
                .build().perform();
    }

    @Test
    public void doubleClick() {
        driver.get("https://demoqa.com/buttons");
        WebElement button = driver.findElement(By.id("doubleClickBtn"));
        Actions actions = new Actions(driver);
        actions.doubleClick(button)
                .build().perform();
    }

    @Test
    public void dragAndDrop() {
        driver.get("https://demoqa.com/droppable");
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target)
                .build().perform();
    }

    @Test
    public void moveToElement() {
        driver.get("https://demoqa.com/tool-tips");
        WebElement button = driver.findElement(By.id("toolTipButton"));
        Actions actions = new Actions(driver);
        actions.moveToElement(button)
                .build().perform();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}
