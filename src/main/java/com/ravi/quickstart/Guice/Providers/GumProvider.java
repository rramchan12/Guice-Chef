package com.ravi.quickstart.Guice.Providers;

import com.google.inject.Provider;

public class GumProvider implements Provider<Gum> {

	public Gum get() {
		return new Gum();
	}
}
