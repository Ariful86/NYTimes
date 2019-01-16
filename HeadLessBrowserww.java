package com.bit.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

import org.openqa.selenium.WebDriver;

public class HeadLessBrowserww {
public static void main(String[] args) throws IOException {
	
	File filetext = new File("C:\\Users\\Iftekher\\Desktop\\1234abcd.txt");
	filetext.createNewFile();
	
	Writer bfw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filetext)));
	bfw.write("My name is Iftekher" + "\n");
	bfw.write("I live in the Bronx" + "\n");
	bfw.write("Today is Tuesday");
	bfw.close();
	
	BufferedReader br = new BufferedReader(new FileReader(filetext));
		
	String st;
	while((st=br.readLine()) !=null){
		System.out.println(st);
	}
}
}
