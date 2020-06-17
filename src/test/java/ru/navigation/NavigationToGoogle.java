package ru.navigation;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;


public class NavigationToGoogle extends SettingsForTest {
    //TC ONE
    @Test
    public void TcOne() {
        //Step1
        goToGoogle();
        //Step2
        searchYandexMarket();
        //Step3 and 4
        validationAndNavigation();
    }
    //TC TWO
    @Test
    public void TcTwo(){
        //Step1
        goToYandexMarket();
        //Step2
        searchItem();
        //Step3
        validateItem();
        //Step4
        expandFilters();
        //Step5
        selectProducts();
        //Step6
        setPrice();


    }
    //TCONE methods
    private void goToGoogle(){
        driver.get(url);
        String tittle = driver.getTitle();
        Assert.assertTrue(tittle.equals("Google"));
    }

    private void searchYandexMarket(){
        WebElement searchField = driver.findElementByName("q");
        searchField.click();
        searchField.sendKeys("Yandex Market");
        WebElement searchButton = driver.findElementByClassName("gNO89b");
        searchButton.click();
    }

    private void validationAndNavigation(){
        WebElement firstReference = driver.findElementByXPath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/div/cite");
        String actualResult = firstReference.getText();
        String exceptedResult = "market.yandex.ru";
        Assert.assertEquals(exceptedResult, actualResult);
        firstReference.click();
    }

    //TCTWO methods
    private void goToYandexMarket(){
        driver.get(url2);
        String tittle = driver.getTitle();
        Assert.assertTrue(tittle.equals("Яндекс.Маркет — выбор и покупка товаров из проверенных интернет-магазинов"));
    }

    private void searchItem(){
        WebElement seacrhField = driver.findElementById("header-search");
        seacrhField.sendKeys("Пылесосы");
        WebElement searchButton = driver.findElementByClassName("_1XiEJDPVpk");
        searchButton.click();
    }

    private void validateItem(){
        WebElement firstCatalog = driver.findElementByClassName("_3nuwI0jgrK");
        String actualResult = firstCatalog.getText();
        WebElement numOfItems = driver.findElementByClassName("_2Zmx_OlZWi");
        String numOfItemsText = numOfItems.getText();
        String exceptedResult = "Пылесосы" + " " + numOfItemsText;
        Assert.assertEquals(exceptedResult, actualResult);
        firstCatalog.click();
    }
    private void expandFilters(){
        WebElement filters = driver.findElementByClassName("_1YeOF5Jcfi _2Wg9rE1HzR");
        filters.click();
    }

    private void selectProducts(){
        WebElement searchField = driver.findElementByClassName("_1JYTt02WxW");
        searchField.click();
        searchField.sendKeys("Vitek");
        WebElement foundedItem = driver.findElementByClassName("NVoaOvqe58 _17C4Le-0TB");
        foundedItem.click();
        searchField.clear();
        searchField.sendKeys("Polaris");
        WebElement foundItem2 = driver.findElementByClassName("NVoaOvqe58 _17C4Le-0TB");
        foundItem2.click();
    }

    private void setPrice(){
        WebElement priceField = driver.findElementByClassName("_2yK7W3SWQ- _1f2usTwyAs");
        priceField.click();
        priceField.sendKeys("6000");
    }

}
