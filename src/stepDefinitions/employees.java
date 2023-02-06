package stepDefinitions;

import com.github.javafaker.Faker;
import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.pageDashboard;
import objectRepository.pagePIM;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.fileHandling;


public class employees extends env {
    pageDashboard elementDashboard = new pageDashboard();
    pagePIM elementPIM = new pagePIM();
    fileHandling fileHandling = new fileHandling();
    Faker faker = new Faker();

    String dataUsername = "resources/file/Username.txt";
    String dataPassword = "resources/file/Password.txt";

    @When("user click menu PIM")
    public void user_click_menu_pim() {
        driver.findElement(elementDashboard.getMenuPIM()).click();
    }
    @And("user click button Add Employee")
    public void user_click_button_add_employee() {
        driver.findElement(elementPIM.getBtnAddEmployee()).click();
    }
    @And("user input First Name")
    public void user_input_first_name() {
        WebElement inputFirstName = driver.findElement(elementPIM.getFieldFirstName());
        inputFirstName.isDisplayed();
        String firstName = "Acc";
        inputFirstName.sendKeys(firstName);
    }
    @And("user input Middle Name")
    public void user_input_middle_name() {
        WebElement inputMiddleName = driver.findElement(elementPIM.getFieldMiddleName());
        inputMiddleName.isDisplayed();
        String middleName = "Mid";
        inputMiddleName.sendKeys(middleName);
    }
    @And("user input Last Name")
    public void user_input_last_name() {
        WebElement inputLastName = driver.findElement(elementPIM.getFieldLastName());
        inputLastName.isDisplayed();
        String lastName = "Tes" + faker.number().numberBetween(11, 999);
        inputLastName.sendKeys(lastName);
    }
    @And("user click switch Create Login Details")
    public void user_click_switch_create_login_details() {
        driver.findElement(elementPIM.getSwitchCreateLoginDtl()).click();
    }
    @And("user input Username for New Employee")
    public void user_input_username_for_new_employee() {
        wait.until(
                ExpectedConditions.elementToBeClickable(elementPIM.getUsernameNewEmployee())
        );
        WebElement inputNewUsername = driver.findElement(elementPIM.getUsernameNewEmployee());
        inputNewUsername.click();
        String newUsername = "activeacc" + faker.number().numberBetween(11, 999);
        inputNewUsername.sendKeys(newUsername);
        fileHandling.writeToFile(dataUsername, newUsername);
    }
    @And("user input Password for New Employee")
    public void user_input_password_for_new_employee() {
        WebElement inputPasswordNewEmp = driver.findElement(elementPIM.getPasswordNewEmployee());
        inputPasswordNewEmp.click();
        String newPassword = "Anis123@";
        inputPasswordNewEmp.sendKeys(newPassword);
        fileHandling.writeToFile(dataPassword, newPassword);
    }
    @And("user input Confirm Password for New Employee")
    public void user_input_confirm_password_for_new_employee() {
        WebElement inputConfPasswordNewEmp = driver.findElement(elementPIM.getConfirmPswdNewEmployee());
        inputConfPasswordNewEmp.isDisplayed();
        String newConfPassword = "Anis123@";
        inputConfPasswordNewEmp.sendKeys(newConfPassword);
    }
    @And("user click button Save New Employee")
    public void user_click_button_save_new_employee() {
        driver.findElement(elementPIM.getBtnSaveNewEmployee()).click();
    }
    @Then("user navigated to Personal Details page")
    public void user_navigated_to_personal_details_page() {
//        driver.findElement(elementPIM.getNotifSuccessNewEmployee()).isDisplayed();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementPIM.getPersonalDtlPage())
        );
        driver.findElement(elementPIM.getPersonalDtlPage()).isDisplayed();
    }


    @And("user input Username for New Employee Disabled")
    public void user_input_username_for_new_employee_disabled() {
        wait.until(
                ExpectedConditions.elementToBeClickable(elementPIM.getUsernameNewEmployeeDisabled())
        );
        WebElement inputNewUsernameDis = driver.findElement(elementPIM.getUsernameNewEmployeeDisabled());
        inputNewUsernameDis.click();
        String newUsernameDis = "disabledacc123";
        inputNewUsernameDis.sendKeys(newUsernameDis);
    }
    @And("user input Password for New Employee Disabled")
    public void user_input_password_for_new_employee_disabled() {
        WebElement inputPasswordNewEmpDis = driver.findElement(elementPIM.getPasswordNewEmployeeDisabled());
        inputPasswordNewEmpDis.click();
        String newPasswordDis = "Disa123@";
        inputPasswordNewEmpDis.sendKeys(newPasswordDis);
    }
    @And("user input Confirm Password for New Employee Disabled")
    public void user_input_confirm_password_for_new_employee_disabled() {
        WebElement inputConfPasswordNewEmpDis = driver.findElement(elementPIM.getConfirmPswdNewEmployeeDisabled());
        inputConfPasswordNewEmpDis.isDisplayed();
        String newConfPasswordDis = "Disa123@";
        inputConfPasswordNewEmpDis.sendKeys(newConfPasswordDis);
    }
    @And("user click radio button Status into Disabled")
    public void user_click_radio_button_status_into_disabled() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementPIM.getRdbtnDisabled())
        );
        WebElement statusDisabled = driver.findElement(elementPIM.getRdbtnDisabled());
        statusDisabled.isDisplayed();
        statusDisabled.click();
//        Assert.assertEquals(true, rdbtnDisabled.isSelected());
//        Boolean rdnbtnDisabled = statusDisabled.isSelected();
//        Assert.assertTrue(rdnbtnDisabled);
    }


    @Then("user see Required message on Full Name field")
    public void user_see_required_message_on_full_name_field() throws InterruptedException {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementPIM.getMsgRequiredFirstName())
        );
        Thread.sleep(2000);
        WebElement errorReqFirstname = driver.findElement(elementPIM.getMsgRequiredFirstName());
        WebElement errorReqLastName = driver.findElement(elementPIM.getMsgRequiredLastName());
        Assert.assertEquals(true, errorReqFirstname.isDisplayed());
        Assert.assertEquals(true, errorReqLastName.isDisplayed());
    }
}




















