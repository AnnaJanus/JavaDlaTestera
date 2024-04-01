import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TrialTest {
    @Test
    public void trialTest(){
        System.out.println("Hello World");
    }

    @Test
    public void browserTest() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://github.com/AnnaJanus/JavaDlaTestera");
        Thread.sleep(10000);
        driver.close();
    }
}
