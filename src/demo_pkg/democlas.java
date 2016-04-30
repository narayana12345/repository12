package demo_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class democlas {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		String exp="OrangeHRM";
		String act=driver.getTitle();
		
		System.out.println("the Actual result is::"+act);
		
		if(exp.equals(act))
			System.out.println("launch success");
		else
			System.out.println("lunch is not success");
		
		
		//login App
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		
		String explog="Welcome Admin";
		String actlog=driver.findElement(By.id("welcome")).getText();
		
		System.out.println("the Actual  login result is::"+actlog);
		
		if(explog.equals(actlog))
			System.out.println("login success");
		else
			System.out.println("login is not success");
		
	}

}
