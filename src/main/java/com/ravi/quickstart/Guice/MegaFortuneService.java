package com.ravi.quickstart.Guice;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MegaFortuneService implements FortuneService {

	
	private static final List<FortuneService> SERVICES = 
		Arrays.<FortuneService>asList(
				  new FunnyFortuneService(),
				  new QuoteFortuneService()
				);
		
	
	public void randomFortune() {
		// TODO Auto-generated method stub
		int index = new Random().nextInt(SERVICES.size());
		SERVICES.get(index).randomFortune();

	}

}
