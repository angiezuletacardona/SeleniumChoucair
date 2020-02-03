package tester.choucair;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedirectLinkInterno {

    public static void main(String[] args) {
        WebDriver driver;
        String url="https://www.choucairtesting.com/";
        String ResulActual="";
        String ResulEsperado="PREPARARSE PARA APLICAR";

        String chromePath= System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);
        driver=new ChromeDriver();
        driver.get(url);
        //maximizar pantalla
        driver.manage().window().maximize();
        //clic en EMPLEOS
        driver.findElement(By.xpath("//*[@id=\"menu-item-550\"]/a")).click();

        // clic en imagen
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[2]/div/div/div[3]/div/div/div/div/div/figure/a/img")).click();
        ResulActual=driver.getTitle();
        System.out.println(ResulActual.contentEquals(ResulEsperado)?"EL LINK LLEVA A LA INFORMACIÓN CORRESPONDIENTE"+ResulActual:"NO ES LA INFORMACIÓN CORRESPODIENTE");
        driver.close();
    }
}
