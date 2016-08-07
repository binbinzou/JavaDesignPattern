package com.self.design.proxy.proxy;

import com.self.design.proxy.interfaces.Sourceable;

public class Source implements Sourceable {

	@Override
	public void method() {
	   System.out.println("the original method!");  
	}

}
