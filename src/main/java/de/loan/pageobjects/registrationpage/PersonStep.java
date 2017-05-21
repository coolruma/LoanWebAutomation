package de.loan.pageobjects.registrationpage;

import de.loan.dataobjects.Gender;
import de.loan.dataobjects.User;
import de.loan.pageobjects.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * Represents services offered by Person step
 *
 */
public class PersonStep extends Page {
    private WebDriver webDriver;

    public PersonStep(WebDriver webDriver) {
        super(webDriver);
        this.webDriver = webDriver;

        if (!webDriver.getTitle().equalsIgnoreCase(
                        "Kredit beantragen | Kreditantrag in 4 Schritten | SMAVA")) {
            throw new IllegalStateException("This is not Person step");
        }
    }

    public PersonStep selectGender(Gender gender) {

        if (gender.equals(Gender.Male)) {
            getElement(By.cssSelector("salutation-MR")).click();
        } else {
            getElement(By.cssSelector("salutation-MRS")).click();
        }

        return this;

    }

    public PersonStep enterFirstName(String firstName) {
        getElement(By.id("firstname")).sendKeys(firstName);

        return this;
    }

    public PersonStep enterLastName(String lastName) {
        getElement(By.id("lastname")).sendKeys(lastName);

        return this;
    }

    public PersonStep enterDOBDay(String day) {
        getElement(By.id("birthDay")).sendKeys(day);

        return this;
    }

    public PersonStep enterDOBMonth(String month) {
        getElement(By.id("birthMonth")).sendKeys(month);

        return this;
    }

    public PersonStep enterDOBYear(String year) {
        getElement(By.id("birthYear")).sendKeys(year);

        return this;
    }

    public PersonStep enterLandLineExtn(String landLineExtn) {
        getElement(By.id("phoneCode")).sendKeys(landLineExtn);

        return this;
    }

    public PersonStep enterLandLineNumber(String landLineNumber) {
        getElement(By.id("phoneNumber")).sendKeys(landLineNumber);

        return this;
    }

    public PersonStep enterMobileExtn(String mobileExtn) {
        getElement(By.id("mobileCode")).sendKeys(mobileExtn);

        return this;
    }

    public PersonStep enterMobileNumber(String mobileNumber) {
        getElement(By.id("mobileNumber")).sendKeys(mobileNumber);

        return this;
    }

    public PersonStep enterEmailAddress(String email) {
        getElement(By.id("email")).sendKeys(email);

        return this;
    }

    public PersonStep checkSchufaAgreement() {
        getElement(By.id("schufaAgreement")).click();

        return this;
    }

    public PersonStep checkNewsletterSubscription() {
        getElement(By.id("newsletterSubscription")).click();

        return this;
    }

    public Page continueToIncomeStep() {
        getElement(By.cssSelector("a[href='#Address2']")).click();

        return new Page(webDriver);

    }

    public Page submitUserDetails(User user) {
        return selectGender(user.getGender())
                .enterFirstName(user.getFirstName())
                .enterLastName(user.getLastName())
                .enterDOBDay(user.getDateOfBirthDate())
                .enterDOBMonth(user.getDateOfBirthMonth())
                .enterDOBYear(user.getDateOfBirthYear())
                .enterLandLineExtn(user.getLandLineExtn())
                .enterLandLineNumber(user.getLandLineNumber())
                .enterMobileExtn(user.getMobileExtn())
                .enterMobileNumber(user.getMobileNumber())
                .enterEmailAddress(user.getEmailAddress())
                .checkSchufaAgreement()
                .checkNewsletterSubscription()
                .continueToIncomeStep();

    }
}
