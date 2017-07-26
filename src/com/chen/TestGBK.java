package com.chen;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestGBK {
	public static void main(String[] args) {
		RandomAccessFile raf;
		try {
			raf = new RandomAccessFile("D://1.txt","r");
//			System.out.print(raf.readLine());
			System.out.println(new String(raf.readLine().getBytes("ISO-8859-1"), "GBK"));
//			System.out.println(new String(raf.readLine().getBytes(), "UTF-8"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		}
		  catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		
		
 }
}
