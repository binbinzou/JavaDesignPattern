package com.self.design.abstractFactory.factory;

import com.self.design.abstractFactory.service.MailSender;
import com.self.design.abstractFactory.service.Sender;

public class SendMailFactory implements Provider{

	@Override
	public Sender produce() {
		System.out.println("return MailSender");
		return new MailSender();
	}

	
	
}
