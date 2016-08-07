package com.self.design.adapter.adapter;

import com.self.design.adapter.interfaces.Targetable;
import com.self.design.adapter.source.Source;
/**
 * 类适配器
 * 核心思想就是：有一个Source类，拥有一个方法，待适配，目标接口时Targetable，
 * 通过Adapter类，将Source的功能扩展到Targetable里
 * @author binbin
 *
 * 类的适配器模式：当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，
 * 创建一个新类，继承原有的类，实现新的接口即可。
 */
public class AdapterClass extends Source implements Targetable{

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}

}
