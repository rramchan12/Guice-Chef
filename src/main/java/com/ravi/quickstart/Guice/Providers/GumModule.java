package com.ravi.quickstart.Guice.Providers;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class GumModule extends AbstractModule {
	
	protected void configure() {
		
        bind(Gum.class).toProvider(GumProvider.class);
	    //bind(Gum.class).to(GumballMachine.class);
	}
	
//	@Provides 
//	Gum provideGum() {
//		return new Gum();
//	}
	

}
