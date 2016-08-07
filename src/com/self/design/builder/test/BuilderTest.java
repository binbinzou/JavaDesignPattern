package com.self.design.builder.test;

import com.self.design.builder.builder.Builder;

public class BuilderTest {

	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.produceMailSender(10);
	}
	
}
