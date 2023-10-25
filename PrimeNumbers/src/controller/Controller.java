package controller;

import model.PrimeNumbers;
import view.GUI;

public class Controller {
	
	private PrimeNumbers model;
	private GUI view;
	
	
	public Controller(PrimeNumbers model, GUI view) {
		this.model = model;
		this.view = view;
	}
	
	/*
	 * This method calls the model to generate prime numbers between a start and stop value.
	Then it retrieves prime numbers and the count of prime numbers and display them on the view.
	 */
	public void primeHandler(int start, int stop) {
		
		model.showPrimes(start, stop);
		
		String primes = model.getPrimes();
		int primeCount = model.getPrimeNumbersAmount();
		
		view.displayPrimeNumbers(primes);
		view.displayPrimeAmount(primeCount);
		
	}	
	
	
	
}
