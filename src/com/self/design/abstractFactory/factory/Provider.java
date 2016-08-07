package com.self.design.abstractFactory.factory;

import com.self.design.abstractFactory.service.Sender;

public interface Provider {
	Sender produce();
}
