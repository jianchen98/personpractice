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
	 * ͨ���ֽڶ�ȡ
	 * @param filename
	 */
	public static void readFileBybytes(String filename){
		File f  = new File(filename);
		FileInputStream input = null;
		try {
			 input = new FileInputStream(f);
			 byte[] b  = new 	byte[(int)f.length()];//ֱ�����ļ��ĳ��ȣ���ֹ�˷�
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
					input.close();//��������� �ǵùر�
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
	/**
	 * ͨ���ַ���ȡ 
	 * �����ַ���ȡ
	 */
	public static void readFileBychar(String filename){
		File f  = new File(filename);
		Reader reader = null;
		char [] tempchars = new char[(int)f.length()];
		try {
			reader = new InputStreamReader(new FileInputStream(f));//������������������  һ��������һ���ֽڶ�ȡ  �������ֽ���ת��λ�ַ���
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
	 * ͨ���ַ���ȡ 
	 * һ�ζ�ȡһ��
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
