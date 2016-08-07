package com.self.design.factoryMethod.factory;

import com.self.design.factoryMethod.service.MailSender;
import com.self.design.factoryMethod.service.Sender;
import com.self.design.factoryMethod.service.SmsSender;

/**
 * @author bin-perhaps
 * 静态工厂，里面包含的是静态工厂的方法。直接用类名调用。
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
