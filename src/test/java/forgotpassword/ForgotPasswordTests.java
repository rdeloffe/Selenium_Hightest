package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import static org.testng.Assert.*;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testPutEmail(){
        ForgotPasswordPage forgotPassword = homePage.clickForgotPassword();
        forgotPassword.setMail("toto@exemple.com");
        forgotPassword.ClickButton();
    }

}
