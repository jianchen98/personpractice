package com.chen.stackoverflow;

public class TestOpertation {
 public static void main(String[] args) {
	int i =5;
	double  j=8.0;;
	System.out.println("A：="+(i+j));
	//i = i+j; 不能编译通过因为i+j是double类型的，不会自动类型转换，高类型向低类型需要强行转换double->int
	i+=j;//实际执行的是  i=i+(int)j;
	System.out.println("B:="+i);//相当于对j做了强制转换
}
}
