package com.self.design.adapter.test;

import com.self.design.adapter.adapter.AdapterObject;
import com.self.design.adapter.interfaces.Targetable;
import com.self.design.adapter.source.Source;

/**
 * 
 * @author binbin
 *
 */
public class AdapterObjectTest {

	public static void main(String[] args) {
		Source source = new Source();
		AdapterObject adapter =  new AdapterObject(source);
		adapter.method1();
		adapter.method2();
		
	}
	
}
