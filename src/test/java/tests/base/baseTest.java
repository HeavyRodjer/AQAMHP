package tests.base;
import static common.config.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import common.Common_actions;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.base.basePage;
import pages.mhp_main_page.MainPageMHP;
import pages.mhp_main_page.MainPageMHP_OpenTask;
import pages.mhp_main_page.MainPageMHP_CreationTask;
import pages.mhp_main_page.MainPageMHP_ChangeUser;
import pages.mhp_main_page.MainPageMHP_EnterTheCity;
import pages.mhp_main_page.MainPageMHP_Deploy;
import pages.mhp_main_page.MainPageMHP_TakeTask;
import pages.InfoboxPages.InfoboxStartMainPage;
import pages.InfoboxPages.InfoboxQuitPage;
import pages.InfoboxPages.InfoboxSearchTask;
import pages.InfoboxPages.InfoboxCreationTask;
import pages.InfoboxPages.InfoboxFinalizationTask;

import java.io.*;
import java.time.LocalTime;
import java.util.Objects;

@Feature("Main Page")
@ExtendWith(Listener.class)
@Execution(ExecutionMode.CONCURRENT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
/**
 * ІНІЦІАЛІЗАЦІЯ ВСІХ ПЕЙДЖІВ, ЯКІ ЗАНХОДЯТЬСЯ В ПАПЦІ pages
 */
public class BaseTest {
    protected WebDriver driver = Common_actions.createDriver();
    protected basePage BasePage = new basePage(driver);
    protected MainPageMHP MainPageMHP = new MainPageMHP(driver);
    protected MainPageMHP_OpenTask MainPageMHP_OpenTask = new MainPageMHP_OpenTask(driver);
    protected MainPageMHP_CreationTask MainPageMHP_CreationTask = new MainPageMHP_CreationTask(driver);
    protected MainPageMHP_ChangeUser MainPageMHP_ChangeUser = new MainPageMHP_ChangeUser(driver);
    protected MainPageMHP_EnterTheCity MainPageMHP_EnterTheCity = new MainPageMHP_EnterTheCity(driver);
    protected MainPageMHP_Deploy MainPageMHP_Deploy = new MainPageMHP_Deploy(driver);
    protected MainPageMHP_TakeTask MainPageMHP_TakeTask = new MainPageMHP_TakeTask(driver);
    protected InfoboxStartMainPage InfoboxStartMainPage = new InfoboxStartMainPage(driver);
    protected InfoboxQuitPage InfoboxQuitInfobox = new InfoboxQuitPage(driver);
    protected InfoboxSearchTask InfoboxSearchTask = new InfoboxSearchTask(driver);
    protected InfoboxCreationTask InfoboxCreationTask = new InfoboxCreationTask(driver);
    protected InfoboxFinalizationTask InfoboxFinalizationTask = new InfoboxFinalizationTask(driver);

    private static final String COOKIE_FILE = "cookie/cookies.data";

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseTest.class);
    static {
        LOGGER.info("START TIME:" + LocalTime.now());
        // Очиста самих алюрів
        LOGGER.info("START CLEAR REPORTS dir: screenshots/reports/tests");
        File allureResults = new File("allure-results");
        if (allureResults.isDirectory()){
            for (File item : Objects.requireNonNull(allureResults.listFiles()))
                item.delete();
        }
        // Очиста Скрінів
        if (CLEAR_REPORTS_DIR){
            File allureScreenshots = new File("screenshots/reports/tests");
            for (File item : Objects.requireNonNull(allureScreenshots.listFiles()))
                item.delete();
        }

    }
    // Очиста всіх кукі
    @AfterEach
    void  ClearCookiesAndLocalStorage(){
        if (CLEAR_COOLIES){
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }
    // Закриття чи не закриття браузера
@AfterAll
void  close(){
    if(!HOLD_BROWSER_OPEN){
        driver.close();

    }
}


}

