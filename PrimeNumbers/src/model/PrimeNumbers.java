package model;

public class PrimeNumbers {

	private int primeAmount = 0;
	private int count = 2;
	private StringBuilder primeList = new StringBuilder();
	
	
	// This method generates prime numbers in a recursive function

	public void showPrimes(int start, int stop) {

		if (start >= stop) {
			return;
		}

		boolean prime = true;

		prime = isPrime(start++, count, prime);
		if (prime) {
			System.out.println(start - 1);
			primeList.append(start - 1).append(" , ");
			primeAmount++;
		}

		showPrimes(start, stop);

	}

	public int getPrimeNumbersAmount() {
		return primeAmount;
	}

	public String getPrimes() {
		return primeList.toString();
	}
	
	// This method checks if a number is prime in a recursive function

	public boolean isPrime(int start, int count, boolean prime) {
		if (count >= start) {
			return prime;
		}

		if (start % count == 0) {
			prime = false;
		}

		return isPrime(start, ++count, prime);
	}

}
