package com.test.step_def;

import com.test.pages.ProductPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Product_stepdef {
ProductPage productPage=new ProductPage();

    @Given("Kullanici cantayi sepete ekler")
    public void kullanici_cantayi_sepete_ekler() {
      productPage.backPack.click();

    }

    @Given("Kullanici basket iconu tiklar")
    public void kullanici_basket_iconu_tiklar() {
        productPage.basketIcon.click();


    }

    @When("kullanici urunu kaldırır")
    public void kullanici_urunu_kaldırır() throws InterruptedException {
        Thread.sleep(3000);
        for (WebElement e: productPage.cartButtons) {
            if(e.getText().equals("REMOVE")){
                e.click();
                System.out.println("clickedRemove");
            }
        }
    }

    @When("kullanici ana sayfaya gider")
    public void kullanici_ana_sayfaya_gider()  {
      productPage.contShop.click();

    }

    @Then("urunun kaldirildigini gorur")
    public void urunun_kaldirildigini_gorur() {
        System.out.println("productPage.backPack.getText() = " + productPage.backPack.getText());
        Assert.assertTrue(productPage.backPack.getText().contains("ADD TO CART"));

    }

    }
