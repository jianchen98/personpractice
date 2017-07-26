package com.chen.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class TestFileWriter {
	public static void main(String[] args) {
		File f  = new File("d:"+File.separator+"aa.txt");
		String  str="jlgjaljgla file writer";
		try {
			FileWriter fout = new FileWriter(f);
			fout.write(str);
			fout.flush();//强制刷新缓冲区
		    fout.close();//对于字符流，是面向缓冲区的 如果不进行关闭，则文件内容为空
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
