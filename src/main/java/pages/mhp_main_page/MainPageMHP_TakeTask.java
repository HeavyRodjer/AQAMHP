package pages.mhp_main_page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        robot.keyRelease(KeyEvent.VK_SHIFT);

        robot.delay(2000);  // Збільшено затримку тут

        // Натисніть Enter, щоб увійти
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000);
        driver.navigate().refresh();
        return null;
    }


    public MainPageMHP_Deploy click_button_business_trip_region(){
        WebElement test = wait.until(ExpectedConditions.presenceOfElementLocated(business_trip_region));
        test.click();
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
