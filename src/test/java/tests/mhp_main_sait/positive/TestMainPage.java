package tests.mhp_main_sait.positive;

import tests.base.baseTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.awt.*;

import static constans.Constans.Urls.MHP_PAGE;
import static constans.Constans.Urls.MHP_PAGE1;


public class TestMainPage extends baseTest {

    @Test
    public void checkIsRedirectToAuth() throws InterruptedException, AWTException {
        //Метод для підставляння силки ITSM_MAIN_URL - сама силка, яка знаходиться в константах
        basePage.goToURL(MHP_PAGE1);
        MainPageMHP.clickbutton();
        MainPageMHP.clickbutton();
        MainPageMHP.click();
        MainPageMHP.click_business_trip();


    }

}