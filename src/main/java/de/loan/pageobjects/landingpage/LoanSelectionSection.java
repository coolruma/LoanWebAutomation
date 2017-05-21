package de.loan.pageobjects.landingpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import de.loan.pageobjects.Page;
import de.loan.pageobjects.registrationpage.CreditStep;


/**
 * Encapsulates services offered loan selection section 
 *
 */
public class LoanSelectionSection extends Page {

    private WebDriver webDriver;

    public LoanSelectionSection(WebDriver webDriver) {
        super(webDriver);
        this.webDriver = webDriver;
        System.out.println("Title="+webDriver.getTitle());
        if (!webDriver.getTitle().equals(
                    "SMAVA - Das Online-Vergleichsportal für Kredite | SMAVA")) {
            throw new IllegalStateException("This is not Smava landing page");
        }
    }

    public LoanSelectionSection selectCreditAmount(String creditAmount) {

    	WebElement dropDown1 = webDriver.findElement(By.id("myselect"));
    	dropDown1.click();
    	WebElement dropDown = webDriver.findElement(By.xpath(".//*[@id='myselect']/div/div[2]/div[10]"));
    	dropDown.click();
    	//WebElement dropDown = webDriver.findElement(By.id("lsAmount"));
    	
    	/*System.out.println("Does Element Exists="+dropDown.isDisplayed());
        Select sel = new Select(dropDown);
        List<WebElement> selectionList= sel.getAllSelectedOptions();
        for(WebElement element:selectionList){
        	System.out.println("DropDown List Value="+element.getText());
        }
        sel.selectByVisibleText(creditAmount);*/
        //sel.selectByValue(creditAmount);
        //sel.selectByIndex(5);

    	
//        new Select(getElement(By.id("lsAmount"))).selectByVisibleText(
//            creditAmount);

        return this;
    }

    public LoanSelectionSection selectDuration(String duration) {
//        new Select(getElement(By.id("lsDuration"))).selectByVisibleText(
//            duration);
    	
    	WebElement dropDown1 = webDriver.findElement(By.id("myselect2"));
    	dropDown1.click();
    	WebElement dropDown = webDriver.findElement(By.xpath(".//*[@id='myselect2']/div/div[2]/div[2]"));
    	dropDown.click();
    	
        return this;
    }

    public LoanSelectionSection selectPurpose(String purpose) {
//        new Select(getElement(By.id("lsCategory"))).selectByVisibleText(
//            purpose);
    	
    	WebElement dropDown1 = webDriver.findElement(By.id("myselect3"));
    	dropDown1.click();
    	WebElement dropDown = webDriver.findElement(By.xpath(".//*[@id='myselect3']/div/div[2]/div[2]"));
    	dropDown.click();
        return this;
    }

    public CreditStep clickContinue() {
        waitForElementVisibility(By.cssSelector("a[id ^= 'forwardButton']"))
            .click();
        return new CreditStep(webDriver);
    }

}
