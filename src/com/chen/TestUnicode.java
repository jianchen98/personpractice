package com.chen;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class TestUnicode {
	public static void main(String[] args) throws IOException {
		String str = "\u201c\u201d"; //然后这么写

        System.out.println(str);     //成功输出了""
        
        //"你好"的GBK编码数据
        byte[] gbkData = {(byte)0xc4, (byte)0xe3, (byte)0xba, (byte)0xc3};
        //"你好"的BIG5编码数据
        byte[] big5Data = {(byte)0xa7, (byte)0x41, (byte)0xa6, (byte)0x6e};

        //构造String，解码为Unicode

        String strFromGBK="";
        String strFromBig5="";
		try {
			strFromGBK = new String(gbkData, "GBK");
			strFromBig5 = new String(big5Data, "BIG5");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //分别输出Unicode序列
//        System.out.println("\u4f60\u597d");
        
        //字符串"你好"
        String strs = "\u4f60\u597d";
        //转换到各种编码
    //    showunicode(strFromGBK);
   //     showunicode(strFromBig5);
        
        showbytes(strs,"UTF-8");
        showbytes(strs,"GBK");

    }
	public static void showunicode(String str){
		for (int i =0;i<str.length();i++){
			System.out.printf("\\u%x",(int)str.charAt(i));
		}
	    System.out.println();
	}
	
	public static void showbytes(String str,String charset){
		try {
			for(Byte b:str.getBytes(charset)){
				System.out.printf("0x%x ",b);
			}
		    System.out.println();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
}
