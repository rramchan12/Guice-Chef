package com.ravi.quickstart.Guice.Providers;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class GumballMachine {
	
	@Inject
	private Provider<Gum> gumProvider;
	
	Gum gum;
	
	@Inject
	//public GumballMachine(Gum gum) {
	//	this.gum = gum;
	//}
	
	public Gum dispense() {
		return gumProvider.get();
		//return gum;
	}

}
