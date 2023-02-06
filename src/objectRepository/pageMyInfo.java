package objectRepository;

import org.openqa.selenium.By;

public class pageMyInfo {
    public By getMenuMyInfo() {
        By menuMyInfo = By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a");
        return menuMyInfo;
    }
    public By getFormPersonalDetails() {
        By formPersonalDetails = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/h6");
        return formPersonalDetails;
    }
    public By getDropdownNationality() {
        By dropdownNationality = By.xpath("//*[@id ='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]/i");
//        By dropdownNationality = By.xpath("//*[@class='oxd-select-wrapper']/descendant::i[1]");
        return dropdownNationality;
    }
    public By getListDropDown() {
        By listDropDown = By.xpath("//div[@role='option']/span");
        return listDropDown;
    }
    public By getTxtNationality(String nationality) {
        By txtNationality = By.xpath("//div[@role='option']/span[text()='"+nationality+"']");
        return txtNationality;
    }
    public By getDropdownMaritalStatus() {
        By dropdownMaritalStatus = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[2]/i");
        return dropdownMaritalStatus;
    }
    public By getMaritalStatus(String status) {
        By maritalStatus = By.xpath("//div[@role='option']/span[text()='"+status+"']");
        return maritalStatus;
    }
    public By getGenderFemale() {
        By genderFemale = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/span");
//        By genderFemale = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/input");
        return genderFemale;
    }
    public By getBtnSaveProfile() {
        By btnSaveProfile = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button");
        return btnSaveProfile;
    }
    public By getNotifSuccessEditProfile() {
        By notifSuccessEditProfile = By.xpath("//*[@id='oxd-toaster_1']/div");
        return notifSuccessEditProfile;
    }
}