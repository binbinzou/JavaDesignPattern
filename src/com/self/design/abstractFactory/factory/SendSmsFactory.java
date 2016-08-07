package com.self.design.abstractFactory.factory;

import com.self.design.abstractFactory.service.Sender;
import com.self.design.abstractFactory.service.SmsSender;

public class SendSmsFactory implements Provider {

	@Override
	public Sender produce() {
		System.out.println("return SmsSender");
		return new SmsSender();
	}

}
