package com.self.design.adapter.test;

import com.self.design.adapter.adapter.AdapterClass;
import com.self.design.adapter.interfaces.Targetable;
/**
 * ��������
 * ����˼����ǣ���һ��Source�࣬ӵ��һ�������������䣬Ŀ��ӿ�ʱTargetable��
 * ͨ��Adapter�࣬��Source�Ĺ�����չ��Targetable��
 * @author binbin
 *
 */
public class AdapterClassTest {		

	public static void main(String[] args) {
		Targetable targetable = new AdapterClass();
		targetable.method1();
		targetable.method2();
	}
	
}
