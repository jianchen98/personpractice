package com.chen.desigemode_observe;

import java.util.ArrayList;
import java.util.List;

public class Subject implements Isubject {
    List<Iwatcher> list = new ArrayList<Iwatcher>();
	@Override
	public void add(Iwatcher watcher) {
		// TODO Auto-generated method stub
		list.add(watcher);
	}

	@Override
	public void remove(Iwatcher watcher) {
		// TODO Auto-generated method stub
		list.remove(watcher);
	}

	@Override
	public void nofify(String str) {
		for(Iwatcher watcher:list){
			watcher.update(str);
		}
		
	}

	
}
