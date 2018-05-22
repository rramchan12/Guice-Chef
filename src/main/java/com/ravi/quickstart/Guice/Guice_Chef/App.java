package com.ravi.quickstart.Guice.Guice_Chef;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.ravi.quickstart.Guice.Chef;
import com.ravi.quickstart.Guice.ChefModule;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Injector i = Guice.createInjector(new ChefModule());
        Chef chef = i.getInstance(Chef.class);
        chef.makeFortuneCookie();
    }
}