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
public class baseTest {
    protected WebDriver driver = Common_actions.createDriver();
    protected basePage basePage = new basePage(driver);
    protected MainPageMHP MainPageMHP = new MainPageMHP(driver);
    protected MainPageMHP_OpenTask MainPageMHP_OpenTask = new MainPageMHP_OpenTask(driver);
    protected MainPageMHP_CreationTask MainPageMHP_CreationTask = new MainPageMHP_CreationTask(driver);
    protected MainPageMHP_ChangeUser MainPageMHP_ChangeUser = new MainPageMHP_ChangeUser(driver);
    protected MainPageMHP_EnterTheCity MainPageMHP_EnterTheCity = new MainPageMHP_EnterTheCity(driver);
    protected MainPageMHP_Deploy MainPageMHP_Deploy = new MainPageMHP_Deploy(driver);
    protected MainPageMHP_TakeTask MainPageMHP_TakeTask = new MainPageMHP_TakeTask(driver);
    private static final String COOKIE_FILE = "cookie/cookies.data";

    private static final Logger LOGGER = LoggerFactory.getLogger(baseTest.class);
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
    // Збереження cookie у файл
//    protected void saveCookies() throws IOException {
//        // Отримуємо всі cookies з браузера
//        Set<Cookie> cookies = driver.manage().getCookies();
//
//        // Створюємо файл для збереження cookies в папці "cookie"
//        File file = new File("cookie/cookies.data");
//        if (!file.exists()) {
//            file.createNewFile(); // Створюємо сам файл, якщо він не існує
//        }
//
//        // Створюємо потік для запису в файл
//        FileWriter fileWriter = new FileWriter(file);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//
//        // Записуємо кожен cookie в файл
//        for (Cookie cookie : cookies) {
//            bufferedWriter.write(cookie.getName() + ";" + cookie.getValue() + ";" + cookie.getDomain() + ";" +
//                    cookie.getPath() + ";" + cookie.getExpiry() + ";" + cookie.isSecure());
//            bufferedWriter.newLine();
//        }
//
//        // Закриваємо потік після запису
//        bufferedWriter.close();
//        LOGGER.info("Cookies збережено у файл: " + file.getAbsolutePath());
//    }
//
//    // Завантаження cookies з файлу
//    protected void loadCookies() throws IOException {
//        File file = new File("cookie/cookies.data");
//        if (!file.exists()) {
//            LOGGER.warn("Файл cookie не знайдено. Авторизація буде виконана вручну.");
//            return;
//        }
//
//        // Читаємо cookies з файлу
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//        String line;
//        while ((line = bufferedReader.readLine()) != null) {
//            String[] cookieParts = line.split(";");
//            String name = cookieParts[0];
//            String value = cookieParts[1];
//            String domain = cookieParts[2];
//            String path = cookieParts[3];
//            String expiryString = cookieParts[4];
//            boolean isSecure = Boolean.parseBoolean(cookieParts[5]);
//
//            // Перетворюємо дату з рядка у формат java.util.Date
//            java.util.Date expiry = expiryString.equals("null") ? null : new java.util.Date(expiryString);
//
//            // Створюємо cookie і додаємо його до драйвера
//            Cookie cookie = new Cookie(name, value, domain, path, expiry, isSecure);
//            driver.manage().addCookie(cookie);
//        }
//
//        // Закриваємо потік після читання
//        bufferedReader.close();
//        LOGGER.info("Cookies завантажено з файлу: " + file.getAbsolutePath());
//    }

}

