package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

//find all webElement from this pages
  @FindBy(id = "signup")
  private WebElement signup;

    @FindBy(id = "firstName")
    private WebElement firstName;

    @FindBy(id = "lastName")
    private WebElement lastName;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;


    @FindBy(id = "submit")
    private WebElement submit;

   @FindBy(id = "logout")
    private WebElement logout;


//method for singup user it rutern true if added and false if not
  public boolean  AddUser(String firstname, String lastname, String email , String password){
      try {
      this.signup.click();
          //wit until loding
         Thread.sleep(200);
      this.firstName.sendKeys(firstname);
      this.lastName.sendKeys(lastname);
      this.email.sendKeys(email);
      this.password.sendKeys(password);
      this.submit.click();
          //wit until loding
          Thread.sleep(200);
          this.logout.click();
      return true;
  } catch (Exception e) {
          return false;
      }
}

    //this method to login it rutern true if login and false if not
  public boolean loginuser(String email,String password) {
      try {
      this.email.sendKeys(email);
      this.password.sendKeys(password);
      this.submit.click();
          //wit until loding
          Thread.sleep(200);
          return true;
      } catch (Exception e) {
          return false;
      }

  }

}
