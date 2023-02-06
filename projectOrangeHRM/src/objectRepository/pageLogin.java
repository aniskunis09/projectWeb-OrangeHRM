package objectRepository;

import org.openqa.selenium.By;

public class pageLogin {
    public By getLogoOrange() {
        By logoOrange = By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[1]/img");
        return logoOrange;
    }
    public By getFieldUsername() {
        By fieldUsername = By.name("username");
        return fieldUsername;
    }
    public By getFieldPassword() {
        By fieldPassword = By.name("password");
        return fieldPassword;
    }
    public By getBtnLogin() {
        By btnLogin = By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
        return btnLogin;
    }


    public By getMsgInvalidCredential() {
        By msgInvalidCredential = By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[1]");
        return msgInvalidCredential;
    }


    public By getMsgRequiredUname() {
        By msgRequiredUname = By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span");
        return msgRequiredUname;
    }


    public By getMsgRequiredPass() {
        By msgRequiredPass = By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/span");
        return msgRequiredPass;
    }


    public By getMsgAccDisable() {
        By msgAccDisable = By.xpath("//div[@class='oxd-alert-content oxd-alert-content--error']");
//        By msgAccDisable = By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]");
        return msgAccDisable;
    }
}
