package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import LoginPageObj.LoginPageObj;

public class Login {
	WebDriver d;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver101\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.phptravels.net/login");
		
		PageFactory.initElements(d, LoginPageObj.class);
		LoginPageObj.email.sendKeys("user@phptravels.com");
		LoginPageObj.pswd.sendKeys("demouser");
		LoginPageObj.submit.click();	
		/*
		LoginPageObj.email(d).sendKeys("user@phptravels.com");
		
		LoginPageObj.pswd(d).sendKeys("demouser");
		
		LoginPageObj.submit(d).click();
		*/
		/*
		d.findElement(By.name("email")).sendKeys("user@phptravels.com");
		d.findElement(By.name("password")).sendKeys("demouser");
		d.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();
		*/
  }
}
