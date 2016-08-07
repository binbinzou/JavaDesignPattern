package com.self.design.singleton;

/**
 * @author bin-perhaps
 * ������ĵ����������̲߳���ȫ��
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
