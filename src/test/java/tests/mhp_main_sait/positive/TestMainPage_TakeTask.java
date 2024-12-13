package tests.mhp_main_sait.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import java.awt.*;

import static constans.Constans.Urls.MHP_PAGE;


public class TestMainPage_TakeTask extends BaseTest {

    @Test
    public void checkIsRedirectToAuth() throws InterruptedException, AWTException {
        //Метод для підставляння силки ITSM_MAIN_URL - сама силка, яка знаходиться в константах
        BasePage.goToURL(MHP_PAGE);
        MainPageMHP_TakeTask.clickbutton();
        MainPageMHP_TakeTask.click_button_business_trip_region();
        MainPageMHP_TakeTask.click_button_business_trip_task();
        MainPageMHP_TakeTask.click_button_business();
        MainPageMHP_TakeTask.click_button_business_trip_task();



    }

}