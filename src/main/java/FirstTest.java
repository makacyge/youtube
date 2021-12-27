import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("ALL")
public class FirstTest {

    @Test
    public void youtube(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(" https://www.youtube.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("YouTube"));

        driver.findElement(By.xpath("//input[@id='search']")).click();

        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("11");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div[@id='sbse1']")).click();

        driver.findElement(By.xpath("(//a[@class='yt-simple-endpoint style-scope ytd-video-renderer'])[3]")).click();

        driver.findElement(By.xpath("//a[@class='yt-simple-endpoint style-scope ytd-video-owner-renderer']")).click();

        driver.findElement(By.xpath("(//div[@id='subscribe-button'])[3]")).click();


        driver.quit();




    }
}
