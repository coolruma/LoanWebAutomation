package de.loan.dataobjects;

/**
 * Date object for user registration
 *
 */
public class User {

    private Gender gender;
    private String firstName;
    private String lastName;
    private String dateOfBirthDate;
    private String dateOfBirthMonth;
    private String dateOfBirthYear;
    private String landLineExtn;
    private String landLineNumber;
    private String mobileExtn;
    private String mobileNumber;

    private String emailAddress;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirthDate() {
        return dateOfBirthDate;
    }

    public void setDateOfBirthDate(String dateOfBirthDate) {
        this.dateOfBirthDate = dateOfBirthDate;
    }

    public String getDateOfBirthMonth() {
        return dateOfBirthMonth;
    }

    public void setDateOfBirthMonth(String dateOfBirthMonth) {
        this.dateOfBirthMonth = dateOfBirthMonth;
    }

    public String getDateOfBirthYear() {
        return dateOfBirthYear;
    }

    public void setDateOfBirthYear(String dateOfBirthYear) {
        this.dateOfBirthYear = dateOfBirthYear;
    }

    public String getLandLineExtn() {
        return landLineExtn;
    }

    public void setLandLineExtn(String landLineExtn) {
        this.landLineExtn = landLineExtn;
    }

    public String getLandLineNumber() {
        return landLineNumber;
    }

    public void setLandLineNumber(String landLineNumber) {
        this.landLineNumber = landLineNumber;
    }

    public String getMobileExtn() {
        return mobileExtn;
    }

    public void setMobileExtn(String mobileExtn) {
        this.mobileExtn = mobileExtn;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
