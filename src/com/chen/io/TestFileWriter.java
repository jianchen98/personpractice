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
			fout.flush();//ǿ��ˢ�»�����
		    fout.close();//�����ַ����������򻺳����� ��������йرգ����ļ�����Ϊ��
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
