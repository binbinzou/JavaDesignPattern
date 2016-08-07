package com.self.design.decorator.decorator;

import com.self.design.decorator.interfaces.Sourceable;

public class Source implements Sourceable{

	@Override
	public void method() {
		 System.out.println("the original method!");  
	}

}
