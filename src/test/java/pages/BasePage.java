package pages;

import config.AppiumConfig;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected MobileElement findElementBase(By by) {
        return (MobileElement) AppiumConfig.getDriver().findElement(by);
    }

    protected String getTextBase(By by) {
        return findElementBase(by).getText().trim();
    }

    protected void wait(By by, int time) {
        new WebDriverWait(AppiumConfig.getDriver(),time)
                .until(ExpectedConditions.visibilityOfElementLocated(by));
    }

}
