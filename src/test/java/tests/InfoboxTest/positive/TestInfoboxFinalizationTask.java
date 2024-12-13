package tests.InfoboxTest.positive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import java.awt.*;

import static constans.Constans.Urls.INFOBOX_PAGE;


public class TestInfoboxFinalizationTask extends BaseTest {
    static String  chekPhoneNumberUser = "(95) 623 51 62";
    static String  chekCodeNumberUser = "12345";
    static String  chekFinalizingValue= "На доопрацюванні" ;
    static String  chekButtonCreationValue = "Співробітник";
    static String  chekTextTnField = "Доопрацювання заявки автотестом";
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
        InfoboxSearchTask.clickButtonFinalizingInVacationPage();
        String actualFinalizingValue = InfoboxSearchTask.getFinalizingValue();
        Assertions.assertEquals( chekFinalizingValue, actualFinalizingValue,"Не знайдено відпустку в статусі доопарцювання!");
        InfoboxFinalizationTask.clickButtonEdit();
        InfoboxFinalizationTask.clickButtonContinueInCreationTask();
        InfoboxFinalizationTask.EnteringTextTnField("Доопрацювання заявки автотестом");
        String actualTextTnField = InfoboxFinalizationTask.getButtonTextTnFieldValu1e();
        Assertions.assertEquals( chekTextTnField, actualTextTnField,"Відсутній напис в полі !");
        InfoboxFinalizationTask.clickButtonSignInCreationTask();
        InfoboxFinalizationTask.drawOnTheBoard();
        InfoboxFinalizationTask.clickTheSignButton();


    }

}