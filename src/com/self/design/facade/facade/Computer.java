package com.self.design.facade.facade;

import com.self.design.facade.interfaces.Component;

/**
 * 外观模式是为了解决类与类之家的依赖关系的，像spring一样，可以将类和类之间的关系配置到配置文件中，
 * 而外观模式就是将他们的关系放在一个Facade类中，降低了类类之间的耦合度，该模式中没有涉及到接口
 * @author binbin
 */
public class Computer implements Component {

	private Cpu cpu;
	private Memory memory;
	private Disk disk;
	
	public Computer(){
		cpu = new Cpu();
		memory = new Memory();
		disk = new Disk();
	}
	
	@Override
	public void startup() {
		System.out.println("start the computer!");  
        cpu.startup();  
        memory.startup();  
        disk.startup();  
        System.out.println("start computer finished!");  
	}

	@Override
	public void shutdown() {
		System.out.println("begin to close the computer!");  
        cpu.shutdown();  
        memory.shutdown();  
        disk.shutdown();  
        System.out.println("computer closed!");  
	}

}
