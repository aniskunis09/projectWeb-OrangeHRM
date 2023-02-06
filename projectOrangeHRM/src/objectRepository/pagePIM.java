package objectRepository;

import org.openqa.selenium.By;

public class pagePIM {
    public By getBtnAddEmployee() {
        By btnAddEmployee = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
        return btnAddEmployee;
    }
    public By getFieldFirstName() {
        By fieldFirstName = By.name("firstName");
        return fieldFirstName;
    }
    public By getFieldMiddleName() {
        By fieldMiddleName = By.name("middleName");
        return fieldMiddleName;
    }
    public By getFieldLastName() {
        By fieldLastName = By.name("lastName");
        return fieldLastName;
    }
    public By getSwitchCreateLoginDtl() {
        By switchCreateLoginDtl = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span");
        return switchCreateLoginDtl;
    }
    public By getUsernameNewEmployee() {
        By usernameNewEmployee = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input");
        return usernameNewEmployee;
    }
    public By getPasswordNewEmployee() {
        By passwordNewEmployee = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input");
        return passwordNewEmployee;
    }
    public By getConfirmPswdNewEmployee() {
        By confirmPswdNewEmployee = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input");
        return confirmPswdNewEmployee;
    }
    public By getBtnSaveNewEmployee() {
        By btnSaveNewEmployee = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]");
        return btnSaveNewEmployee;
    }
    public By getNotifSuccessNewEmployee() {
        By notifSuccessNewEmployee = By.xpath("//*[@id='oxd-toaster_1']/div");
        return notifSuccessNewEmployee;
    }

    public By getPersonalDtlPage() {
        By personalDtlPage = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/h6");
        return personalDtlPage;
    }


    public By getUsernameNewEmployeeDisabled() {
        By usernameNewEmployeeDisabled = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input");
        return usernameNewEmployeeDisabled;
    }
    public By getPasswordNewEmployeeDisabled() {
        By passwordNewEmployeeDisabled = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input");
        return passwordNewEmployeeDisabled;
    }
    public By getConfirmPswdNewEmployeeDisabled() {
        By confirmPswdNewEmployeeDisabled = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input");
        return confirmPswdNewEmployeeDisabled;
    }
    public By getRdbtnDisabled() {
        By rdbtnDisabled = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/div/label/span");
        return rdbtnDisabled;
    }


    public By getMsgRequiredFirstName() {
        By msgRequiredFirstName = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/span");
        return msgRequiredFirstName;
    }
    public By getMsgRequiredLastName() {
        By msgRequiredLastName = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/span");
        return msgRequiredLastName;
    }


}