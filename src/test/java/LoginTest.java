import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class LoginTest {
    @Test
    void successfullLoginTest (){
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen= true;

        open("https://www.qa.guru/cms/system/login");
        $("[name=email]").setValue("qagurubot@gmail.com");
        $("[name=password]").setValue("qagurupassword").pressEnter();
        $("[class=main-header__login]").click();
        $(".logined-form").shouldHave(text("QA_GURU_BOT"));
    }
}