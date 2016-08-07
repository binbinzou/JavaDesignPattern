package com.self.design.decorator.decorator;

import com.self.design.decorator.interfaces.Sourceable;

/**
 * װ����ģʽ��Ӧ�ó�����
   1����Ҫ��չһ����Ĺ��ܡ�
   2����̬��Ϊһ���������ӹ��ܣ����һ��ܶ�̬���������̳в���������һ�㣬�̳еĹ����Ǿ�̬�ģ����ܶ�̬��ɾ����
        ȱ�㣺�����������ƵĶ��󣬲����Ŵ�
 * @author binbin
 *
 *
 * ��aop�������Ƿ���aop�Ļ���
 */
public class Decorator implements Sourceable {

	private Sourceable source;
	
	public Decorator(Sourceable sourceable){
		super();
		this.source = sourceable;
	}
	
	@Override
	public void method() {
		System.out.println("before decorator!");
		source.method();
		System.out.println("after decorator!");
	}

}
