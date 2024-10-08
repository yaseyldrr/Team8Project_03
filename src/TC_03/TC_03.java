package TC_03;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v127.page.model.WebAppManifest;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TC_03 extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://shopdemo.e-junkie.com/");

        WebElement demoBook = driver.findElement(By.xpath("//*[@id='products']/div[1]/div/div[2]/a/div/div[2]/button"));
        demoBook.click();
        MyFunc.bekle(1);

        driver.switchTo().frame(driver.findElement(By.className("EJIframeV3")));
        WebElement card=driver.findElement(By.xpath("//*[@id='Overlay']/div/div[2]/div/div[2]/div[3]/div/button[3]"));
        card.click();
        MyFunc.bekle(1);

        WebElement email=driver.findElement(By.xpath("//*[@placeholder='Email']"));
        email.sendKeys(" technostudyteam8@gmail.com");
        MyFunc.bekle(1);

        WebElement email2=driver.findElement(By.xpath("//*[@placeholder='Confirm Email']"));
        email2.sendKeys(" technostudyteam8@gmail.com");
        MyFunc.bekle(1);

        WebElement name=driver.findElement(By.xpath("//*[@placeholder='Name On Card']"));
        name.sendKeys("Team8");
        MyFunc.bekle(1);

        driver.switchTo().frame(1);  //iframe çıkmak
        WebElement cardnumber=driver.findElement(By.xpath("//*[@name='cardnumber']"));
        cardnumber.sendKeys("1111111111111111");
        MyFunc.bekle(1);

        WebElement pay=driver.findElement(By.xpath("//*[@class='Pay-Button']"));
        pay.click();
        MyFunc.bekle(1);

        WebElement message=driver.findElement(By.xpath("//*[@id='SnackBar']"));

        Assert.assertTrue("Error", message.getText().contains("Kart numaranız geçersiz."));
        BekleKapat();


    }

}
