package com.self.design.abstractFactory.test;

import com.self.design.abstractFactory.factory.Provider;
import com.self.design.abstractFactory.factory.SendMailFactory;
import com.self.design.abstractFactory.factory.SendSmsFactory;
import com.self.design.abstractFactory.service.Sender;

public class TestAbstractFactory {

	public static void main(String[] args) {
		System.out.println("test abstractFactory begin....");
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.send();
		
		Provider provider2 = new SendSmsFactory();
		Sender sender2 = provider2.produce();
		sender2.send();
	}
	
}
