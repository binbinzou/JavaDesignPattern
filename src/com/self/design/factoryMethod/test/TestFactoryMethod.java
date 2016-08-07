package com.self.design.factoryMethod.test;

import com.self.design.factoryMethod.factory.SendFactory;
import com.self.design.factoryMethod.factory.SendFactoryMoreMethod;
import com.self.design.factoryMethod.factory.SendFactoryMoreStaticMethod;
import com.self.design.factoryMethod.service.Sender;

public class TestFactoryMethod {

	public static void main(String[] args) {
		/**
		 * test SendFactory
		 */
		System.out.println("test SendFactory begin.....");
		SendFactory factory = new SendFactory();
		Sender sender = factory.produce("sms");
		sender.send();
		
		/**
		 * test SendFactoryMoreMethod 
		 */
		System.out.println("test SendFactoryMoreMethod begin.....");
		SendFactoryMoreMethod factoryMoreMethod = new SendFactoryMoreMethod();
		Sender sender2 = factoryMoreMethod.produceMail();
		sender2.send();
		
		/**
		 * test SendFactoryMoreStaticMethod
		 */
		System.out.println("test SendFactoryMoreStaticMethod begin....");
		Sender sender3 = SendFactoryMoreStaticMethod.produceSms();
		sender3.send();
	}
	
}
