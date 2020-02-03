package tester.choucair;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedirectLinkExterno {

    static WebDriver driver;

    public static void main(String[] args) {

        String url = "https://www.choucairtesting.com/";
        String chromePath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"menu-item-550\"]/a")).click();
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollBy(0,2300)");
        try {
            driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[14]/div/div/div[1]/div/div/div/div/div/ul/li[1]/a")).click();
            Thread.sleep(1500);
            System.out.println("PRUEBA EXITOSA");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            driver.quit();
        }
    }
}

