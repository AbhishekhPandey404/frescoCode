package seleniumExPack;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXPathExample {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        driver.findElement(
            By.xpath("/html/body/div[1]/div[2]/form/input[1]")
        ).sendKeys("Abhishekh");

        driver.quit();
    }
}
