package Proje_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.print.PageFormat;

public class pas1_Elementler {
    public pas1_Elementler(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }


    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement login;
    @FindBy(id = "Email")
    public WebElement e_mailgiris;
    @FindBy(id = "Password")
    public WebElement paswordgiris;
    @FindBy(xpath = "//input[@value='Log in']")
    public WebElement login_button;

    @FindBy(linkText = "Contact us")
    public WebElement contactus;

    @FindBy(id = "Enquiry")
    public WebElement enquiry;

    @FindBy(name = "send-email")
    public WebElement submit;

    @FindBy(css = "div.result")
    public WebElement msjcontactus;








}
