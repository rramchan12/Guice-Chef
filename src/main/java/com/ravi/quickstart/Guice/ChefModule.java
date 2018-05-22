package com.ravi.quickstart.Guice;

import com.google.inject.AbstractModule;

/**
 * @author r0r00i9
 *
 */
public class ChefModule extends AbstractModule{
	
	
	
	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		bind(FortuneService.class).to(FortuneServiceImpl.class);
		bind(FortuneService.class).annotatedWith(Mega.class).to(MegaFortuneService.class);
	}

}
