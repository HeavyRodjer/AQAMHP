package tests.mhp_main_sait.positive;

import org.junit.jupiter.api.Test;
import pages.mhp_main_page.MainPageMHP_Deploy;
import tests.base.baseTest;

import java.awt.*;

import static constans.Constans.Urls.MHP_PAGE1;


public class TestMainPage_Deploy extends baseTest {

    @Test
    public void checkIsRedirectToAuth() throws InterruptedException, AWTException {
        //Метод для підставляння силки ITSM_MAIN_URL - сама силка, яка знаходиться в константах
        basePage.goToURL(MHP_PAGE1);
        MainPageMHP_Deploy.clickbutton();
        MainPageMHP_Deploy.clickbutton();
        MainPageMHP_Deploy.click_button_business_trip();
        MainPageMHP_Deploy.click_button_business_trip_region();
        MainPageMHP_Deploy.change_iframe();
        MainPageMHP_Deploy.change_type_business_trips();
        MainPageMHP_Deploy.change_iframe_city();
        MainPageMHP_Deploy.change_iframe_city2();
        MainPageMHP_Deploy.change_iframe_Enterprise();
        MainPageMHP_Deploy.change_goal_business_trips();
        MainPageMHP_Deploy.change_date_start_business_trips();
        MainPageMHP_Deploy.change_date_end_business_trips();
        MainPageMHP_Deploy.change_save_business_trips();



    }

}