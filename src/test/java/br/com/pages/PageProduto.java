package br.com.pages;

import br.com.attributes.AttributesProduto;
import br.com.core.Utils;
import org.junit.Assert;

public class PageProduto extends AttributesProduto implements Utils{
	
	public PageProduto compraProduto() throws InterruptedException {
		String tituloProduto = getText(tituloproduto());
		click(botaocomprar());

		try {
			Assert.assertTrue(getText(botaocomprar()).contains("REMOVE"));
			System.out.println("Comprou o produto corretamente!");
		} catch (AssertionError e) {
			System.out.println("Nao comprou o produto corretamente!");
		}

		click(botaocarrinho());

		try {
			Assert.assertTrue(isStringInPage(tituloProduto));
			System.out.println("O produto está no carrinho!");
		} catch (AssertionError e) {
			System.out.println("O produto não está no carrinho!");
		}

		return this;
	}
}
