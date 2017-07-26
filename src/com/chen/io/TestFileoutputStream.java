package com.chen.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestFileoutputStream {
	public static void main(String[] args) {
		File f  = new File("d:"+File.separator+"aa.txt");
		String  str="hello world";
		try {
			OutputStream fout = new FileOutputStream(f,true);//相同字符追加
			fout.write(str.getBytes());//因为是字节流，所以要转行成数组输出
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
