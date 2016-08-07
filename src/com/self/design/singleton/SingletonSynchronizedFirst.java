package com.self.design.singleton;

/**
 * @author bin-perhaps
 * 同步加锁。但是这样每个调用getInstance都会把对象锁起来。性能就会影响。所以这个单例模式也有问题。
 */
public class SingletonSynchronizedFirst {

	private static SingletonSynchronizedFirst instance = null;
	
	private SingletonSynchronizedFirst(){
		
	}
	
	public static synchronized SingletonSynchronizedFirst getInstance(){
		if(null == instance){
			instance = new SingletonSynchronizedFirst();
		}
		return instance;
	}
	
}
