package pages;

import org.openqa.selenium.By;

public class SearchPage extends BasePage{

    By textTitleMain =
            By.xpath("//*[@resource-id='com.telran.ilcarro:id/findTitle']");

    public String getTextMainTitle() {
        wait(textTitleMain,15000);
        return getTextBase(textTitleMain);

    }
}
