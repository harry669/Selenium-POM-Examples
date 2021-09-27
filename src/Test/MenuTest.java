package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.Nav_Menu;

public class MenuTest {
	
	
	WebDriver driver;
	Nav_Menu obj;
	String driverpath= "C:\\Users\\Prathamesh\\Desktop\\Testing\\chromedriver.exe";

	public MenuTest() {
		// TODO Auto-generated constructor stub
	}
	
	public void Setup(String LoginPath)
	{
		//System Property for Chrome Driver   
	    System.setProperty("webdriver.chrome.driver", driverpath);
	    
	    //set Chrome driver;
	    driver=new ChromeDriver();  
	    
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.manage().window().maximize();
	    
	    driver.get(LoginPath);   
	}
	
	public void Test()
	{
		obj=new Nav_Menu(driver);
		List<WebElement> menus= obj.get_menu();
		obj.PerformHover(menus.get(0));
		 /*
		  * DATACENTERS
            SERVICES
            COMPANY
            INSIGHTS
		  */
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenuTest menu= new MenuTest();
		menu.Setup("https://www.webwerks.in/");
		menu.Test();

	}

}
