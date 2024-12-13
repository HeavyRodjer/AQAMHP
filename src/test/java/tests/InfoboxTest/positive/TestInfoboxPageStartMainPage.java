package tests.InfoboxTest.positive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.InfoboxPages.InfoboxStartMainPage;
import tests.base.BaseTest;

import java.awt.*;

import static constans.Constans.Urls.INFOBOX_PAGE;


public class TestInfoboxPageStartMainPage extends BaseTest {
    static String  chekPhoneNumberUser = "(95) 623 51 62";
    static String  chekCodeNumberUser = "12345";
    @Test
    public void checkIsRedirectToAuth() throws InterruptedException, AWTException {
        //Метод для підставляння силки ITSM_MAIN_URL - сама силка, яка знаходиться в константах
        BasePage.goToURL(INFOBOX_PAGE);
        InfoboxStartMainPage.enterNumberInPhoneField("956235162");
        String actualPhoneNumber = InfoboxSearchTask.getPhoneFieldValue();
        Assertions.assertEquals( chekPhoneNumberUser, actualPhoneNumber,"Невідповідність номеру телефону!");
        InfoboxStartMainPage.clickButtonContinueAuthorizationPage();
        InfoboxStartMainPage.enterCodeInPhoneField("12345");
        String actualCodeNumber = InfoboxSearchTask.getCodeFieldValue();
        Assertions.assertEquals( chekCodeNumberUser, actualCodeNumber,"Невідповідність коду телефону!");
        InfoboxStartMainPage.clickButtonContinueAuthorizationPage();
    }

}