package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.Login;
import com.testinium.page.Product;
import org.junit.Test;

public class AllTest extends BaseTest {

    @Test
    public void productTest() {
        Product product = new Product();
        product.ScrollAndSelect();


    }
}
