package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class ContactListPage {

    public ContactListPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//tr[@class=\"contactTableBodyRow\"]") //to skip the header
    private List<WebElement> contactRows;


    public int getContactListSize() {
        try {//wit until loding
            Thread.sleep(200);
            return contactRows.size();
        } catch (Exception e) {
            return 0;
        }
    }


    public List<String> getAllContactNames() {
        List<String> contactNames = new ArrayList<>();
        try {//wit until loding
            Thread.sleep(200);
            for (WebElement row : contactRows) {
                // Get the first and last name from the first two columns
                List<WebElement> cells = row.findElements(By.tagName("td"));
                if (cells.size() >= 2) {
                    String fullName = cells.get(0).getText() + " " + cells.get(1).getText();
                    contactNames.add(fullName);
                }
            }
        } catch (Exception e) {
            // Return empty list if there's an issue
        }
        return contactNames;


    }}

