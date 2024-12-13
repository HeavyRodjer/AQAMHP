package tests.mhp_main_sait.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import java.awt.*;

import static constans.Constans.Urls.MHP_PAGE1;

public class TestMainPage_CreationTask extends BaseTest {
    @Test
    public void checkIsRedirectToAuth() throws InterruptedException, AWTException {
        //Метод для підставляння силки ITSM_MAIN_URL - сама силка, яка знаходиться в константах
        BasePage.goToURL(MHP_PAGE1);
        MainPageMHP_CreationTask.clickbutton();
        MainPageMHP_CreationTask.click_button_business_trip();
        MainPageMHP_CreationTask.click_button_business_trip_region();
        MainPageMHP_CreationTask.click_button_business_trip_region_items();


    }

}
