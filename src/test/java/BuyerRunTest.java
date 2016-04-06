/**
 * Created by Sudhakar on 30/03/2016.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty","html:target/sudhakar-html-report",
        "json:target/kayyala.json"}
        //,tags = {"@newsupplier"}
        ,tags = {"@newbuyer"}
)
public class BuyerRunTest {
}
