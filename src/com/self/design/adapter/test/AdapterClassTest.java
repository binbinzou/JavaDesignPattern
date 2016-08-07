package com.self.design.adapter.test;

import com.self.design.adapter.adapter.AdapterClass;
import com.self.design.adapter.interfaces.Targetable;
/**
 * 类适配器
 * 核心思想就是：有一个Source类，拥有一个方法，待适配，目标接口时Targetable，
 * 通过Adapter类，将Source的功能扩展到Targetable里
 * @author binbin
 *
 */
public class AdapterClassTest {		

	public static void main(String[] args) {
		Targetable targetable = new AdapterClass();
		targetable.method1();
		targetable.method2();
	}
	
}
