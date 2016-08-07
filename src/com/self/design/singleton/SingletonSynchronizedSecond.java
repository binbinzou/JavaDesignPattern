package com.self.design.singleton;

/**
 * @author bin-perhaps
 * ͬ�����������˲��ȣ����ȵķ�����ֻ�е�һ��Ϊnull��ʱ�����������������ǻ��������
 * ��A��B�߳�ͬʱ����null==�Ĵ���顣��A�߳����Ƚ���instance=new���򡣵���JVM�и�ֵ������new����Ĳ���
 * �Ƿֿ����еġ����ܵĽ�������ȸ���������ڴ�ռ䣬Ȼ����ֵ��instance�����Ǵ�ʱ��û��ʵ�����������Դ�ʱinstance��û�б�ʵ����
 * ����ʱA����synchronized����顣B�����˴���飬��ʱinstance�����ǿ�ֻ��ָ��Ķ��������ٽ�����������ʱ����ܾͻ��������
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
