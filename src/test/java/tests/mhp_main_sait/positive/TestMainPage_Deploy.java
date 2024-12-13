package tests.mhp_main_sait.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import java.awt.*;

import static constans.Constans.Urls.MHP_PAGE1;


public class TestMainPage_Deploy extends BaseTest {

    @Test
    public void checkIsRedirectToAuth() throws InterruptedException, AWTException {
        //Метод для підставляння силки ITSM_MAIN_URL - сама силка, яка знаходиться в константах
        BasePage.goToURL(MHP_PAGE1);
        MainPageMHP_Deploy.clickbutton();
        MainPageMHP_Deploy.click_button_business_trip();
        MainPageMHP_Deploy.click_button_business_trip_region();
        MainPageMHP_Deploy.change_iframe();
        MainPageMHP_Deploy.click_button_business_trip_region1();
        MainPageMHP_Deploy.click_button_business_trip_region_items();
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