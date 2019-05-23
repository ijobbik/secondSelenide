import org.openqa.selenium.By;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Second {

    @Test
    public void userCanLoginByUsername() {
        open("http://google.hu");
        $(By.name("q")).setValue("johny").pressEnter();
        $("#submit").click();
        $(".loading_progress").should(disappear); // Waits until element disappears
        $("#username").shouldHave(text("Hello, Johny!")); // Waits until element gets text
    }
}
