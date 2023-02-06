    package Lesson8pageObjectTests;

    import Lesson8pageObjects.LoginPage;
    import Lesson8pageObjects.MainPage;
    import org.testng.Assert;
    import org.testng.annotations.Test;

    public class LoginToApp extends BaseTest {

        // Positive testing
    @Test
    public void loginTest_loginWithCorrectCredentials_mainPageOpened(){
        LoginPage loginPageLesson8 = new LoginPage(driver);
        loginPageLesson8.open();
        MainPage mainPageLesson8 = loginPageLesson8.loginToAppLesson8(username, password);
        Assert.assertTrue(mainPageLesson8.isMainPageLesson8());
    }

        // Negative testing
    @Test
    public void loginTest_loginWithIncorrectCredentials_errorFrame(){
        LoginPage loginPageLesson8 = new LoginPage(driver);
        loginPageLesson8.open();
        loginPageLesson8.loginToAppLesson8(username,"wrongPassword");
        Assert.assertTrue(loginPageLesson8.isErrorFrame());
    }
}