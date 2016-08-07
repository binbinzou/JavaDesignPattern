package com.self.design.facade.facade;

import com.self.design.facade.interfaces.Component;

public class Memory implements Component {

	@Override
	public void startup() {
		 System.out.println("memory startup!");  
	}

	@Override
	public void shutdown() {
		System.out.println("memory shutdown!"); 
	}

}
