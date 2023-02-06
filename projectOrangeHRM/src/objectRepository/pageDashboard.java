package objectRepository;

import org.openqa.selenium.By;

public class pageDashboard {
    public By getPanelDashboard() {
        By panelDashboard = By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6");
        return panelDashboard;
    }


    public By getMenuPIM() {
        By menuPIM = By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a");
        return menuPIM;
    }


    public By getIconStopwatch() {
        By iconStopwatch = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/button/i");
        return iconStopwatch;
    }
    public By getFormPI() {
        By formPI = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/h6");
        return formPI;
    }
    public By getDatePI() {
        By datePI = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/input");
        return datePI;
    }
    public By getTimePI() {
        By timePI = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input");
        return timePI;
    }
    public By getTxtNotePI() {
        By txtNotePI = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/form/div[2]/div/div/div/div[2]/textarea");
        return txtNotePI;
    }
    public By getBtnIN() {
        By btnIN = By.xpath("//button[@type='submit']");
        return btnIN;
    }
    public By getNotifSuccessPI() {
        By notifSuccessPI = By.xpath("//*[@id='oxd-toaster_1']/div");
        return notifSuccessPI;
    }


    public By getDonePI() {
        By donePI = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/div[1]/div[1]/div[2]/p[1]");
        return donePI;
    }
    public By getFormPO() {
        By formPO = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/h6");
        return formPO;
    }
    public By getDatePO() {
        By datePO = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/input");
        return datePO;
    }
    public By getTimePO() {
        By timePO = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input");
        return timePO;
    }
    public By getTxtNotePO() {
        By txtNotePO = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/form/div[2]/div/div/div/div[2]/textarea");
        return txtNotePO;
    }
    public By getBtnOUT() {
        By btnOUT = By.xpath("//button[contains(@type, 'submit')]");
        return btnOUT;
    }
    public By getNotifSuccessPO() {
        By notifSuccessPO = By.xpath("//*[@id='oxd-toaster_1']/div");
        return notifSuccessPO;
    }


    public By getDropdownMenu() {
        By dropdownMenu = By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[2]/ul/li/span");
        return dropdownMenu;
    }
    public By getBtnLogout() {
        By btnLogout = By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a");
        return btnLogout;
    }
}