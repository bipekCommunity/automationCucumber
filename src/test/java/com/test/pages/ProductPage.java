package com.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage{

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement backPack;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement basketIcon;

    @FindBy(xpath = "//button")
    public List<WebElement> cartButtons;

    @FindBy(id="continue-shopping")
    public WebElement contShop;
}
