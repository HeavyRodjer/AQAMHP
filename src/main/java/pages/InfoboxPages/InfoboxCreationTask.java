package pages.InfoboxPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.basePage;

import java.time.Duration;

import static constans.Constans.TimeoutVeribles.EXPLICT_WAIT;

public class InfoboxCreationTask extends basePage {
    public InfoboxCreationTask(WebDriver driver) {
        super(driver);
    }
    public final By PhoneFieldPanelAuthorizationPage = By.xpath("//input[@type='tel' and @class='react-international-phone-input']");
    public final By buttonContinueAuthorizationPage = By.xpath("//span[text()= 'Продовжити']");
    public final By CodeFieldPanelAuthorizationPage = By.xpath("//input[@name='code' and @type='tel' and @placeholder='XXXXX']");
    public final By ButtonGoInMainPage = By.xpath("//span[text() = 'Перейти']");
    public final By FieldEmployee = By.xpath("//span[text() = 'Співробітник']");
    public final By ButtonCreationTaskInVacationPage = By.xpath(" //span[text() = 'Створити заявку']");
    public final By DropdownInCreationTask = By.xpath(" //span[@class='ant-select-selection-item' and @title='']");
    public final By ChoosingVacationType = By.xpath("//div[text() = 'Відпустка щорічна основна (ст.6 ЗУ Про Відпустки)']");
    public final By ButtonContinueInCreationTask = By.xpath(" //span[text() = 'Продовжити']");
    public final By ButtonSignInCreationTask = By.xpath(" //span[text() = 'Підписати']");
    public final By TextField = By.xpath(" //textarea[@placeholder='Введіть Ваш коментар']");
    public final By FindAChoppingBoard = By.xpath(" //canvas[@data-testid='canvas-element']");
    public final By TheSiignButton = By.xpath("(//span[text() = 'Підписати'])[2]");


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICT_WAIT));

    public InfoboxCreationTask enterNumberInPhoneField(String PhoneNumberUser){
        WebElement PhoneFieldAuthorizationPage = wait.until(ExpectedConditions.elementToBeClickable(PhoneFieldPanelAuthorizationPage));
        PhoneFieldAuthorizationPage.sendKeys(PhoneNumberUser);
        return this;
    }
    public String getPhoneFieldValue() {
        WebElement PhoneFieldAuthorizationPage = wait.until(ExpectedConditions.elementToBeClickable(PhoneFieldPanelAuthorizationPage));
        return PhoneFieldAuthorizationPage.getAttribute("value");
    }

    public InfoboxCreationTask clickButtonContinueAuthorizationPage(){
        WebElement ButtonContinue = wait.until(ExpectedConditions.elementToBeClickable(buttonContinueAuthorizationPage));
        ButtonContinue.click();
        return null;

    }
    public InfoboxCreationTask enterCodeInPhoneField(String PhoneCoderUser) throws InterruptedException {
        WebElement CodeFieldAuthorizationPage = wait.until(ExpectedConditions.elementToBeClickable(CodeFieldPanelAuthorizationPage));
        CodeFieldAuthorizationPage.sendKeys(PhoneCoderUser);
//        Thread.sleep(2000); #Можливо потрыбно додавати#
        return null;
    }
    public String getCodeFieldValue() {
        WebElement CodeFieldAuthorizationPage = wait.until(ExpectedConditions.elementToBeClickable(CodeFieldPanelAuthorizationPage));
        return CodeFieldAuthorizationPage.getAttribute("value");
    }


    public InfoboxSearchTask clickButtonGoInMainPage(){
        WebElement clickButtonGoInMainPage = wait.until(ExpectedConditions.elementToBeClickable(ButtonGoInMainPage));
        clickButtonGoInMainPage.click();
        return null;
    }

    public InfoboxCreationTask clickButtonCreationTaskInVacationPage() throws InterruptedException {
        WebElement clickButtonCreationTaskInVacationPage = wait.until(ExpectedConditions.elementToBeClickable(ButtonCreationTaskInVacationPage));
        Thread.sleep(3000);
        clickButtonCreationTaskInVacationPage.click();
        Thread.sleep(5000);
        return null;

    }
    public String getButtonCreationTaskInVacationPageValue() {
        WebElement clickButtonCreationTaskInVacationPage = wait.until(ExpectedConditions.elementToBeClickable(FieldEmployee));
        return clickButtonCreationTaskInVacationPage.getAttribute("textContent");
    }
    
    public InfoboxCreationTask clickDropdownInCreationTask() {
        WebElement clickDropdownInCreationTask = wait.until(ExpectedConditions.elementToBeClickable(DropdownInCreationTask));
        clickDropdownInCreationTask.click();
        return null;
    }

    public InfoboxCreationTask clickChoosingVacationType()  {
        WebElement clickChoosingVacationType = wait.until(ExpectedConditions.elementToBeClickable(ChoosingVacationType));
        clickChoosingVacationType.click();
        return null;
    }
    public InfoboxCreationTask clickButtonContinueInCreationTask()  {
        WebElement clickButtonContinueInCreationTask = wait.until(ExpectedConditions.elementToBeClickable(ButtonContinueInCreationTask));
        clickButtonContinueInCreationTask.click();
        return null;
    }
    public InfoboxCreationTask EnteringTextTnField()  {
        WebElement EnteringTextTnField = wait.until(ExpectedConditions.elementToBeClickable(TextField));
        EnteringTextTnField.sendKeys("Заявка створена автотестом");
        return null;
    }
    public String getButtonTextTnFieldValu1e() {
        WebElement EnteringTextTnField = wait.until(ExpectedConditions.elementToBeClickable(TextField));
        return EnteringTextTnField.getAttribute("textContent");
    }

    public InfoboxCreationTask clickButtonSignInCreationTask()  {
        WebElement clickButtonSignInCreationTask = wait.until(ExpectedConditions.elementToBeClickable(ButtonSignInCreationTask));
        clickButtonSignInCreationTask.click();
        return null;
    }

    public InfoboxCreationTask drawOnTheBoard() throws InterruptedException {
        Thread.sleep(15000);
        WebElement drawOnTheBoard = wait.until(ExpectedConditions.elementToBeClickable(FindAChoppingBoard));
        drawOnTheBoard.click();
        return null;
    }
    public InfoboxCreationTask clickTheSignButton() throws InterruptedException {
        WebElement clickTheSignButton = wait.until(ExpectedConditions.elementToBeClickable(TheSiignButton));
        clickTheSignButton.click();
        return null;
    }

}
