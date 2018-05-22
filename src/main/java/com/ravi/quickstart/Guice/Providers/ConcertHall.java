package com.ravi.quickstart.Guice.Providers;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class ConcertHall {

	@Inject @Named("capacity")
	private int capacity;

	@Inject @Named("seating")
	private Seating seating;
	
	@Inject @Named("stage")
	private Class<?> stageType;
	
	public String getConcertHallSpecs() {
		return String.format("%s[capacity =%s, stageType=%s, seating=%s]", getClass().getName(), capacity, stageType, seating);
	}
	
	public enum Seating{
		INDOOR, OUTDOOR;
	}
	
	

}
