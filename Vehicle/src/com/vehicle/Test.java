
package com.vehicle;

/**
 * @author Pooja Karnik Program to override method
 *
 */
//Test class to check method overriding 
class Test {

	// creating parent and derived class objects and calling start method
	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		vehicle.start();

		FourWheeler fourWheeler = new FourWheeler();
		fourWheeler.start();
	}
}
