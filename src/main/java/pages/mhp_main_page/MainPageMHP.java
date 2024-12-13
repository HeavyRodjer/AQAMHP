package pages.mhp_main_page;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import pages.base.basePage;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static constans.Constans.TimeoutVeribles.EXPLICT_WAIT;
import java.util.List;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.NoSuchElementException;

public class MainPageMHP extends basePage {
    public MainPageMHP(WebDriver driver) {
        super(driver);
    }
    public final By main_panel = By.xpath("//input[@id= 'ff56a4db-045d-3b8b-b60f-ae0e0e4d3d7c_cb14dacb-4deb-48a3-9ea1-0c75afdbeee0_quickSearchTxt']");
    public final By business_trip_button = By.xpath("//a[@id= 'ff56a4db-045d-3b8b-b60f-ae0e0e4d3d7c_cb14dacb-4deb-48a3-9ea1-0c75afdbeee0_quickSearchBtn']");
    public final By business_trip_task = By.xpath("//span[@id = '13fc84fe-6fd7-4a40-b2c8-33da1d6c169a_b11083a6-7460-2aff-56f0-14266fc9a728' ]");
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

    public MainPageMHP click(){
//        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("HiddenFileFrame")));
        WebElement test = wait.until(ExpectedConditions.elementToBeClickable(main_panel));
        test.sendKeys("Завершено");
      String test3 = test.getAttribute("value");
        Assert.assertEquals(test3,"Завершено");
//        driver.switchTo().defaultContent();
        return null;

    }

    public MainPageMHP click_business_trip(){
        WebElement test = wait.until(ExpectedConditions.elementToBeClickable(business_trip_button));
        try {
            test.click();
        } catch (StaleElementReferenceException e) {
            test = wait.until(ExpectedConditions.visibilityOfElementLocated(business_trip_task));
            Actions actions = new Actions(driver);
            actions.doubleClick(test).perform();
        }

        return null;

    }
//    private void switchToFrameWithElement(By elementLocator) {
//        driver.switchTo().defaultContent(); // Повертаємось в головний контекст
//
//        // Перевірка на наявність елемента в головному документі
//        if (driver.findElements(elementLocator).size() > 0) {
//            System.out.println("Element found in the main document.");
//            return; // Елемент знайдено в головному документі
//        }
//
//        // Отримуємо всі iframe на сторінці
//        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
//        System.out.println("Total iframes found: " + iframes.size());
//
//        for (WebElement iframe : iframes) {
//            try {
//                // Лог: інформація про поточний iframe
//                String iframeId = iframe.getAttribute("id");
//                String iframeName = iframe.getAttribute("name");
//                System.out.println("Switching to iframe with id: " + iframeId + " or name: " + iframeName);
//
//                // Перемикаємося на iframe
//                driver.switchTo().frame(iframe);
//
//                // Перевірка чи є елемент у поточному iframe
//                if (driver.findElements(elementLocator).size() > 0) {
//                    System.out.println("Element found inside iframe with id: " + iframeId);
//                    return; // Елемент знайдений, виходимо
//                }
//
//            } catch (Exception e) {
//                // Лог: повідомлення про помилку, якщо не вдалося перемикнутись на iframe
//                System.out.println("Error while switching to iframe: " + e.getMessage());
//            } finally {
//                // Повертаємось до батьківського контексту після кожної спроби
//                driver.switchTo().parentFrame();
//            }
//        }
//
//        // Лог: якщо елемент не знайдений після перевірки всіх iframe
//        System.out.println("Element not found in any iframe.");
//    }

}
