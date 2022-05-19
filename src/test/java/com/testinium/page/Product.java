package com.testinium.page;

import com.testinium.method.Methods;
import org.apache.logging.log4j.LogManager;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.Random;
import java.util.logging.Logger;

public class Product {

    Methods methods;

    public Product() {

        methods = new Methods();
    }

    public void ScrollAndSelect() {
        //Login olunur
        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySec(3);
        methods.sendKeys(By.id("login-email"), "celiksezin6@gmail.com");
        methods.waitBySec(3);
        methods.sendKeys(By.xpath("//input[@id='login-password']"), "Sezin..123");
        methods.waitBySec(3);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySec(3);
        //Sayfa login olması kontrol edilir
        Assert.assertTrue(methods.isElementVisible(By.xpath("//a[@href='https://www.kitapyurdu.com/index.php?route=account/account']/b")));
        System.out.println("ben locator u buldum");
        methods.waitBySec(3);
        // Oyuncak ürünü aratılır ve search butonuna tıklanır
        methods.sendKeys(By.cssSelector("#search-input"), "oyuncak");
        methods.waitBySec(3);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySec(2);
        //Sayfada yer alan 7.ürüne scroll edilir ve 4 ürün favorilere eklenir
        for (int i = 7; i < 11; i++) {
            methods.scrollWithAction(By.xpath("//div[@id='product-table']/div[" + i + "]"));
            methods.click(By.xpath("//div[@id='product-table']/div[" + i + "]/div[2]/div[3]/a[4]"));
            methods.waitBySec(3);
        }
        //Anasayfaya gidilir
        methods.scrollWithAction(By.xpath("//div[@class='breadcrumb']/a"));
        methods.waitBySec(3);
        methods.click(By.xpath("//div[@class='breadcrumb']/a"));
        methods.waitBySec(2);
        //Puan kataloguna gidilir
        methods.click(By.xpath("//div[@class='lvl1catalog']"));
        methods.waitBySec(2);
        //Puan Kataloğundaki türk klasikleri tıklanır
        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySec(2);
        //Açılan sayfada filtreleme alanından “Yüksek Oylama” seçimi yapılır
        methods.selectByText(By.xpath("//select[@onchange='location = this.value;']"), "Yüksek Oylama");
        methods.waitBySec(2);
        //Tüm kitaplar>Hobi tıklanır
        methods.click(By.xpath("//div[@class='lvl2 js-bookCr']/ul/li[3]" + "/span[@class='mn-strong common-sprite']"));
        methods.waitBySec(2);
        methods.click(By.xpath("//a[@href='kategori/kitap-hobi/1_212.html']"));
        methods.waitBySec(2);
        // random ürün ekleme
        Random s = new Random();
        int a = s.nextInt(6);
        while (true) {
            if (a != 0) break;
            a = s.nextInt(6);
        }
        System.out.println("//ul[@class='product-grid jcarousel-skin-opencart']/li[" + a + "]");
        methods.click(By.xpath(
                "//ul[@class='product-grid jcarousel-skin-opencart']/li[" + a + "]"));
        methods.waitBySec(3);
        methods.click(By.id("button-cart"));
        methods.waitBySec(3);
            //Listelerim>Favorilerim tıklanır
            methods.click(By.cssSelector(".menu.top.my-list"));
            methods.waitBySec(2);
            methods.click(By.xpath("//a[@href='https://www.kitapyurdu.com/index.php?route=account/favorite&selected_tags=0']"));
            methods.waitBySec(2);
            methods.click(By.xpath("//div[@class='product-cr']/div[2]/div[3]/a[@data-title='Favorilerimden Sil']"));
            methods.waitBySec(2);
            //Favorilerdeki 3.ürünün silinmesi
            methods.click(By.xpath("//span[@id='cart-items']"));
            methods.waitBySec(2);
            //Sepete gitmek
            methods.click(By.xpath("//div[@id='cart']"));
            methods.waitBySec(2);


        }


    }






