package it.unical.PrimeGenerator;

import java.util.ArrayList;
import java.util.List;

public class Primi {
	public static boolean isPrimo(int n) {
		for(int i = 2; i < n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	public static List<Integer> GeneratorePrimi(int n) {
		List<Integer> numeriPrimi = new ArrayList<Integer>();
		if(n >=  2) {
			numeriPrimi.add(2);
		}
		for (int i = 3; i <= n; i +=2) {
			if(isPrimo(i))
				numeriPrimi.add(i);
		}
		return numeriPrimi;
	}
}
