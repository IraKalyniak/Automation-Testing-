package org.eleks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class App 
{

    @Test
    public  static void Test() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(" http://eds_university.eleks.com/login");

        Thread.sleep(2000);

        LoginPage loginPage = new LoginPage(driver);
        SinginPage singinPage = loginPage.goToSinginPage();

        singinPage.fullInForm("irysa0098@gmail.com", "Twj<uLXp%");
        singinPage.goToMainPage();

        //driver.quit();



    }

}
