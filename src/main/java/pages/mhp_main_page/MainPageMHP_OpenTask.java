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

public class MainPageMHP_OpenTask extends basePage {
    public MainPageMHP_OpenTask(WebDriver driver) {
        super(driver);
    }
    public final By main_panel = By.xpath("//input[@id= 'ff56a4db-045d-3b8b-b60f-ae0e0e4d3d7c_cb14dacb-4deb-48a3-9ea1-0c75afdbeee0_quickSearchTxt']");
    public final By business_trip_button = By.xpath("//a[@id= 'ff56a4db-045d-3b8b-b60f-ae0e0e4d3d7c_cb14dacb-4deb-48a3-9ea1-0c75afdbeee0_quickSearchBtn']");
    public final By business_trip_task = By.xpath("//span[text()= '12320']");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICT_WAIT));
    public MainPageMHP clickbutton() throws AWTException, InterruptedException {
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



    public MainPageMHP_OpenTask click(){
//        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("HiddenFileFrame")));
        WebElement test = wait.until(ExpectedConditions.elementToBeClickable(main_panel));
        test.sendKeys("12320");
      String test3 = test.getAttribute("value");
        Assert.assertEquals(test3,"1232");
//        driver.switchTo().defaultContent();
        return this;

    }

    public MainPageMHP_OpenTask click_business_trip(){
        WebElement test = wait.until(ExpectedConditions.elementToBeClickable(business_trip_button));
        test.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(business_trip_task));
        return this;

    }
    public MainPageMHP_OpenTask click_to_task(){
        WebElement test = wait.until(ExpectedConditions.visibilityOfElementLocated(business_trip_task));
        // Перевірка, чи елемент досі доступний в DOM
        // Якщо елемент stale, повторно шукаємо його
        try {
            test.click();
            System.out.println("Елемент успішно клікнуто.");
        } catch (StaleElementReferenceException e) {
            System.out.println("Елемент став stale. Повторно шукаємо елемент.");
            test = wait.until(ExpectedConditions.visibilityOfElementLocated(business_trip_task));
            Actions actions = new Actions(driver);
            actions.doubleClick(test).perform();
        }

        return this;

    }



}
