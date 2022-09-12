package com.restassuredAutomation.base;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeClass;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestBase {

	public static RequestSpecification httpRequest;
	public static Response response;
	public String empID = "1";// hard coded input

	public static final Logger log = LogManager.getLogger(TestBase.class);;

	@BeforeClass
	public void setUp() {
		// Please Use Log4j Dependency (Not Log4j-core & Log4j-api)
		DOMConfigurator.configure(System.getProperty("user.dir")
				+ "\\src\\test\\java\\com\\restassuredAutomation\\utitlities\\Log4j2.xml");
		// PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\test\\java\\com\\restassuredAutomation\\utitlities\\Log4j.properties");
		log.setLevel(Level.DEBUG);
	}
}
