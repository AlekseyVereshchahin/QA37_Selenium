import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {
    WebDriver wd;

    @Test
    public void start(){
        wd=new ChromeDriver();
//        wd.get("https://google.com"); //without history
        wd.navigate().to("https://google.com");
        wd.navigate().forward();
        wd.navigate().back();
        wd.navigate().refresh();
        // close pages
        wd.close();//close only one tab. if tab only one-close browser
        wd.quit(); //close all tabs and browser
    }
}
