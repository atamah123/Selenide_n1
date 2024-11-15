import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1366x768";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void shouldFindSelenideRepositoryAtTheTop() {
        // открыть главную страницу
        open("https://www.google.com/");
        // ввести в поле поиска selenide и нажать enter
       $("[name=q]").setValue("selenide").pressEnter();
       // кликнуть на первый репозиторий из списка найденых
//        $$
//       sleep(5000); 40:30
    }

}
