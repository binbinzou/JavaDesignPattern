package com.self.design.adapter.test;

import com.self.design.adapter.interfaces.Sourceable;
import com.self.design.adapter.source.SourceSub1;
import com.self.design.adapter.source.SourceSub2;

/**
 * �ӿڵ�������ģʽ
 * ��ʱ����д��һ���ӿ����ж�����󷽷���������д�ýӿڵ�ʵ����ʱ������ʵ�ָýӿڵ����з�����
 * ��������ʱ�Ƚ��˷ѣ���Ϊ���������еķ�������������Ҫ�ģ���ʱֻ��ҪĳһЩ���˴�Ϊ�˽��������⣬
 * ���������˽ӿڵ�������ģʽ��������һ�������࣬�ó�����ʵ���˸ýӿڣ�ʵ�������еķ�����
 * �����ǲ���ԭʼ�Ľӿڴ򽻵���ֻ�͸ó�����ȡ����ϵ����������дһ���࣬�̳иó����࣬��д������Ҫ�ķ������С�
 * @author binbin
 */
public class AdapterInterfaceTest {

	public static void main(String[] args) {
		Sourceable source = new SourceSub1();
		Sourceable source1 = new SourceSub2();
		source.method1();
		source.method2();
		source1.method1();
		source1.method2();
	}
}
