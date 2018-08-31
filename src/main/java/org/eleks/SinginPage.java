package org.eleks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SinginPage
{
    private WebDriver driver;

    @FindBy(how = How.ID, using = "email")
    public WebElement emailInput;

    @FindBy(how = How.ID, using = "userPassword")
    public WebElement userPasswordInput;

    @FindBy(how = How.XPATH, using = "/html/body/app/main/login/div/div/div[2]/div/div/div[3]/button")
    public WebElement getInTouchButton2;


    public SinginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fullInForm(String email, String password)
    {
        emailInput.clear();
        emailInput.sendKeys(email);

        userPasswordInput.clear();
        userPasswordInput.sendKeys(password);
    }

    public MainPage goToMainPage()
    {
        getInTouchButton2.click();
        return new MainPage(driver);
    }
}
