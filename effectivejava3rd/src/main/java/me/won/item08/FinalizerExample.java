package me.won.item08;

public class FinalizerExample {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("clean up");
	}

	public void hello() {
		System.out.println("hi");
	}
}
