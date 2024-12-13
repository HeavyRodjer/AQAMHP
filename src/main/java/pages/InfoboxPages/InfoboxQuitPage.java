package pages.InfoboxPages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.basePage;

import java.time.Duration;

import static constans.Constans.TimeoutVeribles.EXPLICT_WAIT;

public class InfoboxQuitPage extends basePage {
    public InfoboxQuitPage(WebDriver driver) {
        super(driver);
    }
    public final By PhoneFieldPanelAuthorizationPage = By.xpath("//input[@type='tel' and @class='react-international-phone-input']");
    public final By buttonContinueAuthorizationPage = By.xpath("//span[text()= 'Продовжити']");
    public final By CodeFieldPanelAuthorizationPage = By.xpath("//input[@name='code' and @type='tel' and @placeholder='XXXXX']");
    public final By ButtonQuitInfobox = By.xpath("//span[text()= 'Вихід']");
    public final By ButtonQuitExitApproval = By.xpath("//span[text()= 'Так, вийти']");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICT_WAIT));

    public InfoboxQuitPage enterNumberInPhoneField(String PhoneNumberUser){
        WebElement PhoneFieldAuthorizationPage = wait.until(ExpectedConditions.elementToBeClickable(PhoneFieldPanelAuthorizationPage));
        PhoneFieldAuthorizationPage.sendKeys(PhoneNumberUser);
        return this;
    }
    public String getPhoneFieldValue() {
        WebElement PhoneFieldAuthorizationPage = wait.until(ExpectedConditions.elementToBeClickable(PhoneFieldPanelAuthorizationPage));
        return PhoneFieldAuthorizationPage.getAttribute("value");
    }

    public InfoboxQuitPage clickButtonContinueAuthorizationPage(){
        WebElement ButtonContinue = wait.until(ExpectedConditions.elementToBeClickable(buttonContinueAuthorizationPage));
        ButtonContinue.click();
        return null;

    }
    public InfoboxQuitPage enterCodeInPhoneField(String PhoneCoderUser) throws InterruptedException {
        WebElement CodeFieldAuthorizationPage = wait.until(ExpectedConditions.elementToBeClickable(CodeFieldPanelAuthorizationPage));
        CodeFieldAuthorizationPage.sendKeys(PhoneCoderUser);
//        Thread.sleep(2000); #Можливо потрыбно додавати#
        return null;
    }
    public String getCodeFieldValue() {
        WebElement PhoneFieldAuthorizationPage = wait.until(ExpectedConditions.elementToBeClickable(CodeFieldPanelAuthorizationPage));
        return PhoneFieldAuthorizationPage.getAttribute("value");
    }

    public InfoboxQuitPage clickButtonQuitInfobox(){
        WebElement clickButtonQuitInfobox = wait.until(ExpectedConditions.elementToBeClickable(ButtonQuitInfobox));
        clickButtonQuitInfobox.click();
        return null;
    }
    public InfoboxQuitPage clickButtonQuitExitApproval(){
        WebElement clickButtonQuitInfobox = wait.until(ExpectedConditions.elementToBeClickable(ButtonQuitExitApproval));
        clickButtonQuitInfobox.click();
        return null;
    }
    public String getButtonQuitValue() {
        WebElement PhoneFieldAuthorizationPage = wait.until(ExpectedConditions.elementToBeClickable(ButtonQuitExitApproval));
        return PhoneFieldAuthorizationPage.getAttribute("textContent");
    }

}
