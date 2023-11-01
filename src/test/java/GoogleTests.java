import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;
public class GoogleTests {
    @Test
    void selenideSearchTest(){
        Configuration.pageLoadStrategy = "eager";
        // Открыть google
        open("https://www.google.com/");
        //ввести Selenide в поиск
        $(byName("q")).setValue("Selenide").pressEnter();

        $("#search").shouldHave(text("Selenide:"));
    }
}
