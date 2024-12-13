package tests.mhp_main_sait.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import java.awt.*;

import static constans.Constans.Urls.MHP_PAGE1;

public class TestMainPage_OpenTask extends BaseTest {
    @Test
    public void checkIsRedirectToAuth() throws InterruptedException, AWTException {
        //Метод для підставляння силки ITSM_MAIN_URL - сама силка, яка знаходиться в константах
        BasePage.goToURL(MHP_PAGE1);
        MainPageMHP_OpenTask.clickbutton();
        MainPageMHP_OpenTask.click();
        MainPageMHP_OpenTask.click_business_trip();
        MainPageMHP_OpenTask.click_to_task();


    }

}
