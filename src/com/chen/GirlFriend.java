package com.chen;

public class GirlFriend<T> {
		private T t;

		public T getGIT() {
			return t;
		}

		//���㲻ȷ��Ů���Ѹ�����ʲô��ʱ�򣬴�ʱʹ�÷���
		public void buyGit(T t){
			this.t = t;
		}
		
}


class Shit{
	String name ;
	public Shit(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}	
	class Flower{
		String name="ĵ��" ;
		int width = 200;
		public Flower() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Flower(String name) {
			super();
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getWidth() {
			return width;
		}
		public void setWidth(int width) {
			this.width = width;
		}
		
	
}
