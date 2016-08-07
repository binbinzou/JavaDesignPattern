package com.self.design.decorator.test;

import com.self.design.decorator.decorator.Decorator;
import com.self.design.decorator.decorator.Source;
import com.self.design.decorator.interfaces.Sourceable;

public class DecoratorTest {

	public static void main(String[] args) {
		Source source = new Source();
		Sourceable obj = new Decorator(source);
		obj.method();
	}
	
}
