package pages;

import org.openqa.selenium.By;

public class Locators {

    public static final By lLoginLink = By.xpath("//div[@class='shop-menu pull-right']//a[text()=' Signup / Login']");
    public static final By lLogoutLink = By.xpath("//div[@class='shop-menu pull-right']//a[text()=' Logout']");
    public static final By lLoginFormEMail = By.xpath("//div[@class='login-form']//input[@name='email']");
    public static final By lSignupFormEMail = By.xpath("//div[@class='signup-form']//input[@name='email']");
    public static final By lSignupFormName = By.xpath("//div[@class='signup-form']//input[@name='name']");
    public static final By lLoginFormPassword = By.xpath("//div[@class='login-form']//input[@name='password']");
    public static final By lLoginFormLoginButton = By.xpath("//div[@class='login-form']//button[text()='Login']");
    public static final By lSignupFormSignupButton = By.xpath("//div[@class='signup-form']//button");
    public static final By lEnterAccountInformationText = By.xpath("//h2[.='Enter Account Information']");
    public static final By lSignupFormTitleButton = By.xpath("//div[@class='login-form']//input[@name='title']");
    public static final By lSignupFormPassword = By.xpath("//div[@class='login-form']//input[@name='password']");
    public static final By lSignupFormDays = By.xpath("//div[@class='login-form']//select[@name='days']");
    public static final By lSignupFormMonths = By.xpath("//div[@class='login-form']//select[@name='months']");
    public static final By lSignupFormYears = By.xpath("//div[@class='login-form']//select[@name='years']");
    public static final String SIGNUP_FORM = "//div[@class='login-form']//p[.//label[contains(.,'%s')]]//input";
    public static final By lSignupFormCreatAccount = By.xpath("//div[@class='login-form']//button");
    public static final By lSignupFormCountry = By.xpath("//div[@class='login-form']//select[@name='country']");
    public static final By lAccountCreatedText = By.xpath("//h2[.='Account Created!']");

    public static final By lSignupFormContinueButton = By.xpath("//a[.='Continue']");
    public static final By lTopMenuLoginAsUsername = By.xpath("//li[contains(., ' Logged in as ')]");
    public static final By lTopMenuDelete = By.xpath("//li[contains(., ' Delete Account')]//a");
    public static final By lAccountDeletedText = By.xpath("//h2[.='Account Deleted!']");


}
