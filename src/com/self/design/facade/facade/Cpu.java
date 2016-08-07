package com.self.design.facade.facade;

import com.self.design.facade.interfaces.Component;

public class Cpu implements Component{

	@Override
	public void startup() {
		System.out.println("cpu startup!");  
	}

	@Override
	public void shutdown() {
		System.out.println("cpu shutdown!");  
	}

}
