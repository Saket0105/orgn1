package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class contacttest {

	@Test
	public void Createorganization()
	{
		WebDriver driver =new ChromeDriver();
		driver.get("http://localhost:8888/");
	}


	}


