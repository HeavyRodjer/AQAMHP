package tests.mhp_main_sait.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import java.awt.*;

import static constans.Constans.Urls.MHP_PAGE1;


public class TestMainPage_ChangeUser extends BaseTest {

    @Test
    public void checkIsRedirectToAuth() throws InterruptedException, AWTException {
        //Метод для підставляння силки ITSM_MAIN_URL - сама силка, яка знаходиться в константах
        BasePage.goToURL(MHP_PAGE1);
        MainPageMHP_ChangeUser.clickbutton();
        MainPageMHP_ChangeUser.click_button_business_trip();
        MainPageMHP_ChangeUser.click_button_business_trip_region();
        MainPageMHP_ChangeUser.change_iframe();
        MainPageMHP_ChangeUser.change_type_business_trips();



    }

}