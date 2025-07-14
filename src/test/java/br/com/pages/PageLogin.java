package br.com.pages;

import org.junit.Assert;

import br.com.attributes.AttributesLogin;
import br.com.attributes.AttributesHome;
import br.com.core.Utils;

public class PageLogin extends AttributesLogin implements Utils{
	
	private AttributesHome homeAttributes;

    public PageLogin() {
        this.homeAttributes = new AttributesHome();
    }
	
	public PageLogin login() throws InterruptedException {
		navigateTo("https://www.saucedemo.com/v1/index.html");
		setText(user(),"standard_user");
		setText(password(),"secret_sauce");	
		click(entrar());
		
		try {
	        Assert.assertTrue(isOnScreen(homeAttributes.lblproducts(), 5));
	        System.out.println("Login com sucesso!");
	    } catch (AssertionError e) {
	        System.out.println("Login falhou!");
	        throw e;
	    }

		return this;
	}
}
