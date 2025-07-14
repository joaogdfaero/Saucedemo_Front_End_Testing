package br.com.attributes;

import org.openqa.selenium.By;

public class AttributesProduto {
    protected By botaocomprar() {
    	return By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button");
    }

    protected By botaocarrinho() {
        return By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");
    }

    public By tituloproduto() {
        return By.className("inventory_details_name");
    }
}