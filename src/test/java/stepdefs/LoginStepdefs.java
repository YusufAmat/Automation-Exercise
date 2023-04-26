package stepdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utils.Base.BaseTest;

import java.util.Map;

import static pages.Locators.*;

public class LoginStepdefs extends BaseTest {

    @Given("user on {string}")
    public void userOn(String url) {
        driver.get(url);
    }

    @When("user click LoginSign button")
    public void userClickLoginSignButton() {
        click(lLoginLink);
    }

    @And("user login with the following credentials")
    public void userLoginWithTheFollowingCredentials(DataTable table) {
        Map<String, String> map = table.asMap();
        sendKeys(lLoginFormEMail, map.get("username"));
        sendKeys(lLoginFormPassword, map.get("password"));
        click(lLoginFormLoginButton);
    }

    @Then("login should be successfull")
    public void loginShouldBeSuccessfull() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lLogoutLink));
    }

    @And("user enter name and email address and click Signup button")
    public void userEnterNameAndEmailAddressAndClickSignupButton() {
        sendKeys(lSignupFormName, "yusuf" );
        sendKeys(lSignupFormEMail, "yusuf@deneme.com" );
        click(lSignupFormSignupButton);
    }

    @Then("verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lEnterAccountInformationText));
    }

    @And("user fill details: Title, Name, Email, Password, Date of birth and click Create Account button")
    public void userFillDetailsTitleNameEmailPasswordDateOfBirthAndClickCreateAccountButton() {
        click(lSignupFormTitleButton);
        sendKeys(lSignupFormPassword, "123456789");
        selectByVisibleText(lSignupFormDays,"26");
        selectByVisibleText(lSignupFormMonths, "September");
        selectByVisibleText(lSignupFormYears, "1990");
        sendKeys(By.xpath(String.format(SIGNUP_FORM,"First name ")), "deneme");
        sendKeys(By.xpath(String.format(SIGNUP_FORM,"Last name ")), "deneme");
        sendKeys(By.xpath(String.format(SIGNUP_FORM,"Company")), "deneme");
        sendKeys(By.xpath(String.format(SIGNUP_FORM,"Address ")), "deneme");
        sendKeys(By.xpath(String.format(SIGNUP_FORM,"Address 2")), "deneme");
        selectByVisibleText(lSignupFormCountry,"United States");
        sendKeys(By.xpath(String.format(SIGNUP_FORM,"State ")), "deneme");
        sendKeys(By.xpath(String.format(SIGNUP_FORM,"City ")), "deneme");
        sendKeys(By.xpath(String.format(SIGNUP_FORM,"Zipcode ")), "123456");
        sendKeys(By.xpath(String.format(SIGNUP_FORM,"Mobile Number ")), "0123456789");
        click(lSignupFormCreatAccount);

    }

    @Then("verify that ACCOUNT CREATED! is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lAccountCreatedText));
    }

    @And("user click Continue button")
    public void userClickContinueButton() {
        click(lSignupFormContinueButton);

    }

    @Then("verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lTopMenuLoginAsUsername));
    }

    @And("user click Delete Account button")
    public void userClickDeleteAccountButton() {
        click(lTopMenuDelete);
    }

    @Then("verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lAccountDeletedText));
    }
}
