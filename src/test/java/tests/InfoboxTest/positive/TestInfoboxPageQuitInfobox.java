package tests.InfoboxTest.positive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import java.awt.*;

import static constans.Constans.Urls.INFOBOX_PAGE;


public class TestInfoboxPageQuitInfobox extends BaseTest {
    static String  chekPhoneNumberUser = "(95) 623 51 62";
    static String  chekCodeNumberUser = "12345";
    static String  chekButtonQuitValue = "Так, вийти";
    @Test
    public void checkIsRedirectToAuth() throws InterruptedException, AWTException {
        //Метод для підставляння силки ITSM_MAIN_URL - сама силка, яка знаходиться в константах
        BasePage.goToURL(INFOBOX_PAGE);
        InfoboxQuitInfobox.enterNumberInPhoneField("956235162");
        String actualPhoneNumber = InfoboxQuitInfobox.getPhoneFieldValue();
        Assertions.assertEquals( chekPhoneNumberUser, actualPhoneNumber,"Невідповідність номеру телефону!");
        InfoboxQuitInfobox.clickButtonContinueAuthorizationPage();
        InfoboxQuitInfobox.enterCodeInPhoneField("12345");
        String actualCodeNumber = InfoboxQuitInfobox.getCodeFieldValue();
        Assertions.assertEquals( chekCodeNumberUser, actualCodeNumber,"Невідповідність коду телефону!");
        InfoboxQuitInfobox.clickButtonContinueAuthorizationPage();
        InfoboxQuitInfobox.clickButtonQuitInfobox();
        String actualButtonQuit= InfoboxQuitInfobox.getButtonQuitValue();
        Assertions.assertEquals( chekButtonQuitValue, actualButtonQuit,"Відсутня кнопка для закриття!");
        InfoboxQuitInfobox.clickButtonQuitExitApproval();


    }

}