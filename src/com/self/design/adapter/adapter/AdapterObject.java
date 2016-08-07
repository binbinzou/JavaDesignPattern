package com.self.design.adapter.adapter;

import com.self.design.adapter.source.Source;

/**
 * 对象的适配器模式
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，
 * 而是持有Source类的实例，以达到解决兼容性的问题
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
