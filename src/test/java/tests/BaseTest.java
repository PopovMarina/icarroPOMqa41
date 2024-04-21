package tests;

import config.AppiumConfig;
import pages.LoginPage;
import pages.SearchPage;
import pages.SplashScreenPage;
import dto.UserDTO;

public class BaseTest extends AppiumConfig {

    SplashScreenPage splashScreenPage = new SplashScreenPage();
    SearchPage searchPage = new SearchPage();
    LoginPage loginPage = new LoginPage();

    UserDTO user = UserDTO.builder()
            .username("aaaaa@mail.com")
            .password("123456Aa$")
            .build();

}
