package br.com.attributes;

import org.openqa.selenium.By;

public class AttributesCarrinho {
    protected By botaoremover() {
        return By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/button");
    }

    protected By nomeproduto() {
        return By.xpath("//*[@id=\"item_4_title_link\"]/div");
    }
}