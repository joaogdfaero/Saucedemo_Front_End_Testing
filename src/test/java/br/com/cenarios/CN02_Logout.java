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


public class CN02_Logout{

    private static ExtentReports extent;
    
    
    @BeforeClass
    public static void setUp() {
        extent = new ExtentReports();
        ReportGenerator.createReport("CN02 - Logout");
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
	
	
	/*Faz o logout na plataforma*/
	
	@Test
	public void CT01() throws Exception{
		ReportGenerator.startTest("CT01 - Faz logout na plataforma");
		
		System.out.println("CT01 Started - Faz logout na plataforma");
		new PageLogin().login();
		new PageHome().logout();
	}	
}
