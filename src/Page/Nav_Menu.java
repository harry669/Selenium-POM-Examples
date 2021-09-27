package Page;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Nav_Menu {
	
	
	 WebDriver driver;
	
	//define WebWerk Menu here
	 
	 public Nav_Menu(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 
	 public List<WebElement> get_menu()
	 {
		 //get all webwerk menu here
		    List<WebElement> menu_list = driver.findElements(By.xpath("//li[@data-element-type='we-mega-menu-li']//span[@class='we-megamenu-nolink']"));
		 // WebElement menu1= driver.findElement(By.xpath("//ul[@data-region='header']//li[@class='primary-menu-level-0 parent-item-2 accordion-content-wrapper']"));
		    
		    return menu_list;
	 }
	 
	 
	 public void PerformHover(WebElement menu)
	 { 
		 //Perform Hover On Menu
		 System.out.println(menu.getText());
		 Actions hoverAction = new Actions(driver);
		 hoverAction.moveToElement(menu);
		 hoverAction.click().build().perform();
	 }
}
