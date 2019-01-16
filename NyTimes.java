package com.bit.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NyTimes {
	WebDriver driver;
	@Test
	public void readNyTimes() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Iftekher\\Desktop\\BitTech Files 0012\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.nytimes.com");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().window().fullscreen();
		
		driver.findElement(By.xpath("(//section[@data-block-tracking-id='Top Stories']//div/h2)[2]")).click();	
		String st1 = driver.findElement(By.xpath("//article[@id='story']")).getText();
		//System.out.println(st1);
		
		File file = new File("C:\\Users\\Iftekher\\Desktop\\nytimesproject.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		bw.write(st1);
		bw.close();
//		BufferedReader r = new BufferedReader(new FileReader(file));
//		
//		boolean b = false;
//		String st;
//		while((st = r.readLine())!=null)
//
//		{
//			if(st.contains("Trump")) {
//				System.out.println("The word Trump is here");
//				b = true;
//				break;	
//			}
//
//				
//			}
//		if(b!= true)
//		System.out.println("The word Trump is not here");
}
	
}
