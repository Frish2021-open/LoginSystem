package features;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.noear.solon.test.HttpTester;
import org.noear.solon.test.SolonJUnit4ClassRunner;
import org.noear.solon.test.SolonTest;
import xyz.frish2021.login.LoginDemoApp;

import java.io.IOException;

@RunWith(SolonJUnit4ClassRunner.class)
@SolonTest(LoginDemoApp.class)
public class HelloTest extends HttpTester {
    @Test
    public void hello() throws IOException {
    }
}