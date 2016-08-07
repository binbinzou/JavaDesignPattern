package com.self.design.facade.facade;

import com.self.design.facade.interfaces.Component;

public class Disk implements Component {

	@Override
	public void startup() {
		 System.out.println("disk startup!");  
	}

	@Override
	public void shutdown() {
		System.out.println("disk shutdown!");  
	}

}
