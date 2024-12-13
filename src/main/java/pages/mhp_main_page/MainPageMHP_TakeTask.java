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

public class MainPageMHP_TakeTask extends basePage {
    public MainPageMHP_TakeTask(WebDriver driver) {
        super(driver);
    }

    public final By business_trip_region = By.xpath("//span[text() = 'Головна']");
    public final By business_trip_task_button = By.xpath("//a[text() = 'Заборгованості немає']");
    public final By business_trip_task_button_ok = By.xpath("//a[text() = 'OK']");


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICT_WAIT));
    public MainPageMHP_TakeTask clickbutton() throws AWTException, InterruptedException {
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


    public MainPageMHP_TakeTask click_button_business_trip_region(){
        WebElement test = wait.until(ExpectedConditions.presenceOfElementLocated(business_trip_region));
        test.click();
        return null;
    }

    public MainPageMHP_TakeTask click_button_business_trip_task(){
        WebElement iframeElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='content-control-iframe' and @src='/Workspace/Form/MHP__Menu__FORM']")));
        driver.switchTo().frame(iframeElement);
        WebElement test = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='WorklistTableSelectGridArrow' and @title='Open action menu'])[1]")));

        Actions actions = new Actions(driver);
        actions.moveToElement(test).click().pause(Duration.ofSeconds(2)).sendKeys(Keys.ENTER).perform();
        WebElement test1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text() = 'Відкрити']")));
        actions.moveToElement(test1).click().perform();
        driver.switchTo().defaultContent();
        return this;
    }
    public MainPageMHP_TakeTask click_button_business() throws InterruptedException {
        Thread.sleep(3000);
        WebElement iframeElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='content-control-iframe' and @src='/Workspace/Form/MHP__Menu__FORM']")));
        driver.switchTo().frame(iframeElement);
        WebElement test = wait.until(ExpectedConditions.presenceOfElementLocated(business_trip_task_button));
        Actions actions = new Actions(driver);
        actions.moveToElement(test).click().perform();
        test = wait.until(ExpectedConditions.presenceOfElementLocated(business_trip_task_button_ok));
        Thread.sleep(3000);
        test.click();
        driver.switchTo().defaultContent();
        return null;
    }

}
