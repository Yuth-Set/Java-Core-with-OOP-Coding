package inheritances;

class Car extends Vehicle {

	int CC;
	int gears;
	void attributescar() {
		System.out.println("Color : " + color);
		System.out.println("Speed : " + speed);
		System.out.println("Size : " + size);
		System.out.println("CC of Car : " + CC);
		System.out.println("No of gears of Car : " + gears);
	}
}
