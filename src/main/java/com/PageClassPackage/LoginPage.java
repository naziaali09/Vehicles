package com.PageClassPackage;

import com.BaseClassPackage.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class LoginPage extends BaseClass {


    @FindBy(xpath= "//*[@id=\"username\"]")
    WebElement userName;
    @FindBy(xpath= "//*[@id=\"password\"]")
    WebElement passWord;
    @FindBy(xpath= "//*[@id=\"loginButton\"]")
    WebElement loginBtn;
    @FindBy(xpath = "//*[@id=\"register\"]")
    WebElement register;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public String VerifyLoginTitle(){
        String title1=driver.getTitle();
        return title1;
    }
    public boolean verifyRegister(){
        boolean reg = register.isDisplayed();
        return reg;
    }
    public void loginmethods(String un, String pwd){
        userName.sendKeys(un);
        passWord.sendKeys(pwd);
        loginBtn.click();
    }

    public LandingPage loginmethod(String username, String password) {
        return null;
    }
}
