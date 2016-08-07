package com.self.design.builder.builder;

import java.util.ArrayList;
import java.util.List;

import com.self.design.builder.service.Sender;
import com.self.design.builder.service.MailSender;
import com.self.design.builder.service.SmsSender;

/**
 * @author bin-perhaps
 *	������ģʽ�ṩ���Ǵ����������ģʽ����������ģʽ���ǽ����ֲ�Ʒ�����������й���
 *	�����������϶�����ν���϶������ָĳ������в�ͬ�����ԣ�
 */
public class Builder {

	private List<Sender> senders = new ArrayList<Sender>();
	
	public void produceMailSender(int count){
		for(int i = 0;i < count ; i++){
			senders.add(new MailSender());
		}
	}
	
	public void produceSmsSender(int count){
		for(int i = 0;i < count ; i++){
			senders.add(new SmsSender());
		}
	}
	
}
