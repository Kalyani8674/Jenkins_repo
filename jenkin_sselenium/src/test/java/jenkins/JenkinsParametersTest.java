package jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsParametersTest {
	@Test
	public void receiveparameter() {
		String browser = System.getProperty("browser");
		Reporter.log(browser);
	}
}
