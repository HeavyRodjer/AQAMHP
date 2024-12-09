package tests.mhp_main_sait.positive;

import org.junit.jupiter.api.Test;
import tests.base.baseTest;

import java.awt.*;

import static constans.Constans.Urls.MHP_PAGE1;

public class TestMainPage_OpenTask extends baseTest {
    @Test
    public void checkIsRedirectToAuth() throws InterruptedException, AWTException {
        //Метод для підставляння силки ITSM_MAIN_URL - сама силка, яка знаходиться в константах
        basePage.goToURL(MHP_PAGE1);
        MainPageMHP_OpenTask.clickbutton();
        MainPageMHP_OpenTask.clickbutton();
        MainPageMHP_OpenTask.click();
        MainPageMHP_OpenTask.click_business_trip();
        MainPageMHP_OpenTask.click_to_task();


    }

}
