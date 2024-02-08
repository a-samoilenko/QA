
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupCreationTests {
    WebDriver driver;
    @BeforeEach
    public void setUp() {

        driver = new ChromeDriver();
    }
    @AfterEach
    public void tearDown() {

        driver.quit();
    }
    @Test
    public void testGroupCreation() {
        driver.get("http://localhost/addressbook/");
        driver.manage().window().setSize(new Dimension(1050, 840));
        driver.findElement(By.name("user")).sendKeys("admin");
        driver.findElement(By.name("pass")).sendKeys("secret");
        driver.findElement(By.id("LoginForm")).click();
        driver.findElement(By.cssSelector("input:nth-child(7)")).click();
        driver.findElement(By.cssSelector("#nav > ul > li.admin > a")).click();
        driver.findElement(By.name("new")).click();
        driver.findElement(By.name("group_name")).click();
        driver.findElement(By.name("group_name")).sendKeys("test");
        driver.findElement(By.name("group_header")).click();
        driver.findElement(By.name("group_header")).sendKeys("test");
        driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).sendKeys("test");
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.cssSelector("#nav > ul > li.admin > a")).click();
    }
}