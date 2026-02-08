package seleniumExPack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(2000);

        WebElement textBox=driver.findElement(By.id("firstName"));
        textBox.sendKeys("Abhishekh");

        WebElement radioButton=driver.findElement(By.xpath("//label[text()='Male']"));
        radioButton.click();
        Thread.sleep(1000);

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);

        WebElement checkbox=driver.findElement(By.xpath("//label[text()='Sports']"));
        checkbox.click();
        Thread.sleep(1000);

        WebElement button=driver.findElement(By.id("submit"));
        js.executeScript("arguments[0].scrollIntoView(true);",button);
        Thread.sleep(1000);
        button.click();

        Thread.sleep(2000);
        driver.quit();
    }
}
