package MavenProject22.SeleniumRun;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch 
{

@Test
public void testcase()
{

	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
}
}
