package com.self.design.proxy.test;

import com.self.design.proxy.interfaces.Sourceable;
import com.self.design.proxy.proxy.Proxy;

public class ProxyTest {

	public static void main(String[] args) {
		Sourceable source = new Proxy();
		source.method();
	}
	
}
