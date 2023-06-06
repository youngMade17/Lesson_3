import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {
    void method() {

        // <input type="email" class="inputtext login_form_input_box" name="email" id="email">

        $("[data-testid=email]").setValue("asd");
        $(by("data-testid", "email")).setValue("1");
        $("input#email").setValue("asd");
        $x("//*[@id='email']").setValue("1");
        $x("//input[@id='email']").setValue("1");

        // <input type="email" class="inputtext login_form_input_box" name="email">
        $("[name=email]").setValue("1");
        $(byName("email")).setValue("1");

        // <input type="email" class="inputtext login_form_input_box">
        $("[class=login_form_input_box]").setValue("1");
        $(".login_form_input_box").setValue("1");
        $("input.inputtext.login_form_input_box").setValue("1");
        $x("//input[@class='inputtext'][@class='login_form_input_box']").setValue("1");

        // <div class="inputtext">
        //      <input type="email" class="login_form_input_box">
        // </div>
        $(".inputtext").$(".login_form_input_box").setValue("1");
        $(".inputtext .login_form_input_box").setValue("1");

        // <div>Hello, qa.guru!</div>
        $x("//div=[text()='Hello, qa.guru!']").click();
        $(byText("Hello, qa.guru!")).click();
        $(withText("ello, qa.gur")).click();
    }
}
