package main;


import controller.Controller;
import view.GUI;
import model.PrimeNumbers;


//creating instances of my classes and initializing them to main class
public class Main {

	public static void main(String[] args) {
	
		GUI view = new GUI();
		PrimeNumbers model = new PrimeNumbers();
		Controller controller = new Controller(model, view);
		controller.primeHandler(2, 1000);

	}
}
