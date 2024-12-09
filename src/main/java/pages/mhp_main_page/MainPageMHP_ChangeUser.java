package pages.mhp_main_page;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.basePage;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

import static constans.Constans.TimeoutVeribles.EXPLICT_WAIT;

public class MainPageMHP_ChangeUser extends basePage {
    public MainPageMHP_ChangeUser(WebDriver driver) {
        super(driver);
    }
    public final By business_trip_button = By.xpath("//a[@id= 'ff56a4db-045d-3b8b-b60f-ae0e0e4d3d7c_a5612171-918f-36d2-e216-d6a03b2bc1a9_ToolbarButton']");
    public final By business_trip_task = By.xpath("//span[text() = 'Ініціатор:']");
    public final By business_trip_region= By.xpath("//a[@id='10b134b0-3157-4107-3dbe-677c00919df0_94891af2-0cd8-d743-4ab5-3944788d568c_ToolbarButton']");
    public final By business_change_type_business_trips= By.xpath("(//div[contains(@class, 'input-control-body') and contains(@style, 'right: 25px;')])[1]");
    public final By business_trip_type_task = By.xpath("//span[text()='Внутрішнє']");
   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICT_WAIT));
    public MainPageMHP_ChangeUser clickbutton() throws AWTException, InterruptedException {
        Thread.sleep(5000);
        Robot robot = new Robot();

        // Введіть ім'я користувача
        String username = "r.terpeliuk";
        for (char c : username.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
            if (Character.isUpperCase(c)) {
                robot.keyPress(KeyEvent.VK_SHIFT);
            }
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
            if (Character.isUpperCase(c)) {
                robot.keyRelease(KeyEvent.VK_SHIFT);
            }
            robot.delay(100);
        }

        robot.delay(2000);  // Збільшено затримку тут

        // Натисніть Tab, щоб перейти до поля введення пароля
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.delay(100);

        robot.delay(2000);  // Збільшено затримку тут

        // Введіть пароль
        String password = "Gfhjgkfd21";
        for (char c : password.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
            if (Character.isUpperCase(c)) {
                robot.keyPress(KeyEvent.VK_SHIFT);
            }
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
            if (Character.isUpperCase(c)) {
                robot.keyRelease(KeyEvent.VK_SHIFT);
            }
            robot.delay(100);
        }
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_1); // Введіть "!"
        robot.keyRelease(KeyEvent.VK_1);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.delay(2000);  // Збільшено затримку тут
        // Натисніть Enter, щоб увійти
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000);
        driver.navigate().refresh();
        return null;
    }

    public MainPageMHP_ChangeUser click_button_business_trip(){
        WebElement test = wait.until(ExpectedConditions.elementToBeClickable(business_trip_button));
        test.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(business_trip_task));
        test = wait.until(ExpectedConditions.visibilityOfElementLocated(business_trip_task));
        String test3 = test.getAttribute("textContent");
        Assert.assertEquals(test3,"Ініціатор:");
        return null;
    }
    public MainPageMHP_ChangeUser click_button_business_trip_region(){
        WebElement test = wait.until(ExpectedConditions.presenceOfElementLocated(business_trip_region));
        test.click();
        return null;
    }
    public MainPageMHP_ChangeUser change_iframe(){
        WebElement iframeElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[contains(@class, 'runtime-popup')]")));
        driver.switchTo().frame(iframeElement);
        WebElement test1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id= '00000000-0000-0000-0000-000000000000_1e906923-37b8-3344-7ef5-295f89c09b2b']")));
        WebElement test = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='1bf1d52d-90c1-2486-d79d-17de9bfaf5b9']")));
        Actions actions = new Actions(driver);
        actions.moveToElement(test).click().sendKeys("Желобков").pause(Duration.ofSeconds(2)).sendKeys(Keys.ENTER).moveToElement(test1).click().perform();
        driver.switchTo().defaultContent();
        return this;
    }
    public MainPageMHP_ChangeUser change_type_business_trips(){
        WebElement test = wait.until(ExpectedConditions.elementToBeClickable(business_change_type_business_trips));
        test.click();
        test = wait.until(ExpectedConditions.elementToBeClickable(business_trip_type_task));
        test.click();
        String test2 = test.getAttribute("innerText");
        Assert.assertEquals(test2,"Внутрішнє");    return this;
    }

}
