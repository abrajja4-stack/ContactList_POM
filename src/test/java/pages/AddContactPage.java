package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class AddContactPage {


    public AddContactPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //find all webElement from this pages
    @FindBy(id = "add-contact")
    private WebElement addcontact;

    @FindBy(id = "firstName")
    private WebElement firstName;

    @FindBy(id = "lastName")
    private WebElement lastName;

    @FindBy(id = "birthdate")
    private WebElement birthdate;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "phone")
    private WebElement phone;

    @FindBy(id = "street1")
    private WebElement street1;

    @FindBy(id = "street2")
    private WebElement street2;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "stateProvince")
    private WebElement stateProvince;

    @FindBy(id = "postalCode")
    private WebElement postalCode;

    @FindBy(id = "country")
    private WebElement country;

    @FindBy(id = "submit")
    private WebElement submit;

    //add contint with parameter
    public boolean AddContint(String firstName, String lastName, String birthdate,
                           String email, String phone, String street1,
                           String street2, String city, String stateProvince,
                           String postalCode, String country) {
        try {

            this.addcontact.click();
            //wit until loding
            Thread.sleep(200);
            this.firstName.sendKeys(firstName);
            this.lastName.sendKeys(lastName);
            this.birthdate.sendKeys(birthdate);
            this.email.sendKeys(email);
            this.phone.sendKeys(phone);
            this.street1.sendKeys(street1);
            this.street2.sendKeys(street2);
            this.city.sendKeys(city);
            this.stateProvince.sendKeys(stateProvince);
            this.postalCode.sendKeys(postalCode);
            this.country.sendKeys(country);
            this.submit.click();
            //wit until loding
            Thread.sleep(200);
            return true;
        } catch (Exception e) {
            return false;
        }
    }






}
