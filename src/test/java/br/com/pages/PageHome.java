package br.com.pages;

import br.com.attributes.AttributesProduto;
import org.junit.Assert;

import br.com.attributes.AttributesHome;
import br.com.core.Utils;

public class PageHome extends AttributesHome implements Utils{

	private AttributesProduto produtoAttributes;

	public PageHome() {
		this.produtoAttributes = new AttributesProduto();
	}
	
	public PageHome logout() throws InterruptedException {
		click(leftbutton());
		click(logoutbutton());

		try {
	        Assert.assertFalse(isOnScreen(lblproducts(), 5));
	        System.out.println("Deslogou com sucesso!");
	    } catch (AssertionError e) {
	        System.out.println("Deslogou falhou!");
	        throw e;
	    }

		return this;
	}
	
	public PageHome abreProduto() throws InterruptedException {
		String titleProduto = getText(produto());
		click(produto());

		try {
			Assert.assertTrue(getText(produtoAttributes.tituloproduto()).contains(titleProduto));
			System.out.println("Abriu o produto corretamente!");
		} catch (AssertionError e) {
			System.out.println("Não abriu o produto corretamente!");
		}

		return this;
	}
}
