package com.self.design.singleton;

/**
 * @author bin-perhaps
 * ͬ����������������ÿ������getInstance����Ѷ��������������ܾͻ�Ӱ�졣�����������ģʽҲ�����⡣
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
