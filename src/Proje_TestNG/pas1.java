package Proje_TestNG;

import Utils.MetodDriver;
import Utils.ParameterDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class pas1 extends ParameterDriver {

    @Test
    @Parameters({"giris", "kullaniciSifre"})
    public void contactUs(String e_mail, String password) throws InterruptedException {

        driver.navigate().to("http://demowebshop.tricentis.com/");

        pas1_Elementler elementler = new pas1_Elementler(driver);

        //Login e Tiklandi
        elementler.login.click();
        //E-mail girildi
        elementler.e_mailgiris.sendKeys(e_mail);
        //password girildi
        elementler.paswordgiris.sendKeys(password);
        //login tiklandi
        elementler.login_button.click();
        // contactus tiklandi
        elementler.contactus.click();
        //Enquiry notu yazildi
        elementler.enquiry.sendKeys("Können Sie mir bitte helfen ?");
        elementler.submit.click();

        Assert.assertTrue(elementler.msjcontactus.getText().contains("successfully "));


    }
}
