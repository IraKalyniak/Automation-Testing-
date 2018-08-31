package org.eleks;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.support.FindBy;
 import org.openqa.selenium.support.How;
 import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "/html/body/app/main/login/div/div/div/div/div/button")
    public WebElement getInTouchButton;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public SinginPage goToSinginPage()
    {
        getInTouchButton.click();
        return new SinginPage(driver);
    }


}
