package practice1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webElements {

	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
	//	String title=driver.getTitle();
		System.out.println(driver.getTitle()); 	//to get title of current webpage
		System.out.println(driver.getCurrentUrl());	//to get url of current webpage
		driver.navigate().to("https://www.flipkart.com/");	//to navigate flipkart webpage
		//Thread.sleep(3000);

		driver.navigate().back();
	//	Thread.sleep(3000);
		driver.navigate().forward();
		//Thread.sleep(3000);

		driver.navigate().refresh();
		
		driver.close();	//to close current window
		
	}
	

}
