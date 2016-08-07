package com.self.design.abstractFactory.service;

public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("it is sms send method");
	}

}
