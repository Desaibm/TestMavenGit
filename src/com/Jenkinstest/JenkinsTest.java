package com.Jenkinstest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JenkinsTest {

	WebDriver driver;

	@Test
	public void browserlaunch() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
