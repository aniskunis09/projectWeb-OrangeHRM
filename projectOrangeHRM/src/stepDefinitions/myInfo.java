package stepDefinitions;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import objectRepository.pageMyInfo;
import objectRepository.pagePIM;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.security.Key;
import java.util.List;
import java.util.Random;

public class myInfo extends env {
    pageMyInfo elementMyInfo = new pageMyInfo();
    pagePIM elementPIM = new pagePIM();
    Actions act = new Actions(driver);

    @When("user click menu My Info")
    public void user_click_menu_my_info() {
        driver.findElement(elementMyInfo.getMenuMyInfo()).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementPIM.getPersonalDtlPage())
        );
    }
    @And("user select dropdown Nationality")
    public void user_select_dropdown_nationality() {
//        act.sendKeys(Keys.PAGE_DOWN).build().perform();
//        Thread.sleep(300);
        WebElement dropdownNationality = wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementMyInfo.getDropdownNationality())
        );
        dropdownNationality.click();

        List<WebElement> optNationality = driver.findElements(elementMyInfo.getListDropDown());
        int listAmount = optNationality.size();

        String[] listNationality = new String[listAmount];
        int i = 1;

        for(WebElement optLooping : optNationality) {
//            if (option.getText().equals("Indonesian")) {
//                option.click();
//            }
            String nameNationality = optLooping.getText();
            listNationality[i-1] = nameNationality;
            i++;
        }
        Random rdm = new Random();
        int rdmChoice = rdm.nextInt(listAmount);

        WebElement choosenNationality = driver.findElement(elementMyInfo.getTxtNationality(listNationality[rdmChoice]));
        choosenNationality.click();
    }
    @And("user select dropdown Marital Status")
    public void user_select_dropdown_marital_status() {
        WebElement dropdownMaritalStatus = wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementMyInfo.getDropdownMaritalStatus())
        );
        dropdownMaritalStatus.click();

        List<WebElement> optMaritalStatus = driver.findElements(elementMyInfo.getListDropDown());;
        int listAmount = optMaritalStatus.size();

        String[] listStatus = new String[listAmount];
        int i = 1;

        for(WebElement optLooping : optMaritalStatus) {
//            if (option.getText().equals("Indonesian")) {
//                option.click();
//            }
            String nameMaritalStatus = optLooping.getText();
            listStatus[i-1] = nameMaritalStatus;
            i++;
        }
        Random rdm = new Random();
        int rdmChoice = rdm.nextInt(listAmount);

        WebElement choosenMaritalStatus = driver.findElement(elementMyInfo.getMaritalStatus(listStatus[rdmChoice]));
        choosenMaritalStatus.click();
    }
    @And("user click choosen Gender")
    public void user_click_choosen_gender () {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementMyInfo.getGenderFemale())
        );
        WebElement genderFemale = driver.findElement(elementMyInfo.getGenderFemale());
        genderFemale.isDisplayed();
        genderFemale.click();
//        Assert.assertEquals(true, genderFemale.isSelected());
//        Boolean rdnbtnGender = genderFemale.isSelected();
//        Assert.assertTrue(rdnbtnGender);
    }
    @And("user click button Save Edit Profile")
    public void user_click_button_save_edit_profile() {
        driver.findElement(elementMyInfo.getBtnSaveProfile()).click();
    }


    @And("user clear First Name")
    public void user_clear_first_name() throws InterruptedException {
        wait.until(
                ExpectedConditions.elementToBeClickable(elementPIM.getFieldFirstName())
        );
        Thread.sleep(2000);
        WebElement txtFirstName = driver.findElement(elementPIM.getFieldFirstName());
        txtFirstName.click();
        txtFirstName.sendKeys(Keys.CONTROL+"A");
        txtFirstName.sendKeys(Keys.BACK_SPACE);
    }
    @And("user clear Last Name")
    public void user_clear_last_name() throws InterruptedException {
        wait.until(
                ExpectedConditions.elementToBeClickable(elementPIM.getFieldLastName())
        );
        Thread.sleep(2000);
        WebElement txtFirstName = driver.findElement(elementPIM.getFieldLastName());
        txtFirstName.click();
        txtFirstName.sendKeys(Keys.CONTROL+"A");
        txtFirstName.sendKeys(Keys.BACK_SPACE);
    }
}
