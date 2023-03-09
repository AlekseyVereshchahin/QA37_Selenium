import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWorks {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver;
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators(){
        //by tag name
        WebElement el1 = wd.findElement(By.tagName("a"));
        WebElement element1 = wd.findElement(By.cssSelector("a"));
        List<WebElement> l1 = wd.findElements(By.tagName("a"));
        List<WebElement> list1 = wd.findElements(By.cssSelector("a"));

        WebElement el2 = wd.findElement(By.tagName("button"));
        WebElement element2 = wd.findElement(By.cssSelector("button"));
        List<WebElement> l2 = wd.findElements(By.tagName("button"));
        List<WebElement> list2 = wd.findElements(By.cssSelector("button"));

        WebElement el3 = wd.findElement(By.tagName("input"));
        WebElement element3 = wd.findElement(By.cssSelector("input"));
        List<WebElement> l3 = wd.findElements(By.tagName("input"));
        List<WebElement> list3 = wd.findElements(By.cssSelector("input"));

        //by class
        WebElement cl1 = wd.findElement(By.className("container"));
        WebElement class1 = wd.findElement(By.cssSelector(".container"));

        WebElement cl2 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement class2 = wd.findElement(By.cssSelector(".login_login__3EHKB"));

        WebElement cl3 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement class3 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));

        //by ID
        WebElement id1 = wd.findElement(By.id("root"));
        WebElement id1_1 = wd.findElement(By.cssSelector("#root"));

        //by attribute
        WebElement atr1 = wd.findElement(By.cssSelector("[href = '/home']"));
        WebElement atr2 = wd.findElement(By.cssSelector("[href = '/about']"));
        WebElement atr3 = wd.findElement(By.cssSelector("[href = '/login']"));
        WebElement atr4 = wd.findElement(By.cssSelector("[name = 'email']"));
        WebElement atr5 = wd.findElement(By.cssSelector("[placeholder = 'Email']"));
        WebElement atr6 = wd.findElement(By.cssSelector("[name = 'password']"));
        WebElement atr7 = wd.findElement(By.cssSelector("[placeholder = 'Password']"));
        WebElement atr8 = wd.findElement(By.cssSelector("[type = 'submit']"));
        List<WebElement> atr8_1 = wd.findElements(By.cssSelector("[type = 'submit']"));
        WebElement atr9 = wd.findElement(By.cssSelector("[name = 'login']"));
        WebElement atr10 = wd.findElement(By.cssSelector("[name = 'registration']"));

        //by name
        WebElement n1 = wd.findElement(By.name("login"));
        WebElement n2 = wd.findElement(By.name("password"));
        WebElement n3= wd.findElement(By.name("email"));
        WebElement n4 = wd.findElement(By.name("registration"));

        WebElement t1 = wd.findElement(By.cssSelector("[placeholder ^= 'Pass']"));
        WebElement t2 = wd.findElement(By.cssSelector("[placeholder $= 'ord']"));
        WebElement t3 = wd.findElement(By.cssSelector("[placeholder *= 'ass']"));








    }


}
