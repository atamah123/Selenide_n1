import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HomeworkSelenideN1 {

    @Test
    void test () {
        // -Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide/");
        // -Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
        // -Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $(".js-wiki-sidebar-toggle-display").lastChild().
                    lastChild().scrollTo().$("[type=button]").click(); // Show more pages...

        $(".js-wiki-sidebar-toggle-display").lastChild().$$("li.wiki-more-pages")
                .last().$("a").click(); // нажал на SoftAssertions
        // -Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $(".markdown-body")
//                .$(byText("3. Using JUnit5 extend test class:")).scrollTo()
                    .shouldHave(text("ExtendWith"));

        sleep(5000);
    }
}
