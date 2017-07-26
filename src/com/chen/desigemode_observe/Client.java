package com.chen.desigemode_observe;

public class Client {
	public static void main(String[] args) {
		Iwatcher watcherA = new Watcher("¡ı±∏");
		Iwatcher watcherB = new Watcher("πÿ”");
		Iwatcher watcherC = new Watcher("’≈∑…");
		Subject sub = new Subject();
		sub.add(watcherA);
		sub.add(watcherB);
		sub.add(watcherC);
		sub.nofify("fajgaljga");
		
		
	}
}
