package com.ravi.quickstart.Guice.Providers;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class ConcertModule extends AbstractModule{
	
	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		bindConstant().annotatedWith(Names.named("capacity")).to(500);
		bindConstant().annotatedWith(Names.named("seating")).to("INDOOR");
		bindConstant().annotatedWith(Names.named("stage")).to("com.ravi.quickstart.Guice.Providers.BigStage");
		
	}

}
