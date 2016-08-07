package com.self.design.facade.facade;

import com.self.design.facade.interfaces.Component;

/**
 * ���ģʽ��Ϊ�˽��������֮�ҵ�������ϵ�ģ���springһ�������Խ������֮��Ĺ�ϵ���õ������ļ��У�
 * �����ģʽ���ǽ����ǵĹ�ϵ����һ��Facade���У�����������֮�����϶ȣ���ģʽ��û���漰���ӿ�
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
