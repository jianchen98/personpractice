package com.chen.stackoverflow;

public class TestOpertation {
 public static void main(String[] args) {
	int i =5;
	double  j=8.0;;
	System.out.println("A��="+(i+j));
	//i = i+j; ���ܱ���ͨ����Ϊi+j��double���͵ģ������Զ�����ת�������������������Ҫǿ��ת��double->int
	i+=j;//ʵ��ִ�е���  i=i+(int)j;
	System.out.println("B:="+i);//�൱�ڶ�j����ǿ��ת��
}
}
