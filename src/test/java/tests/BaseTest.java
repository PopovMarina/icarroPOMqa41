package tests;

import config.AppiumConfig;
import pages.SearchPage;
import pages.SplashScreenPage;

public class BaseTest extends AppiumConfig {

    SplashScreenPage splashScreenPage = new SplashScreenPage();
    SearchPage searchPage = new SearchPage();

}
