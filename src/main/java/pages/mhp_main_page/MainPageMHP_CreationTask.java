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

public class MainPageMHP_CreationTask extends basePage {
    public MainPageMHP_CreationTask(WebDriver driver) {
        super(driver);
    }

    public final By business_trip_button = By.xpath("//a[@id= 'ff56a4db-045d-3b8b-b60f-ae0e0e4d3d7c_a5612171-918f-36d2-e216-d6a03b2bc1a9_ToolbarButton']");
    public final By business_trip_task = By.xpath("//span[text() = 'Ініціатор:']");
    public final By business_trip_region= By.xpath("(//span[text()='Оберіть значення'])[1]");
    public final By business_trip_region_iatems= By.xpath("//span[text()='ЦО']");

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




    public MainPageMHP_CreationTask click_button_business_trip(){
        WebElement test = wait.until(ExpectedConditions.elementToBeClickable(business_trip_button));
        test.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(business_trip_task));
        test = wait.until(ExpectedConditions.visibilityOfElementLocated(business_trip_task));
        String test3 = test.getAttribute("textContent");
        Assert.assertEquals(test3,"Ініціатор:");

        return null;

    }
    public MainPageMHP_CreationTask click_button_business_trip_region(){
        WebElement test = wait.until(ExpectedConditions.elementToBeClickable(business_trip_region));
        test.click();
//        String test3 = test.getAttribute("textContent");
//        Assert.assertEquals(test3,"Ініціатор:");

        return null;

    }
    public MainPageMHP_CreationTask click_button_business_trip_region_items(){
        WebElement test = wait.until(ExpectedConditions.elementToBeClickable(business_trip_region_iatems));
        test.click();
//        String test3 = test.getAttribute("textContent");
//        Assert.assertEquals(test3,"Ініціатор:");

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
