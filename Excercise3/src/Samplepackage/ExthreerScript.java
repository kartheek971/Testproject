package Samplepackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ExthreerScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\Downloads\\Desktop\\e2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.youtube.com/watch?v=4_XfJ29K9P4";
		driver.get(url);
		String title = driver.getTitle();
		int tLength = title.length();
		System.out.println("Display the string title " + title);
		System.out.println("Display the string length " + tLength);
		
		
		
		
		

	}

}
