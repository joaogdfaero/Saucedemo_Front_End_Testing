package br.com.cenarios;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.aventstack.extentreports.ExtentReports;
import br.com.core.DriverFactory;
import br.com.core.ReportGenerator;

import br.com.pages.PageLogin;
import br.com.pages.PageHome;
import br.com.pages.PageProduto;

public class CN03_AdicionarProdutoAoCarrinho{

    private static ExtentReports extent;

    @BeforeClass
    public static void setUp() {
        extent = new ExtentReports();
        ReportGenerator.createReport("CN03 - Adicionar Produto Ao Carrinho");
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

	/*Adiciona produto ao carrinho*/
	
	@Test
	public void CT01() throws Exception{
		ReportGenerator.startTest("CT01 - Adiciona produto ao carrinho");
		
		System.out.println("CT01 Started - Adiciona produto ao carrinho");
		PageLogin pageLogin = new PageLogin();
		PageHome pageHome = new PageHome();
		PageProduto pageProduto = new PageProduto();
		
		pageLogin.login();
		pageHome.abreProduto();
		pageProduto.compraProduto();
		pageHome.logout();
	}	
}
