package br.com.cenarios;

import br.com.core.DriverFactory;
import br.com.core.ReportGenerator;
import br.com.pages.PageCarrinho;
import br.com.pages.PageHome;
import br.com.pages.PageLogin;
import br.com.pages.PageProduto;
import com.aventstack.extentreports.ExtentReports;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CN04_RemoverProdutoDoCarrinho {

    private static ExtentReports extent;

    @BeforeClass
    public static void setUp() {
        extent = new ExtentReports();
        ReportGenerator.createReport("CN04 - Remover Produto do Carrinho");
    }

    @AfterClass
    public static void tearDown() {
        extent.flush();
    }

	@After
	public void finaliza(){
		DriverFactory.killDriver();
		ReportGenerator.endTest();
	}

	/*Remover Produto do Carrinho*/
	
	@Test
	public void CT01() throws Exception{
		ReportGenerator.startTest("CT01 - Remover Produto do Carrinho");
		
		System.out.println("CT01 Started - Remover Produto do Carrinho");
		PageLogin pageLogin = new PageLogin();
		PageHome pageHome = new PageHome();
		PageProduto pageProduto = new PageProduto();
		PageCarrinho pageCarrinho = new PageCarrinho();
		
		pageLogin.login();
		pageHome.abreProduto();
		pageProduto.compraProduto();
		pageCarrinho.removerProduto();
		pageHome.logout();
	}	
}
