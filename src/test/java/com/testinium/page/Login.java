package com.testinium.page;

import com.testinium.method.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Login {
    Methods methods;

    public Login() {
        methods = new Methods();
    }

  //  public void login() {
//        methods.click(By.xpath("//div[@class='menu-top-button login']"));
//        methods.waitBySec(3);
//        methods.sendKeys(By.id("login-email"), "celiksezin6@gmail.com");
//        methods.waitBySec(3);
//        methods.sendKeys(By.xpath("//input[@id='login-password']"), "Sezin..123");
//        methods.waitBySec(3);
//        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
//        methods.waitBySec(3);
//        Assert.assertTrue(methods.isElementVisible(By.xpath("//a[@href='https://www.kitapyurdu.com/index.php?route=account/account']/b")));
//        System.out.println("ben locator u buldum");
//        methods.waitBySec(3);
    }

