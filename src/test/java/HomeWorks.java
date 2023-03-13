import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWorks {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        wd = new ChromeDriver(options);

        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators(){
        //by tag name
        WebElement el1 = wd.findElement(By.tagName("a"));
        WebElement element1 = wd.findElement(By.cssSelector("a"));
        WebElement xElement1 = wd.findElement(By.xpath("//a"));
        List<WebElement> l1 = wd.findElements(By.tagName("a"));
        List<WebElement> list1 = wd.findElements(By.cssSelector("a"));
        List<WebElement> xLElement = wd.findElements(By.xpath("//a"));

        WebElement el2 = wd.findElement(By.tagName("button"));
        WebElement element2 = wd.findElement(By.cssSelector("button"));
        WebElement xElement2 =wd.findElement(By.xpath("//button"));
        List<WebElement> l2 = wd.findElements(By.tagName("button"));
        List<WebElement> list2 = wd.findElements(By.cssSelector("button"));
        List<WebElement> xLElement2 =wd.findElements(By.xpath("button"));

        WebElement el3 = wd.findElement(By.tagName("input"));
        WebElement element3 = wd.findElement(By.cssSelector("input"));
        WebElement xElement3 = wd.findElement(By.xpath("//input"));
        List<WebElement> l3 = wd.findElements(By.tagName("input"));
        List<WebElement> list3 = wd.findElements(By.cssSelector("input"));
        List<WebElement> xLElement3 =wd.findElements(By.xpath("input"));

        //by class
        WebElement cl1 = wd.findElement(By.className("container"));
        WebElement class1 = wd.findElement(By.cssSelector(".container"));
        WebElement xClass1 = wd.findElement(By.xpath("//*[@class ='container']"));

        WebElement cl2 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement class2 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement xClass3 = wd.findElement(By.xpath("//*[@class = 'login_login__3EHKB']"));

        WebElement cl3 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement class3 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement cClass3 = wd.findElement(By.xpath("//*[@class = 'navbar-component_nav__1X_4m']"));

        //by ID
        WebElement id1 = wd.findElement(By.id("root"));
        WebElement id1_1 = wd.findElement(By.cssSelector("#root"));
        WebElement xId1 = wd.findElement(By.xpath("//*[@id = 'root']"));

        //by attribute
        WebElement atr1 = wd.findElement(By.cssSelector("[href = '/home']"));
        WebElement xAtr1 = wd.findElement(By.xpath("//*[@href = '/home']"));
        WebElement atr2 = wd.findElement(By.cssSelector("[href = '/about']"));
        WebElement xAtr2 = wd.findElement(By.xpath("//*[@href = '/about']"));
        WebElement atr3 = wd.findElement(By.cssSelector("[href = '/login']"));
        WebElement xAtr3 = wd.findElement(By.xpath("//*[@href = '/login']"));
        WebElement atr4 = wd.findElement(By.cssSelector("[name = 'email']"));
        WebElement xAtr4 = wd.findElement(By.xpath("//*[@name = 'email']"));
        WebElement atr5 = wd.findElement(By.cssSelector("[placeholder = 'Email']"));
        WebElement xAtr5 = wd.findElement(By.xpath("//*[@placeholder = 'Email']"));
        WebElement atr6 = wd.findElement(By.cssSelector("[name = 'password']"));
        WebElement xAtr6 = wd.findElement(By.xpath("//*[@name = 'password']"));
        WebElement atr7 = wd.findElement(By.cssSelector("[placeholder = 'Password']"));
        WebElement xAtr7 = wd.findElement(By.xpath("//*[@placeholder = 'Password']"));
        WebElement atr8 = wd.findElement(By.cssSelector("[type = 'submit']"));
        WebElement xAtr8 = wd.findElement(By.xpath("//*[@type = 'submit']"));
        List<WebElement> atr8_1 = wd.findElements(By.cssSelector("[type = 'submit']"));
        List<WebElement> xAtr8_1 = wd.findElements(By.xpath("//*[@type = 'submit']"));
        WebElement atr9 = wd.findElement(By.cssSelector("[name = 'login']"));
        WebElement xAtr9 = wd.findElement(By.xpath("//*[@name = 'login']"));
        WebElement atr10 = wd.findElement(By.cssSelector("[name = 'registration']"));
        WebElement xAtr10 = wd.findElement(By.xpath("//*[@name = 'registration']"));

        //by name
        WebElement n1 = wd.findElement(By.name("login"));
        WebElement n2 = wd.findElement(By.name("password"));
        WebElement n3= wd.findElement(By.name("email"));
        WebElement n4 = wd.findElement(By.name("registration"));

        WebElement t1 = wd.findElement(By.cssSelector("[placeholder ^= 'Pass']"));
        WebElement xt1 = wd.findElement(By.xpath("//*[starts-with(@placeholder, 'Pass')]"));
        WebElement t2 = wd.findElement(By.cssSelector("[placeholder $= 'ord']"));
        WebElement xt2 = wd.findElement(By.xpath("//*[contains(@placeholder,'ord')]"));
        WebElement t3 = wd.findElement(By.cssSelector("[placeholder *= 'ass']"));
        WebElement xT3 = wd.findElement(By.xpath("//*[contains(@placeholder,'ass')]"));

        WebElement xpT4 = wd.findElement(By.xpath("//*[text() = 'HOME']"));
        WebElement xpT5 = wd.findElement(By.xpath("//button[text()='Registration']"));
    }

    @Test
    public void classwork(){
        //parent
        WebElement el1 = wd.findElement(By.xpath("//h1/parent::*"));
        WebElement el2 = wd.findElement(By.xpath("//h1/parent::div"));
        WebElement el3 = wd.findElement(By.xpath("//h1/..*"));

        //ancestor предки
        WebElement el4 = wd.findElement(By.xpath("//h1/ancestor::*"));
        WebElement el5 = wd.findElement(By.xpath("//h1/ancestor::div"));
        WebElement el6 = wd.findElement(By.xpath("//h1/ancestor::div[2]"));

        //ancestor-or-self (плюс ребенок от которого ищем)
        WebElement el7 = wd.findElement(By.xpath("//h1/ancestor-or-self::*"));
        List<WebElement> el8 = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

        //following-sibling (ищет все элементы а на этаже h1)
        List<WebElement> l1 = wd.findElements(By.xpath("//h1/following-sibling::a"));

        //preceding-sibling
        WebElement el9 = wd.findElement(By.xpath("//a[@href = '/login']/preceding-sibling::a"));
        List<WebElement>list2=wd.findElements(By.xpath("//a[@href='/login']/preceding-sibling::a"));

    }
    @Test
    public void classwork2(){
        WebElement element = wd.findElement(By.cssSelector("[name = 'login']"));
        String text = element.getText();
        System.out.println(text);

    }

}
