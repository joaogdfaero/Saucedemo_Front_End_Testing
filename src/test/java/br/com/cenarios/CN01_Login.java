package br.com.cenarios;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.aventstack.extentreports.ExtentReports;
import br.com.core.DriverFactory;
import br.com.core.ReportGenerator;

import br.com.pages.PageLogin;

public class CN01_Login{

    private static ExtentReports extent;
    
    
    @BeforeClass
    public static void setUp() {
        extent = new ExtentReports();
        ReportGenerator.createReport("CN01 - Login");
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
	
	
	/*Faz o login na plataforma*/
	
	@Test
	public void CT01() throws Exception{
		ReportGenerator.startTest("CT01 - Faz login na plataforma");
		
		System.out.println("CT01 Started - Faz login na plataforma");
		new PageLogin().login();
	}	
}
