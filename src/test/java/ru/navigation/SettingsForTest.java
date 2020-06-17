package ru.navigation;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SettingsForTest {
    ChromeDriver driver;
    String url = "https://www.google.com/";
    String url2 = "https://market.yandex.ru/";
    private String driverType = "webdriver.chrome.driver";
    private String driverPath = "/WebDriver/chromedriver_win32/chromedriver.exe";
    @Before
    public void settingsOfWebDriver() {
        System.setProperty(driverType,driverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @After
    public void closeWebDriver() {
        //driver.quit();
    }
}
