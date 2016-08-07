package com.self.design.factoryMethod.factory;

import com.self.design.factoryMethod.service.MailSender;
import com.self.design.factoryMethod.service.Sender;
import com.self.design.factoryMethod.service.SmsSender;

/**
 * @author bin-perhaps
 * �����࣬ӵ�д�����Ӧ��ʵ���෽����
 */
public class SendFactory {

	public Sender produce(String type){
		if("mail".equals(type)){
			System.out.println("create the mail sender");
			return new MailSender();
		}else if("sms".equals(type)){
			System.out.println("create the sms sender");
			return new SmsSender();
		}else{
			System.out.println("this is no sender ");
			return null;
		}
	}
	
}
