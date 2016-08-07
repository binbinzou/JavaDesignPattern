package com.self.design.adapter.adapter;

import com.self.design.adapter.interfaces.Targetable;
import com.self.design.adapter.source.Source;
/**
 * ��������
 * ����˼����ǣ���һ��Source�࣬ӵ��һ�������������䣬Ŀ��ӿ�ʱTargetable��
 * ͨ��Adapter�࣬��Source�Ĺ�����չ��Targetable��
 * @author binbin
 *
 * ���������ģʽ����ϣ����һ����ת����������һ���½ӿڵ���ʱ������ʹ�����������ģʽ��
 * ����һ�����࣬�̳�ԭ�е��࣬ʵ���µĽӿڼ��ɡ�
 */
public class AdapterClass extends Source implements Targetable{

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}

}
