package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",//features folder path
        glue = "stepdefinitions",//stepdefinitions path
        tags = "@iphone or @tesla"

)
public class Runner {
}
//Bu sinif Test caseleri RUN etmek icin kullanilir
//Ve konfigurasyonlar icin kullanilir
//runner classı features file ile stepdefinitionu birbirine bağlar
//tekrar eden ilk adımları tekrar tekrar kullanmak için background kullanılır mesela her senaryoda
// google girmek veya driveri kapatmak