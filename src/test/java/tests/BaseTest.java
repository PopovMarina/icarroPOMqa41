package tests;

import config.AppiumConfig;
import pages.*;
import dto.UserDTO;

public class BaseTest extends AppiumConfig {

    SplashScreenPage splashScreenPage = new SplashScreenPage();
    SearchPage searchPage = new SearchPage();
    LoginPage loginPage = new LoginPage();
    MyCarsPage myCarsPage = new MyCarsPage();
    AddNewCarPage addNewCarPage = new AddNewCarPage();

    UserDTO user = UserDTO.builder()
            .username("aaaaa@mail.com")
            .password("123456Aa$")
            .build();

}
