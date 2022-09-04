package com.test.step_def;

import com.test.helper.ConfigReader;
import com.test.helper.Driver;
import com.test.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
@Slf4j
public class login_stepdef {
LoginPage loginPage=new LoginPage();
    @Given("kullanici username {string} girer")
    public void kullanici_username_girer(String userName) {



      loginPage.userName.sendKeys(userName);
      log.info("Example");
    }

    @Given("kullanici password {string} girer")
    public void kullanici_password_girer(String password) {

        loginPage.password.sendKeys(password);
        log.info("Example");
    }
    @When("kullanici login butonunu tikladiginda")
    public void kullanici_login_butonunu_tikladiginda() {
      loginPage.loginButton.click();
    }
    @Then("kullanici login olabilmelidir")
    public void kullanici_login_olabilmelidir() {
        Assert.assertEquals("https://www.saucedemo.com/inventory.htmssssl",Driver.get().getCurrentUrl());

        log.info("currentUrl",Driver.get().getCurrentUrl());
    }
    @Given("Kullanici {string} username {string} password ile login olur")
    public void kullanici_username_password_ile_login_olur(String userName, String password) {
        loginPage.userName.sendKeys(userName);
        loginPage.password.sendKeys(password);
        loginPage.loginButton.click();
        Assert.assertEquals("https://www.saucedemo.com/inventory.html",Driver.get().getCurrentUrl());
        log.info("ExampleAllLogin");
    }





}
