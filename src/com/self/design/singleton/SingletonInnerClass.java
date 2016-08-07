package com.self.design.singleton;

/**
 * @author bin-perhaps
 * 使用内部类创建单例。单例只会在类初始化的时候创建一次。而在类初始化的时候加载过程中线程是互斥的。所以不会出现线程不安全
 * 的情况。而且只会创建一次，所以性能问题也得到了解决。
 */
public class SingletonInnerClass {

	private SingletonInnerClass(){
		
	}
	
	/* 此处使用一个内部类来维护单例 */  
	private static class SingletonFactory {  
        private static SingletonInnerClass instance = new SingletonInnerClass();  
    }  

	public static SingletonInnerClass getInstance() {
		return SingletonFactory.instance;
	}
	
	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
	public Object readResolve() {  
	    return getInstance();  
	}  

	
}
