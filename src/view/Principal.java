package view;

import controller.FibonacciController;

public class Principal {

	public static void main(String[] args) {
		FibonacciController pc = new FibonacciController();
		int a = 0;
		for (a = 0; a < 20; a++) { 
			System.out.println(pc.fibo(a)); 
			} 
		} 
}
