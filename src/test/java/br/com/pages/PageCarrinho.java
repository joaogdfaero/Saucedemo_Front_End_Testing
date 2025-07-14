package br.com.pages;

import br.com.attributes.AttributesCarrinho;
import br.com.attributes.AttributesProduto;
import br.com.core.Utils;
import org.junit.Assert;

public class PageCarrinho extends AttributesCarrinho implements Utils{

    public PageCarrinho removerProduto() throws InterruptedException {
        String nomeproduto = getText(nomeproduto());
        click(botaoremover());

        try {
            Assert.assertFalse(isStringInPage(nomeproduto));
            System.out.println("O produto foi removido do carrinho!");
        } catch (AssertionError e) {
            System.out.println("O produto NÃO foi removido do carrinho!");
        }

        return this;
    }
}
