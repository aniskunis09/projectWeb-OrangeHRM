package stepDefinitions;

import config.env;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class hooks extends env {
    @Before
    public void before() {
        System.setProperty("webdriver.gecko.driver", "resources/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get (url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, duration);
    }

    @After
    public void after(Scenario scenario) {
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String saveCaptureFolder;
        if (scenario.isFailed()) {
            saveCaptureFolder = "resources/features/screenshots/failed/";
        } else {
            saveCaptureFolder = "resources/features/screenshots/all/";
        }
//        FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + saveCaptureFolder + scenario.getName() + ".png"));
        driver.quit();
    }
}
