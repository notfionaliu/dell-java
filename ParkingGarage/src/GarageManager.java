
public class GarageManager {
	public static void main(String[] args) {
		
		// instantiate a few parkingGarage with different capacities
		ParkingGarage purpleLot = new ParkingGarage(15);
		ParkingGarage blueLot = new ParkingGarage(3);
		ParkingGarage yellowLot = new ParkingGarage(4);
		
		Car lilCar = new Car("white","HAB2l34","Toyota","Camry");
		Car bigCar = new Car("purple","ABC294","Honda","Civic");
		Car medCar = new Car("black","ADS294","Jeep","BDE");
		Car richCar = new Car("silver","SFROX","Tesla","Elon");
		Car plebCar = new Car("green","2POOR4U","Paris","Hilton");
		
		System.out.println("parking lots of cars vroom vroom");

		purpleLot.park(lilCar, 3);
		blueLot.park(lilCar, 5);
		yellowLot.park(medCar, 6);
		blueLot.park(plebCar, 3);
		purpleLot.park(richCar, 4);
		blueLot.park(bigCar, 1);
		
		System.out.println("Done parking!");
		System.out.println("");
		System.out.println("printing inventory for purple parking lot! ");

		purpleLot.printInventory();
		
		System.out.println(" ");
		System.out.println("Removing some cars from the spots");
		
		purpleLot.vacate(3);
		purpleLot.vacate(4);
		blueLot.vacate(5);

		blueLot.vacate(3);
		yellowLot.vacate(6);
	}
}
