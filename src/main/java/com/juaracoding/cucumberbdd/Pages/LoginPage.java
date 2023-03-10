package com.juaracoding.cucumberbdd.Pages;

import com.juaracoding.cucumberbdd.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //sebelum deklar isi
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement username;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement txtDashboard;
    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
    WebElement loginTitle;

    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    WebElement dropdownProfile;
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement btnLogout;

//    @FindBy(xpath = "//input[@placeholder='Username']")
//    WebElement invalidusername;
//    @FindBy(xpath = "//input[@placeholder='Password']")
//    WebElement invalidpassword;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement nullpassword;

    @FindBy(xpath = "//div[@class='oxd-alert-content oxd-alert-content--error']")
    WebElement Invalidcredential;

    public String getLoginTitle(){

        return loginTitle.getText();
    }
    public String getTxtDashboard(){

        return txtDashboard.getText();
    }

//    public String getTxtInvalid(){
//        return Invalidcredential.getText();
//    }



    //isiannya
    public void login(){
        username.sendKeys("Admin");
        password.sendKeys("admin123");
        btnLogin.click();
    }

//    public void invalidLogin(){
//        invalidusername.sendKeys("Adminn");
//        invalidpassword.sendKeys("admin1234");
//        btnLogin.click();
//    }


    //eksekusivalid
    public void enterUsername(String username){

        this.username.sendKeys(username);
        //this.invalidusername.sendKeys(username);
    }

    public void enterPassword(String password){

        this.password.sendKeys(password);
       // this.invalidpassword.sendKeys(password);
    }
 public  void buttonLogin(){

        btnLogin.click();
 }

 public void ddProfile(){
        dropdownProfile.click();
 }
    public void buttonLogout(){
        btnLogout.click();
    }

}
