package com.self.design.builder.builder;

import java.util.ArrayList;
import java.util.List;

import com.self.design.builder.service.Sender;
import com.self.design.builder.service.MailSender;
import com.self.design.builder.service.SmsSender;

/**
 * @author bin-perhaps
 *	工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，
 *	用来创建复合对象，所谓复合对象就是指某个类具有不同的属性，
 */
public class Builder {

	private List<Sender> senders = new ArrayList<Sender>();
	
	public void produceMailSender(int count){
		for(int i = 0;i < count ; i++){
			senders.add(new MailSender());
		}
	}
	
	public void produceSmsSender(int count){
		for(int i = 0;i < count ; i++){
			senders.add(new SmsSender());
		}
	}
	
}
