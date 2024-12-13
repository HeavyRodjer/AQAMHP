package pages.mhp_main_page;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

public class MainPageMHP_Deploy extends basePage {
    public MainPageMHP_Deploy(WebDriver driver) {
        super(driver);
    }
    public final By business_trip_button = By.xpath("//a[@id= 'ff56a4db-045d-3b8b-b60f-ae0e0e4d3d7c_a5612171-918f-36d2-e216-d6a03b2bc1a9_ToolbarButton']");
    public final By business_trip_task = By.xpath("//span[text() = 'Ініціатор:']");
    public final By business_trip_region= By.xpath("//a[@id='10b134b0-3157-4107-3dbe-677c00919df0_94891af2-0cd8-d743-4ab5-3944788d568c_ToolbarButton']");
    public final By business_change_type_business_trips= By.xpath("(//div[contains(@class, 'input-control-body') and contains(@style, 'right: 25px;')])[1]");
    public final By business_change_type_business_trips2= By.xpath("(//a[@class='input-control  styling-font'])[5]");
    public final By business_trip_type_task = By.xpath("//span[text()='Внутрішнє']");
    public final By business_trip_goal_task = By.xpath("//span[text()='Завершення проекту']");
    public final By change_iframe_city = By.xpath("//input[@id = 'rtSearchConfig_FindValueTextBox_10b134b0-3157-4107-3dbe-677c00919df0_0947a15e-4be4-b0dc-6743-dc3904cbc464']");
    public final By change_iframe_city2 = By.xpath("//input[@id = 'rtSearchConfig_FindValueTextBox_10b134b0-3157-4107-3dbe-677c00919df0_93ee0007-20bc-b18e-9889-2a248a619bef']");
    public final By change_iframe_enterprise_enter = By.xpath("//input[@id = 'rtSearchConfig_FindValueTextBox_10b134b0-3157-4107-3dbe-677c00919df0_0c7115ce-5b13-4065-dcd5-e4fa8ca344a0']");
    public final By change_button_city2 = By.xpath("(//a[@class='picker-search border-left-only' and @title='Search'])[2]");
    public final By change_button_enterprise = By.xpath("(//a[@class='picker-search border-left-only' and @title='Search'])[4]");
    public final By change_button_city = By.xpath("(//a[@class='picker-search border-left-only' and @title='Search'])[1]");
    public final By business_trip_city = By.xpath("//span[text()= 'Ужгород']");
    public final By business_trip_city2 = By.xpath("(//span[text()= 'Київ'])[3]");
    public final By business_trip_type_enterprise = By.xpath("(//span[text()= 'МХП ПрА'])[2]");
    public final By business_trip_button_ok = By.xpath("//a[text() = 'OK']");
    public final By business_trip_button_date_start = By.xpath("//a[@id = '10b134b0-3157-4107-3dbe-677c00919df0_b09ea425-ab59-ea44-f226-18ccc5c8d2e1_Image']");
    public final By business_trip_button_date_end = By.xpath("//a[@id = '10b134b0-3157-4107-3dbe-677c00919df0_5c90f05c-8859-1839-0b42-4c5984cecc73_Image']");
    public final By business_trip_button_date_date_start = By.xpath("//a[text() = '09']");
    public final By business_trip_button_date_date_end= By.xpath("//a[text() = '09']");
    public final By business_trip_button_approve= By.xpath("//a[@id = '41ad9118-966e-847d-5c5a-bd524fbeef74_6ec82276-6456-132d-198a-5397cc61fbd3']");
    public final By business_trip_region_1= By.xpath("(//span[text()='Оберіть значення'])[1]");
    public final By business_trip_region_iatems= By.xpath("//span[text()='ЦО']");
    public final By business_trip_task_button_ok = By.xpath("//a[text() = 'OK']");

   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICT_WAIT));
    public MainPageMHP_Deploy clickbutton() throws AWTException, InterruptedException {
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
    public MainPageMHP_Deploy click_button_business_trip() throws InterruptedException {
        Thread.sleep(3000);
        WebElement test = wait.until(ExpectedConditions.elementToBeClickable(business_trip_button));
        test.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(business_trip_task));
        test = wait.until(ExpectedConditions.visibilityOfElementLocated(business_trip_task));
        String test3 = test.getAttribute("textContent");
        Assert.assertEquals(test3,"Ініціатор:");
        return null;
    }
    public MainPageMHP_Deploy click_button_business_trip_region(){
        WebElement test = wait.until(ExpectedConditions.presenceOfElementLocated(business_trip_region));
        test.click();
        return null;
    }
    public MainPageMHP_Deploy change_iframe(){
        WebElement iframeElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[contains(@class, 'runtime-popup')]")));
        driver.switchTo().frame(iframeElement);
        WebElement test1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id= '00000000-0000-0000-0000-000000000000_1e906923-37b8-3344-7ef5-295f89c09b2b']")));
        WebElement test = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='1bf1d52d-90c1-2486-d79d-17de9bfaf5b9']")));
        Actions actions = new Actions(driver);
        actions.moveToElement(test).click().sendKeys("Желобков").pause(Duration.ofSeconds(2)).sendKeys(Keys.ENTER).moveToElement(test1).click().perform();
        driver.switchTo().defaultContent();
        return this;
    }
    public MainPageMHP_CreationTask click_button_business_trip_region1(){
        WebElement test = wait.until(ExpectedConditions.elementToBeClickable(business_trip_region_1));
        test.click();
        return null;
    }
    public MainPageMHP_CreationTask click_button_business_trip_region_items(){
        WebElement test = wait.until(ExpectedConditions.elementToBeClickable(business_trip_region_iatems));
        test.click();
        return null;
    }
    public MainPageMHP_Deploy change_type_business_trips(){
        WebElement test = wait.until(ExpectedConditions.elementToBeClickable(business_change_type_business_trips));
        test.click();
        test = wait.until(ExpectedConditions.elementToBeClickable(business_trip_type_task));
        test.click();
        String test2 = test.getAttribute("innerText");
        Assert.assertEquals(test2,"Внутрішнє");
        return this;
    }
    public MainPageMHP_Deploy change_iframe_city(){
        WebElement test = wait.until(ExpectedConditions.elementToBeClickable(change_button_city));
        test.click();
        test = wait.until(ExpectedConditions.elementToBeClickable(change_iframe_city));
        Actions actions = new Actions(driver);
        actions.moveToElement(test).click().sendKeys("Ужгород").sendKeys(Keys.ENTER).pause(Duration.ofSeconds(2)).perform();
        String test2 = test.getAttribute("value");
        Assert.assertEquals(test2,"Ужгород");
        WebElement test1 = wait.until(ExpectedConditions.elementToBeClickable(business_trip_city));
        actions.moveToElement(test1).doubleClick().perform();
        return this;
    }
    public MainPageMHP_Deploy change_iframe_city2(){
        WebElement test = wait.until(ExpectedConditions.elementToBeClickable(change_button_city2));
        test.click();
        test = wait.until(ExpectedConditions.elementToBeClickable(change_iframe_city2));
        Actions actions = new Actions(driver);
        actions.moveToElement(test).click().sendKeys("Київ").sendKeys(Keys.ENTER).pause(Duration.ofSeconds(2)).perform();
        String test3 = test.getAttribute("value");
        Assert.assertEquals(test3,"Київ");
        WebElement test1 = wait.until(ExpectedConditions.elementToBeClickable(business_trip_city2));
        actions.moveToElement(test1).doubleClick().perform();
        WebElement test2 = wait.until(ExpectedConditions.elementToBeClickable(business_trip_button_ok));
        actions.moveToElement(test2).doubleClick().perform();
        return this;
    }
    public MainPageMHP_Deploy change_iframe_Enterprise(){
        WebElement test = wait.until(ExpectedConditions.elementToBeClickable(change_button_enterprise));
        test.click();
        test = wait.until(ExpectedConditions.elementToBeClickable(change_iframe_enterprise_enter));
        Actions actions = new Actions(driver);
        actions.moveToElement(test).click().sendKeys("МХП Пра").sendKeys(Keys.ENTER).pause(Duration.ofSeconds(2)).perform();
        WebElement test1 = wait.until(ExpectedConditions.elementToBeClickable(business_trip_type_enterprise));
        actions.moveToElement(test1).doubleClick().perform();
        WebElement test2 = wait.until(ExpectedConditions.elementToBeClickable(business_trip_button_ok));
        actions.moveToElement(test2).doubleClick().perform();
        return this;
    }
    public MainPageMHP_Deploy change_goal_business_trips(){
        WebElement test = wait.until(ExpectedConditions.elementToBeClickable(business_change_type_business_trips2));
        test.click();
        test = wait.until(ExpectedConditions.elementToBeClickable(business_trip_goal_task));
        test.click();
        String test2 = test.getAttribute("text");
        Assert.assertEquals(test2,"Завершення проекту");
        return this;
    }
    public MainPageMHP_Deploy change_date_start_business_trips(){
        WebElement test = wait.until(ExpectedConditions.elementToBeClickable(business_trip_button_date_start));
        test.click();
        test = wait.until(ExpectedConditions.elementToBeClickable(business_trip_button_date_date_start));
        test.click();
//        String test2 = test.getAttribute("text");
//        Assert.assertEquals(test2,"Завершення проекту");
        return this;
    }
    public MainPageMHP_Deploy change_date_end_business_trips(){
        WebElement test = wait.until(ExpectedConditions.elementToBeClickable(business_trip_button_date_end));
        test.click();
        test = wait.until(ExpectedConditions.elementToBeClickable(business_trip_button_date_date_end));
        test.click();
        return this;
    }
    public MainPageMHP_Deploy change_save_business_trips(){
        WebElement test = wait.until(ExpectedConditions.elementToBeClickable(business_trip_button_approve));
        test.click();
        String test2 = test.getAttribute("innerText");
        Assert.assertEquals(test2,"Розпочати процес");
        test = wait.until(ExpectedConditions.presenceOfElementLocated(business_trip_task_button_ok));
        test.click();
        return this;
    }


}
