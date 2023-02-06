package stepDefinitions;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.pageDashboard;
import objectRepository.pageLogin;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.fileHandling;

public class login extends env {
    pageLogin elementLogin = new pageLogin();
    pageDashboard elementDashboard = new pageDashboard();
    fileHandling fileHandling = new fileHandling();


    String dataUsername = "resources/file/Username.txt";
    String dataPassword = "resources/file/Password.txt";

    @Given("user is on Login page")
    public void user_is_on_login_page() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementLogin.getBtnLogin())
        );
    }
    @When("user input Username Admin")
    public void user_input_username_admin() {
        WebElement inputUsername = driver.findElement(elementLogin.getFieldUsername());
        inputUsername.isDisplayed();
        String username = "Admin";
        inputUsername.sendKeys(username);
    }
    @And("user input Password Admin")
    public void user_input_password_admin() {
        WebElement inputPassword = driver.findElement(elementLogin.getFieldPassword());
        inputPassword.isDisplayed();
//        String password = "s3Kol4HQA!*";
        String password = "admin123";
        inputPassword.sendKeys(password);
    }
    @And("user click button Login")
    public void user_click_button_login() {
        WebElement btnLogin = driver.findElement(elementLogin.getBtnLogin());
        btnLogin.sendKeys(Keys.ENTER);
    }
    @Then("user navigated to Dashboard page")
    public void user_navigated_to_dashboard_page() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementDashboard.getPanelDashboard())
        );
        WebElement panelDashboard = driver.findElement(elementDashboard.getPanelDashboard());
        Assert.assertEquals(true, panelDashboard.isDisplayed());
    }


    @When("user input Wrong Username Admin")
    public void user_input_wrong_username_admin() {
        WebElement inputUsername = driver.findElement(elementLogin.getFieldUsername());
        inputUsername.isDisplayed();
        String username = "Admin123";
        inputUsername.sendKeys(username);
    }
    @And("user input Wrong Password Admin")
    public void user_input_wrong_password_admin() {
        WebElement inputPassword = driver.findElement(elementLogin.getFieldPassword());
        inputPassword.isDisplayed();
        String password = "Admin123";
        inputPassword.sendKeys(password);
    }
    @Then("user see Invalid credentials message")
    public void user_see_invalid_credentials_message() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementLogin.getMsgInvalidCredential())
        );

        WebElement errorInvCredential = driver.findElement(elementLogin.getMsgInvalidCredential());
        Assert.assertEquals(true, errorInvCredential.isDisplayed());
    }


    @Then("user see Required message on Mandatory field")
    public void user_see_required_message_on_mandatory_field() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementLogin.getMsgRequiredUname())
        );

        WebElement errorReqUname = driver.findElement(elementLogin.getMsgRequiredUname());
        WebElement errorReqPass = driver.findElement(elementLogin.getMsgRequiredPass());
        Assert.assertEquals(true, errorReqUname.isDisplayed());
        Assert.assertEquals(true, errorReqPass.isDisplayed());
    }


    @Then("user see Required message on field Username")
    public void user_see_required_message_on_field_username() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementLogin.getMsgRequiredUname())
        );
        WebElement errorReqUname = driver.findElement(elementLogin.getMsgRequiredUname());
        Assert.assertEquals(true, errorReqUname.isDisplayed());
    }


    @Then("user see Required message on field Password")
    public void user_see_required_message_on_field_password() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementLogin.getMsgRequiredPass())
        );
        WebElement errorReqPass = driver.findElement(elementLogin.getMsgRequiredPass());
        Assert.assertEquals(true, errorReqPass.isDisplayed());
    }


    @When("user input Username User")
    public void user_input_username_user() {
        WebElement inputUsername = driver.findElement(elementLogin.getFieldUsername());
        inputUsername.isDisplayed();
        String username = fileHandling.readFromFile(dataUsername);
        inputUsername.sendKeys(username);
    }
    @And("user input Password User")
    public void user_input_password_user() {
        WebElement inputPassword = driver.findElement(elementLogin.getFieldPassword());
        inputPassword.isDisplayed();
        String password = fileHandling.readFromFile(dataPassword);
        inputPassword.sendKeys(password);
    }


    @When("user click dropdown Menu")
    public void user_click_dropdown_menu() {
        wait.until(
                ExpectedConditions.elementToBeClickable(elementDashboard.getDropdownMenu())
        );
        driver.findElement(elementDashboard.getDropdownMenu()).click();
    }
    @And("user click button Logout")
    public void user_click_button_logout() {
        wait.until(
                ExpectedConditions.elementToBeClickable(elementDashboard.getBtnLogout())
        );
        driver.findElement(elementDashboard.getBtnLogout()).click();
    }
    @Then("user navigated to Login page")
    public void user_navigated_to_login_page() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementLogin.getBtnLogin())
        );
        WebElement btnLogin = driver.findElement(elementLogin.getBtnLogin());
        Assert.assertEquals(true, btnLogin.isDisplayed());
    }


    @When("user input Username User Disabled")
    public void user_input_username_user_disabled() {
        WebElement inputUsernameDis = driver.findElement(elementLogin.getFieldUsername());
        inputUsernameDis.isDisplayed();
        String usernameDis = "disabledacc123";
        inputUsernameDis.sendKeys(usernameDis);
    }
    @And("user input Password User Disabled")
    public void user_input_password_user_disabled() {
        WebElement inputPasswordDis = driver.findElement(elementLogin.getFieldPassword());
        inputPasswordDis.isDisplayed();
        String passwordDis = "Disa123@";
        inputPasswordDis.sendKeys(passwordDis);
    }
    @Then("user see Account Disable message")
    public void user_see_account_disable_message() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementLogin.getMsgAccDisable())
        );
        WebElement errorAccDis = driver.findElement(elementLogin.getMsgAccDisable());
        Assert.assertEquals(true, errorAccDis.isDisplayed());
    }
}