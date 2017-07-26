package com.chen.desigemode_observe;

public class Watcher implements Iwatcher {
   private String watcher_name ="";
	
	public Watcher(String name) {
		super();
		this.watcher_name = name;
	}

	@Override
	public void update(String str) {
		System.out.println(this.watcher_name+":有报纸更新了");
		
	}
	

}
