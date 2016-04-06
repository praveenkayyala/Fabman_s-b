import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;


public class Hooks {

    BaseMain base = new BaseMain();
    @Before
    public  void setUp() throws IOException {
        base.openBrowser();
    }
    //@After
    public  void tearDown(){
        base.closeBrowser();
    }
}
