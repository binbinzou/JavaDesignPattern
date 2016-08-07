package com.self.design.abstractFactory.service;

public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("it is mail send method");
	}

}
