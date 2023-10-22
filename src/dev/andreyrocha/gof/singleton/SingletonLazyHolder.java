package dev.andreyrocha.gof.singleton;

public class SingletonLazyHolder {
	
	private SingletonLazyHolder() {
		super();
	}
	
	private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
