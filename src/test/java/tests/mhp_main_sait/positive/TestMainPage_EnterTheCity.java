package tests.mhp_main_sait.positive;

import org.junit.jupiter.api.Test;
import tests.base.baseTest;

import java.awt.*;

import static constans.Constans.Urls.MHP_PAGE1;


public class TestMainPage_EnterTheCity extends baseTest {

    @Test
    public void checkIsRedirectToAuth() throws InterruptedException, AWTException {
        //Метод для підставляння силки ITSM_MAIN_URL - сама силка, яка знаходиться в константах
        basePage.goToURL(MHP_PAGE1);
        MainPageMHP_EnterTheCity.clickbutton();
//        MainPageMHP_EnterTheCity.clickbutton();
        MainPageMHP_EnterTheCity.click_button_business_trip();
        MainPageMHP_EnterTheCity.click_button_business_trip_region();
        MainPageMHP_EnterTheCity.change_iframe();
        MainPageMHP_EnterTheCity.change_type_business_trips();
        MainPageMHP_EnterTheCity.change_iframe_city();
        MainPageMHP_EnterTheCity.change_iframe_city2();
        MainPageMHP_EnterTheCity.change_iframe_Enterprise();
        MainPageMHP_EnterTheCity.change_goal_business_trips();
        MainPageMHP_EnterTheCity.change_date_start_business_trips();
        MainPageMHP_EnterTheCity.change_date_end_business_trips();
        MainPageMHP_EnterTheCity.change_save_business_trips();



    }

}