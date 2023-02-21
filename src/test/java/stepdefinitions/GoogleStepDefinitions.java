package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;
public class GoogleStepDefinitions {
    GooglePage googlePage=new GooglePage();
@Given ("kullanici google gider")
    public void kullanıcı_google_gider(){
    Driver.getDriver().get(ConfigReader.getProperty("google_url"));

    //çerezi yok etme için gerekli kod
try {
    googlePage.popUpAccept.click();
}catch (Exception e){

}
}
@When("kullanici iphone için arama yapar")
    public void kullanıcı_iphone_için_arama_yapar(){
googlePage.searchBox.sendKeys("iphone"+ Keys.ENTER);
    }
    @Then("sonuclarda iphone oldugunu dogrular")
    public void sonuclarda_iphone_oldugunu_dogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iphone"));
    }
    @And("close the application")
    public void close_the_application(){
    Driver.closeDriver();
    }
    @When("kullanıcı tesla için arama yapar")
    public void kullanıcı_tesla_için_arama_yapar() {
        // Write code here that turns the phrase above into concrete actions
        googlePage.searchBox.sendKeys("tesla"+Keys.ENTER);
    }
    @Then("sonuclarda tesla olduğunu doğrular")
    public void sonuclarda_tesla_olduğunu_doğrular() {
        // Write code here that turns the phrase above into concrete actions
       Assert.assertTrue(Driver.getDriver().getPageSource().contains("tesla"));
    }
}


/*
    GooglePage googlePage = new GooglePage();
    @Given("kullanici google gider")
    public void kullanici_google_gider() {
        Driver.getDriver().get("https://www.google.com");
//        CEREZ CIKAN ARKADARLAR ICIN, CEREZI OKEYLEYELIM
        try{
            googlePage.popUpAccept.click();
        }catch (Exception e){
        }
    }
    @When("kullanici iphone için arama yapar")
    public void kullanici_iphone_için_arama_yapar() {
    }
    @Then("sonuclarda iphone oldugunu dogrular")
    public void sonuclarda_iphone_oldugunu_dogrular() {
    }
}

 */