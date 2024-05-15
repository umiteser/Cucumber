package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.*;
import org.apache.commons.lang3.RandomStringUtils;

public class _02_CountrySteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Navigate to country")
    public void navigateToCountry() {
        ln.myClick(ln.setup);  //myclick bekletmesi içinde var.
        ln.myClick(ln.parameters);
        ln.myClick(ln.countries);

    }

    @When("Create a country")
    public void createACountry() {

        String ulkeadi= RandomStringUtils.randomAlphanumeric(8);
        String ulkeKodu=RandomStringUtils.randomNumeric(4);
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput,ulkeadi); //ulke adı ve kodu sürekli değişmesi gerekiyor.
        dc.mySendKeys(dc.codeInput,ulkeKodu); //tırnak içinde yazarsak sürekli aynı ülke kaydı yapar
        dc.myClick(dc.saveButton);              // ve daha önce kayıt olmuş hatası vermesin.
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
       dc.verifyContainsText(dc.successMessage, "success");
    }

    @When("Create a country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String ulkeAdi, String ulkeKod) {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput,ulkeAdi);
        dc.mySendKeys(dc.codeInput,ulkeKod);
        dc.myClick(dc.saveButton);
    }
}
