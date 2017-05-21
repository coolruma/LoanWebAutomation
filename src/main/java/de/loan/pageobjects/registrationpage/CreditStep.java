package de.loan.pageobjects.registrationpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import de.loan.pageobjects.Page;


/**
 * Page object for Credit Step of registration process
 *
 */
public class CreditStep extends Page {

    private WebDriver webDriver;

    public CreditStep(WebDriver webDriver) {
        super(webDriver);
        this.webDriver = webDriver;

        if (!webDriver.getTitle().equals(
                    "Kredit beantragen | Kreditantrag in 4 Schritten | SMAVA")) {
            throw new IllegalStateException("This is not Result page");
        }
    }

    public String getCreditAmount() {
        return getElement(By.cssSelector(".amount-column>.value")).getText();
    }

    public String getDuration() {
        return getElement(By.cssSelector(".amount-column+li>.value")).getText();
    }

    public String getPurpose() {
        return getElement(By.cssSelector(".amount-column+li+li>.value"))
            .getText();
    }

    public PersonStep continueToPersonStep() {
        getElement(By.cssSelector("a[href='#ContactInfo']")).click();
        return new PersonStep(webDriver);
    }
}
