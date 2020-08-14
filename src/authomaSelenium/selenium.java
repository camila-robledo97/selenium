package authomaSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selenium {

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://192.168.1.87:8080/toolbox-front/#/login");
		
		
		//Login
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/form"
									+ "/div[1]/span/input")).sendKeys("pruebasoaint2");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/form/div[2]"
									+ "/span/input")).sendKeys("Soaint2");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/form/div[3]/button/span[2]")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("external-page");
		
		
		//ingresar a "mis asignaciones"
		driver.findElement(By.xpath(("/html/body/app-root/app-admin-layout/div/div/div[1]/div/div/div/app-menu/ul/li[2]/a"))).click();
		
		/*
		//ingresar a "consulta"
		driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/div/div[1]/div/div/div/app-menu/ul/li[3]/a")).click();
		
		// expediente 
		
		driver.findElement(By.xpath("//*[@id=\"depP\"]/span/input")).sendKeys("DESPACHO DEL (DE LA) PERSONERO(A) DE BOGOTÁ DC");
		driver.findElement(By.xpath("//*[@id=\"sCode\"]/span/input")).sendKeys("ACTAS");
		driver.findElement(By.xpath("//*[@id=\"ssCode\"]/span/input")).sendKeys("ACTA DE REUNIÓN");
		driver.findElement(By.xpath("//*[@id=\"udId\"]")).sendKeys("prueba");
		driver.findElement(By.xpath("//*[@id=\"udName\"]")).sendKeys("prueba");
		driver.findElement(By.xpath("//*[@id=\"desc1\"]")).sendKeys("prueba");
		driver.findElement(By.xpath("//*[@id=\"desc2\"]")).sendKeys("prueba");
		//driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-4\"]/app-consulta-expedientes/form/div/div/div[8]/button[1]/span[2]")).click();
		*/
		
	}

}
