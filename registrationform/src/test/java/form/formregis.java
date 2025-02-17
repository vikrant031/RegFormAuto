package form;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class formregis {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Vikrant");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Chaudhary");
		
		WebElement address =  driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
		address.sendKeys("New Delhi");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vikrantsheoran4@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("7302373959");
		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		
		WebElement languageDropdown = driver.findElement(By.id("msdd"));
        languageDropdown.click();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement english = driver.findElement(By.xpath("//a[contains(text(),'English')]"));
        WebElement hindi = driver.findElement(By.xpath("//a[contains(text(),'Hindi')]"));

        js.executeScript("arguments[0].click();", english);
        js.executeScript("arguments[0].click();", hindi);
        
        WebElement down = driver.findElement(By.xpath("//select[@id='Skills']"));
        Select select = new Select(down);
        select.selectByValue("Content Managment");
        Thread.sleep(2000);
        
        //select country code left
        
        
        WebElement down1 = driver.findElement(By.xpath("//select[@id='yearbox']"));
        Select select1 = new Select(down1);
        select1.selectByValue("2000");
        
        WebElement down2 = driver.findElement(By.xpath("//select[@placeholder='Month']"));
        Select select2 = new Select(down2);
        select2.selectByValue("July");
        
        WebElement down3 = driver.findElement(By.xpath("//select[@id='daybox']"));
        Select select3 = new Select(down3);
        select3.selectByValue("31");
        
        WebElement pas = driver.findElement(By.xpath("//input[@id='firstpassword']"));
        pas.sendKeys("730237");
        
        WebElement pass = driver.findElement(By.xpath("//input[@id='secondpassword']"));
        pass.sendKeys("730237");
        
        driver.findElement(By.xpath("//input[@id='imagesrc']")).sendKeys("C:/Users/LENOVO/Downloads/Assignment for QA Tester - Manual%20 Automated (1).pdf");
        Thread.sleep(2000);
        
        WebElement sub = driver.findElement(By.xpath("//button[@id='submitbtn']"));
        sub.click();
        System.out.println("successful submit!");
	}

		

	
		
		
			
		

	}


