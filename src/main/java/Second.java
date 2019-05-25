import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Second extends Base {

    @Test
    public void userCanLoginByUsername() {
        logger.info("Test starts");
//        open("http://google.hu");
//        $(By.name("q")).setValue("johny").pressEnter();
//        $("#submit").click();
//        $(".loading_progress").should(disappear); // Waits until element disappears
//        $("#username").shouldHave(text("Hello, Johny!")); // Waits until element gets text
    }
}
