package com.self.design.proxy.proxy;

import com.self.design.proxy.interfaces.Sourceable;

/**
 * ������еķ�����ʹ�õ�ʱ����Ҫ��ԭ�еķ������иĽ�����ʱ�����ְ취��
	1���޸�ԭ�еķ�������Ӧ������Υ���ˡ�����չ���ţ����޸Ĺرա���ԭ��
	2�����ǲ���һ�����������ԭ�еķ������ҶԲ����Ľ�����п��ơ����ַ������Ǵ���ģʽ��
	ʹ�ô���ģʽ�����Խ����ܻ��ֵĸ��������������ں���ά����
 * @author binbin
 *
 */
public class Proxy implements Sourceable {

	private Source source;
	
	public Proxy(){
		super();
		this.source = new Source();
	}
	
	@Override
	public void method() {
		before();
		source.method();
		after();
	}

	private void after() {
		System.out.println("after proxy!");
	}

	private void before() {
		System.out.println("before proxy!");
	}

}
