package pages.InfoboxPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.basePage;

import java.time.Duration;

import static constans.Constans.TimeoutVeribles.EXPLICT_WAIT;

public class InfoboxFinalizationTask extends basePage {
    public InfoboxFinalizationTask(WebDriver driver) {
        super(driver);
    }
    public final By PhoneFieldPanelAuthorizationPage = By.xpath("//input[@type='tel' and @class='react-international-phone-input']");
    public final By buttonContinueAuthorizationPage = By.xpath("//span[text()= 'Продовжити']");
    public final By CodeFieldPanelAuthorizationPage = By.xpath("//input[@name='code' and @type='tel' and @placeholder='XXXXX']");
    public final By ButtonGoInMainPage = By.xpath("//span[text() = 'Перейти']");
    public final By ButtonFinalizingInVacationPage = By.xpath(" (//span[text() = 'На доопрацюванні'])[1]");
    public final By ButtonCreationTaskInVacationPage = By.xpath(" //span[text() = 'Створити заявку']");

    public final By DropdownInCreationTask = By.xpath(" //span[@class='ant-select-selection-item' and @title='']");
    public final By ChoosingVacationType = By.xpath("//div[text() = 'Відпустка щорічна основна (ст.6 ЗУ Про Відпустки)']");
    public final By ButtonContinueInCreationTask = By.xpath(" //span[text() = 'Продовжити']");
    public final By ButtonSignInCreationTask = By.xpath(" //span[text() = 'Підписати']");
    public final By TextField = By.xpath(" //textarea[@placeholder='Введіть Ваш коментар']");
    public final By FindAChoppingBoard = By.xpath(" //canvas[@data-testid='canvas-element']");
    public final By TheSiignButton = By.xpath("(//span[text() = 'Підписати'])[2]");


    public final By ButtonEdit = By.xpath("   (//span[text() = 'Редагувати'])[1]");


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICT_WAIT));



    public InfoboxFinalizationTask enterNumberInPhoneField(String PhoneNumberUser){
        WebElement PhoneFieldAuthorizationPage = wait.until(ExpectedConditions.elementToBeClickable(PhoneFieldPanelAuthorizationPage));
        PhoneFieldAuthorizationPage.sendKeys(PhoneNumberUser);
        return this;
    }
    public String getPhoneFieldValue() {
        WebElement PhoneFieldAuthorizationPage = wait.until(ExpectedConditions.elementToBeClickable(PhoneFieldPanelAuthorizationPage));
        return PhoneFieldAuthorizationPage.getAttribute("value");
    }

    public InfoboxFinalizationTask clickButtonContinueAuthorizationPage(){
        WebElement ButtonContinue = wait.until(ExpectedConditions.elementToBeClickable(buttonContinueAuthorizationPage));
        ButtonContinue.click();
        return null;

    }
    public InfoboxFinalizationTask enterCodeInPhoneField(String PhoneCoderUser) throws InterruptedException {
        WebElement CodeFieldAuthorizationPage = wait.until(ExpectedConditions.elementToBeClickable(CodeFieldPanelAuthorizationPage));
        CodeFieldAuthorizationPage.sendKeys(PhoneCoderUser);
//        Thread.sleep(2000); #Можливо потрыбно додавати#
        return null;
    }
    public String getCodeFieldValue() {
        WebElement PhoneFieldAuthorizationPage = wait.until(ExpectedConditions.elementToBeClickable(CodeFieldPanelAuthorizationPage));
        return PhoneFieldAuthorizationPage.getAttribute("value");
    }
    public InfoboxFinalizationTask clickButtonGoInMainPage(){
        WebElement clickButtonGoInMainPage = wait.until(ExpectedConditions.elementToBeClickable(ButtonGoInMainPage));
        clickButtonGoInMainPage.click();
        return null;
    }
    public InfoboxFinalizationTask clickButtonFinalizingInVacationPage(){
        WebElement clickButtonFinalizingInVacationPage = wait.until(ExpectedConditions.elementToBeClickable(ButtonFinalizingInVacationPage));
        clickButtonFinalizingInVacationPage.click();
        return null;
    }
    public String getFinalizingValue() {
        WebElement PhoneFieldAuthorizationPage = wait.until(ExpectedConditions.elementToBeClickable(ButtonFinalizingInVacationPage));
        return PhoneFieldAuthorizationPage.getAttribute("textContent");
    }
    public InfoboxFinalizationTask clickButtonEdit() throws InterruptedException {
        WebElement clickButtonEdit = wait.until(ExpectedConditions.elementToBeClickable(ButtonEdit));
        clickButtonEdit.click();
        Thread.sleep(15000);
        return null;
    }
    public InfoboxFinalizationTask clickButtonContinueInCreationTask()  {
        WebElement clickButtonContinueInCreationTask = wait.until(ExpectedConditions.elementToBeClickable(ButtonContinueInCreationTask));
        clickButtonContinueInCreationTask.click();
        return null;
    }
    public InfoboxFinalizationTask EnteringTextTnField( String SendMessage)  {
        WebElement EnteringTextTnField = wait.until(ExpectedConditions.elementToBeClickable(TextField));
        EnteringTextTnField.sendKeys(SendMessage);
        return null;
    }
    public String getButtonTextTnFieldValu1e() {
        WebElement EnteringTextTnField = wait.until(ExpectedConditions.elementToBeClickable(TextField));
        return EnteringTextTnField.getAttribute("textContent");
    }

    public InfoboxFinalizationTask clickButtonSignInCreationTask()  {
        WebElement clickButtonSignInCreationTask = wait.until(ExpectedConditions.elementToBeClickable(ButtonSignInCreationTask));
        clickButtonSignInCreationTask.click();
        return null;
    }

    public InfoboxFinalizationTask drawOnTheBoard() throws InterruptedException {
        Thread.sleep(15000);
        WebElement drawOnTheBoard = wait.until(ExpectedConditions.elementToBeClickable(FindAChoppingBoard));
        drawOnTheBoard.click();
        return null;
    }
    public InfoboxFinalizationTask clickTheSignButton() {
        WebElement clickTheSignButton = wait.until(ExpectedConditions.elementToBeClickable(TheSiignButton));
        clickTheSignButton.click();
        return null;
    }

}
