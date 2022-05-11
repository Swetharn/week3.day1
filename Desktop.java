package org.system;

/*Single Inheritance*/

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("The Desktop size is '27' inch");
	}

	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		desktop.desktopSize();
		desktop.computerModel();
	}
}
