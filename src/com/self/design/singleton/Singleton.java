package com.self.design.singleton;

/**
 * @author bin-perhaps
 * 最基本的单例。但是线程不安全。
 */
public class Singleton {

	private static Singleton instance = null;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(null == instance){
			instance = new Singleton();
		}
		return instance;
	}
	
	
	
}
