package ua.lviv.lgs;

public class PlainControl {
	void moveUp() {
		int distance = (int)( Math.random()*10);
		System.out.println("Літак рехається вверх на "+distance+" км");
	}

	void moveDown() {
		int distance = (int)( Math.random()*10);
		System.out.println("Літак рехається вниз на "+distance+" км");
	}
	
	void moveForward() {
		int distance = (int)( Math.random()*10);
		System.out.println("Літак рехається вперід на "+distance+" км");
	}

	void moveBackward() {
		int distance = (int)( Math.random()*10);
		System.out.println("Літак рехається назад на "+distance+" км");
	}

}
