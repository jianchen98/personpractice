package com.chen.desigemode_observe;

public interface Isubject {
    public void add(Iwatcher watcher);
	
	public void remove(Iwatcher watcher);
	
	public void nofify(String str);
}
