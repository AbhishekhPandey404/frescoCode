package seleniumExPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPathTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.get("https://www.google.com");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name='q']"))
              .sendKeys("india vs nezealand" + Keys.ENTER);
    }
}
