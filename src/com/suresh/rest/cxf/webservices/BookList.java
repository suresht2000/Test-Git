package com.suresh.rest.cxf.webservices;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BookList {
	private List<BookVO> bookList;

	public List<BookVO> getBookList() {
		if (bookList == null) {
			bookList = new ArrayList<BookVO>();
		}
		return bookList;
	}

	public void setBookList(List<BookVO> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public static void main(String args[]){
		System.out.println("Git installed Successfully");
	}
	
	public class GMailTest {
		public static void main(String args []) throws AWTException{
			WebDriver driver= new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.google.com/intl/en/mail/help/about.html");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("gmail-sign-in")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.id("Email")).sendKeys("avinasht011");		
			driver.findElement(By.id("next")).click();
			driver.findElement(By.id("Passwd")).sendKeys("Hello@123$");	
			driver.findElement(By.id("signIn")).click();	
			driver.findElement(By.id(":j2")).click();
			driver.findElement(By.id(":j5")).click();
			driver.findElement(By.id(":j1")).click();
			driver.findElement(By.id(":3g")).click();
			
			}

	}

}
