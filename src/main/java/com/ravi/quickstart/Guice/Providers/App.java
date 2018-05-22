package com.ravi.quickstart.Guice.Providers;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Injector injector = Guice.createInjector(new GumModule());
		GumballMachine m = injector.getInstance(GumballMachine.class);
		System.out.println(m.dispense());
		System.out.println(m.dispense());
		
		injector = Guice.createInjector(new ConcertModule());
		ConcertHall hall = injector.getInstance(ConcertHall.class);
		System.out.println(hall.getConcertHallSpecs());
	}

}
