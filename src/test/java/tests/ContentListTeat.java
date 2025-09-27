package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddContactPage;
import pages.ContactListPage;
import pages.LoginPage;
import utilities.ConfigRead;
import utilities.Driver;

import java.util.List;

public class ContentListTeat {


    @Test
    public void ContentListTest() {
    //
        LoginPage loginPage = new LoginPage();
        AddContactPage addContactPage =new AddContactPage();
        ContactListPage contactListPage=new ContactListPage();

        Driver.getDriver().get(ConfigRead.getProperty("cl_url"));

     //add new user it rutern true if added and fols if not
     boolean registrationSuccess = loginPage.AddUser(
           ConfigRead.getProperty("firstname"),
           ConfigRead.getProperty("lastname"),
           ConfigRead.getProperty("email"),
           ConfigRead.getProperty("password"));


        // Verify successful user added
        Assert.assertTrue(registrationSuccess,"register is fild!");

        //agine login from same accunt
        boolean loginSuccess =  loginPage.loginuser(
                ConfigRead.getProperty("email"),
                ConfigRead.getProperty("password"));

        // Verify successful login
        Assert.assertTrue(loginSuccess, "User login failed!");

       //add contnt with AddContint method the parameter   from properti file
        addContactPage.AddContint(ConfigRead.getProperty("firstname_1"),
                ConfigRead.getProperty("lastname_1"),
                ConfigRead.getProperty("dob_1"),
                ConfigRead.getProperty("email_1"),
                ConfigRead.getProperty("phone_1"),
                ConfigRead.getProperty("address1_1"),
                ConfigRead.getProperty("address2_1"),
                ConfigRead.getProperty("city_1"),
                ConfigRead.getProperty("state_1"),
                ConfigRead.getProperty("postal_1"),
                ConfigRead.getProperty("country_1"));

        addContactPage.AddContint(ConfigRead.getProperty("firstname_2"),
                ConfigRead.getProperty("lastname_2"),
                ConfigRead.getProperty("dob_2"),
                ConfigRead.getProperty("email_2"),
                ConfigRead.getProperty("phone_2"),
                ConfigRead.getProperty("address1_2"),
                ConfigRead.getProperty("address2_2"),
                ConfigRead.getProperty("city_2"),
                ConfigRead.getProperty("state_2"),
                ConfigRead.getProperty("postal_2"),
                ConfigRead.getProperty("country_2"));

        addContactPage.AddContint(ConfigRead.getProperty("firstname_3"),
                ConfigRead.getProperty("lastname_3"),
                ConfigRead.getProperty("dob_3"),
                ConfigRead.getProperty("email_3"),
                ConfigRead.getProperty("phone_3"),
                ConfigRead.getProperty("address1_3"),
                ConfigRead.getProperty("address2_3"),
                ConfigRead.getProperty("city_3"),
                ConfigRead.getProperty("state_3"),
                ConfigRead.getProperty("postal_3"),
                ConfigRead.getProperty("country_3"));

        addContactPage.AddContint(ConfigRead.getProperty("firstname_4"),
                ConfigRead.getProperty("lastname_4"),
                ConfigRead.getProperty("dob_4"),
                ConfigRead.getProperty("email_4"),
                ConfigRead.getProperty("phone_4"),
                ConfigRead.getProperty("address1_4"),
                ConfigRead.getProperty("address2_4"),
                ConfigRead.getProperty("city_4"),
                ConfigRead.getProperty("state_4"),
                ConfigRead.getProperty("postal_4"),
                ConfigRead.getProperty("country_4"));

        addContactPage.AddContint(ConfigRead.getProperty("firstname_5"),
                ConfigRead.getProperty("lastname_5"),
                ConfigRead.getProperty("dob_5"),
                ConfigRead.getProperty("email_5"),
                ConfigRead.getProperty("phone_5"),
                ConfigRead.getProperty("address1_5"),
                ConfigRead.getProperty("address2_5"),
                ConfigRead.getProperty("city_5"),
                ConfigRead.getProperty("state_5"),
                ConfigRead.getProperty("postal_5"),
                ConfigRead.getProperty("country_5"));

       // Verify total contact count equals 5
        int actualContactCount = contactListPage.getContactListSize();
        Assert.assertEquals(actualContactCount, 5);

        // Additional verification: Check all contact names
        List<String> contactNames = contactListPage.getAllContactNames();
        System.out.println("✓ All contacts displayed:");
        for (String name : contactNames) {
            System.out.println("  - " + name);
        }


      Driver.closeDriver();
    }
}
