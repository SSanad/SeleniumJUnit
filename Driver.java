/**
 * Created by Sam on 04-09-18.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    ChromeDriver cDriver = new ChromeDriver();


    public static void main(String[] args) {
        Driver d = new Driver();
        System.out.println(d.getEmailFromURL());
        System.out.println(d.getEmailFromURL());
    }

    public String getEmailFromURL() {
        cDriver.get("http://demo.guru99.com/");
        WebElement element = cDriver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("blah@gmail.com");
        WebElement button = cDriver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();
        String url ="";
        url =  cDriver.getCurrentUrl();
        return url.substring(url.lastIndexOf("=")+1);
    }
}

