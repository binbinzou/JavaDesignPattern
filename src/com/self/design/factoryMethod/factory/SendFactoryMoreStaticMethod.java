package com.self.design.factoryMethod.factory;

import com.self.design.factoryMethod.service.MailSender;
import com.self.design.factoryMethod.service.Sender;
import com.self.design.factoryMethod.service.SmsSender;

/**
 * @author bin-perhaps
 * ��̬����������������Ǿ�̬�����ķ�����ֱ�����������á�
 */
public class SendFactoryMoreStaticMethod {

	public static Sender produceSms(){
		System.out.println("create SmsSender by a static method");
		return new SmsSender();
	}
	
	public static Sender produceMail(){
		System.out.println("create MailSender by a static method");
		return new MailSender();
	}
	
}
