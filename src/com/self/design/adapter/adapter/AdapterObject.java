package com.self.design.adapter.adapter;

import com.self.design.adapter.source.Source;

/**
 * �����������ģʽ
 * ����˼·�����������ģʽ��ͬ��ֻ�ǽ�Adapter�����޸ģ���β��̳�Source�࣬
 * ���ǳ���Source���ʵ�����Դﵽ��������Ե�����
 * @author binbin
 *
 */
public class AdapterObject {

	private Source source;
	
	public AdapterObject(Source source){
		super();
		this.source = source;
	}

	public void method2(){
		System.out.println("this is the targetable method!");
	}
	
	public void method1(){
		source.method1();
	}
	
}
