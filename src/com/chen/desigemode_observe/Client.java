package com.chen.desigemode_observe;

public class Client {
	public static void main(String[] args) {
		Iwatcher watcherA = new Watcher("����");
		Iwatcher watcherB = new Watcher("����");
		Iwatcher watcherC = new Watcher("�ŷ�");
		Subject sub = new Subject();
		sub.add(watcherA);
		sub.add(watcherB);
		sub.add(watcherC);
		sub.nofify("fajgaljga");
		
		
	}
}
