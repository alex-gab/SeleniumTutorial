import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class WebDriverTest {
    @Test
    public final void webDriverTest() {
        final WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://www.hw-group.com/products/charon2/ch2dk_demo_en.html");
    }
}
