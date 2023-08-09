package org.tnsif.interfacedemo;

/*Functional interface :
 * An interface which contain an exactly one abstract method then thet interface is known as functional
 * interface*/

/* below annotation ensures that we have to use
 * exactly one abstract method inside an interface*/

@FunctionalInterface 
public interface PopCorn {
	//abstract method
	void displayReceipe();
	//void display();
}
