package com.ravi.quickstart.Guice;

import com.google.inject.Inject;

public class Chef {
	
	private final FortuneService fortuneService;
	
	@Inject
	public  Chef(@Mega FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public void makeFortuneCookie() {
		fortuneService.randomFortune();
	}

}
