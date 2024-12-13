package tests.InfoboxTest.positive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import java.awt.*;

import static constans.Constans.Urls.INFOBOX_PAGE;


public class TestInfoboxCreationTask extends BaseTest {
    static String  chekPhoneNumberUser = "(95) 623 51 62";
    static String  chekCodeNumberUser = "12345";
    static String  chekButtonCreationValue = "Співробітник";
    static String  chekTextTnField = "Заявка створена автотестом";
    @Test
    public void checkIsRedirectToAuth() throws InterruptedException, AWTException {
        //Метод для підставляння силки ITSM_MAIN_URL - сама силка, яка знаходиться в константах
        BasePage.goToURL(INFOBOX_PAGE);
        InfoboxCreationTask.enterNumberInPhoneField("956235162");
        String actualPhoneNumber = InfoboxCreationTask.getPhoneFieldValue();
        Assertions.assertEquals( chekPhoneNumberUser, actualPhoneNumber,"Невідповідність номеру телефону!");
        InfoboxCreationTask.clickButtonContinueAuthorizationPage();
        InfoboxCreationTask.enterCodeInPhoneField("12345");
        String actualCodeNumber = InfoboxCreationTask.getCodeFieldValue();
        Assertions.assertEquals( chekCodeNumberUser, actualCodeNumber,"Невідповідність коду телефону!");
        InfoboxCreationTask.clickButtonContinueAuthorizationPage();
        InfoboxCreationTask.clickButtonGoInMainPage();
        InfoboxCreationTask.clickButtonCreationTaskInVacationPage();
        String actualButtonCreation = InfoboxCreationTask.getButtonCreationTaskInVacationPageValue();
        Assertions.assertEquals( chekButtonCreationValue, actualButtonCreation,"Відсутнє поле Співробітник !");
        InfoboxCreationTask.clickDropdownInCreationTask();
        InfoboxCreationTask.clickChoosingVacationType();
        InfoboxCreationTask.clickButtonContinueInCreationTask();
        InfoboxCreationTask.EnteringTextTnField();
        String actualTextTnField = InfoboxCreationTask.getButtonTextTnFieldValu1e();
        Assertions.assertEquals( chekTextTnField, actualTextTnField,"Відсутній напис в полі !");
        InfoboxCreationTask.clickButtonSignInCreationTask();
        InfoboxCreationTask.drawOnTheBoard();
        InfoboxCreationTask.clickTheSignButton();




    }

}