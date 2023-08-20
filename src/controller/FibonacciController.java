package controller;

public class FibonacciController {

	public FibonacciController() {
		super();
	}
	public int fibo(int a) { 
		if (a < 2) { 
			return a; 
//enquanto o termo "a" for menor que 2, o próprio termo será retornado
			} else { 
				return fibo(a - 1) + fibo(a - 2); 
//será somado o termo anterior pelo seu antecessor e ele será exibido na classe principal
				} 
		} 
	}