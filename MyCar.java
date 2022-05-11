package week3.day1;

public class MyCar extends Bmw {
	public static void main(String[] args) {

		Bmw bmw = new MyCar();
		
		bmw.autoPark();
		bmw.applyBrake();
		bmw.handBrake();
		bmw.soundHorn();
		bmw.turnAc();
		bmw.applyBrake();

		Vehicle vehicle = new Bmw();

		vehicle.applyBrake();
		vehicle.soundHorn();

		Car car = new Car();

		car.applyBrake();
		car.handBrake();
		car.soundHorn();
		car.turnAc();

	}

	public void applyBrake() {
		System.out.println("Brake applied in my car");
	}
}
