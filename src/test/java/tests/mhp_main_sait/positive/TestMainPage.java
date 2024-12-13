package tests.mhp_main_sait.positive;

import tests.base.BaseTest;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static constans.Constans.Urls.MHP_PAGE1;


public class TestMainPage extends BaseTest {

    @Test
    public void checkIsRedirectToAuth() throws InterruptedException, AWTException {
        //Метод для підставляння силки ITSM_MAIN_URL - сама силка, яка знаходиться в константах
        BasePage.goToURL(MHP_PAGE1);
        MainPageMHP.clickbutton();
        MainPageMHP.click();
        MainPageMHP.click_business_trip();


    }

}