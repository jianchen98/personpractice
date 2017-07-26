package com.chen.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class TestFileInputStream {
	public static void main(String[] args) {
//		File f  = new File("d:"+File.separator+"aa.txt");
		String finename = "d:"+File.separator+"aa.txt";
//		TestFileInputStream.readFileBychar(finename);
		readFileBycharLine(finename);
	}
	
	/**
	 * 通过字节读取
	 * @param filename
	 */
	public static void readFileBybytes(String filename){
		File f  = new File(filename);
		FileInputStream input = null;
		try {
			 input = new FileInputStream(f);
			 byte[] b  = new 	byte[(int)f.length()];//直接用文件的长度，防止浪费
			  while(input.read(b)!=-1){
				System.out.println(new String(b));  
			  }
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			if(input!=null){
				try {
					input.close();//输入输出流 记得关闭
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
	/**
	 * 通过字符读取 
	 * 单个字符读取
	 */
	public static void readFileBychar(String filename){
		File f  = new File(filename);
		Reader reader = null;
		char [] tempchars = new char[(int)f.length()];
		try {
			reader = new InputStreamReader(new FileInputStream(f));//这句代码做了两步操作  一、创建了一个字节读取  二、把字节流转换位字符流
			int  temp;
			try {
				while ((temp=reader.read(tempchars))!=-1){
					System.out.println(tempchars);
//					System.out.println(new String(tempchars));
				}
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 通过字符读取 
	 * 一次读取一行
	 */
	public static void readFileBycharLine(String filename){
		File f  = new File(filename);
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(f));//
			String  tempstr;
			try {
				while ((tempstr=reader.readLine())!=null){
					System.out.println(tempstr);
//					System.out.println(new String(tempchars));
				}
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
