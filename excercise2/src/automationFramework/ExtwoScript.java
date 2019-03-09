package automationFramework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtwoScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\Downloads\\Desktop\\e2\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         String url = "https://sqa.stackexchange.com/questions/25657/selenium-action-class-perform-method-throws-org-openqa-selenium-unsupportedcom";
         driver.get(url);
         String wb ="https://www.google.co.in";
         driver.get(wb);
         String title = driver.getTitle();
         int tLength = driver.getTitle().length();
         System.out.println("print it as:" + title);
         System.out.println("print it as:" + tLength);
         
         
         
	}

}
