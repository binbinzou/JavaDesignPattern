package com.self.design.singleton;

/**
 * @author bin-perhaps
 * ʹ���ڲ��ഴ������������ֻ�������ʼ����ʱ�򴴽�һ�Ρ��������ʼ����ʱ����ع������߳��ǻ���ġ����Բ�������̲߳���ȫ
 * �����������ֻ�ᴴ��һ�Σ�������������Ҳ�õ��˽����
 */
public class SingletonInnerClass {

	private SingletonInnerClass(){
		
	}
	
	/* �˴�ʹ��һ���ڲ�����ά������ */  
	private static class SingletonFactory {  
        private static SingletonInnerClass instance = new SingletonInnerClass();  
    }  

	public static SingletonInnerClass getInstance() {
		return SingletonFactory.instance;
	}
	
	/* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */  
	public Object readResolve() {  
	    return getInstance();  
	}  

	
}
