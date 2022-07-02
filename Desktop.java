package org.system;

public class Desktop extends Computer {

	public static void main(String[] args) {

		Desktop ob = new Desktop();
		ob.desktopSize();

		ob.computerModel();
	}

	public void desktopSize() {
		System.out.println("Desktop size is 24 inch");
	}

}
