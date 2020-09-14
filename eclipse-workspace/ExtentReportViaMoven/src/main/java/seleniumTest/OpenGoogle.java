package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver\\chromedriver.exe");
         ExtentHtmlReporter reporter = new ExtentHtmlReporter("report.html");
         ExtentReports extentReports = new ExtentReports();
         extentReports.attachReporter(reporter);
         ExtentTest test = extentReports.createTest("Whatsup Duck");
		 WebDriver dr = new ChromeDriver();
		 dr.get("http://www.google.co.in");
		 dr.findElement(By.name("q")).sendKeys("Whatsup Duck");
		 dr.findElement(By.name("q")).submit();
		 test.pass("Test Passed");
		 dr.quit();
		 extentReports.flush();
	}

}
