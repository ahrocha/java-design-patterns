package dev.andreyrocha.gof.singleton;

public class SingletonTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder.getInstancia();
		System.out.println(lazyHolder);
	}

}
