package ru.navigation;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationToGoogle {

    @Test
    public void FirstTest(){
        System.setProperty("webdriver.chrome.driver", "/WebDriver/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

}
