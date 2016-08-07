package com.self.design.singleton;

/**
 * @author bin-perhaps
 * 同步加锁进行了补救，补救的方法是只有第一次为null的时候加锁。但是这个还是会出现问题
 * 如A和B线程同时进入null==的代码块。而A线程首先进入instance=new程序。但是JVM中赋值操作和new对象的操作
 * 是分开进行的。可能的结果就是先给对象分配内存空间，然互赋值给instance。但是此时并没有实例化对象。所以此时instance是没有被实例化
 * 而这时A解锁synchronized代码块。B进入了代码块，此时instance并不是空只是指向的对象，所以再进行其他操作时候可能就会出现问题
 */
public class SingletonSynchronizedSecond {

	private static SingletonSynchronizedSecond instance = null;
	
	private SingletonSynchronizedSecond(){
		
	}
	
	public static synchronized SingletonSynchronizedSecond getInstance(){
		if(null == instance){
			synchronized (instance) {
				if(null == instance){
					instance = new SingletonSynchronizedSecond();
				}
			}
		}
		return instance;
	}
	
}
