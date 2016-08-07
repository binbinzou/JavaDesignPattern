package com.self.design.factoryMethod.factory;

import com.self.design.factoryMethod.service.MailSender;
import com.self.design.factoryMethod.service.Sender;
import com.self.design.factoryMethod.service.SmsSender;

public class SendFactoryMoreMethod {

	public Sender produceSms(){
		System.out.println("create smsSender by more method");
		return new SmsSender();
	}
	
	public Sender produceMail(){
		System.out.println("create mailSender by more method");
		return new MailSender();
	}
	
}
