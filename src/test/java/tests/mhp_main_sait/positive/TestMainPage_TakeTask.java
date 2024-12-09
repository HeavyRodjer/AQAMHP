package tests.mhp_main_sait.positive;

import org.junit.jupiter.api.Test;
import pages.mhp_main_page.MainPageMHP_TakeTask;
import tests.base.baseTest;

import java.awt.*;

import static constans.Constans.Urls.MHP_PAGE;


public class TestMainPage_TakeTask extends baseTest {

    @Test
    public void checkIsRedirectToAuth() throws InterruptedException, AWTException {
        //Метод для підставляння силки ITSM_MAIN_URL - сама силка, яка знаходиться в константах
        basePage.goToURL(MHP_PAGE);
        MainPageMHP_TakeTask.clickbutton();
        MainPageMHP_TakeTask.clickbutton();
        MainPageMHP_TakeTask.click_button_business_trip_region();



    }

}