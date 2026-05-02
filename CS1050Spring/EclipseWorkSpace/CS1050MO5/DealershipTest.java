/**
 * 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * 
 */
public class DealershipTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		Dealership toms = new Dealership("Toms", 3);
		
		Car car = new Car("Ford", "F150", 25000.5);
		toms.addCar(car);
		System.out.print("HI");
	}
	
class Dealership{
	private String name;
	private int currentNumberOfCars;
	private Car[] car;
	
	public Dealership(String name, int maxNumCars){
		this.name = name;
		currentNumberOfCars = 0;
		car = new Car[maxNumCars];
	}
	public void addCar(Car newCar){
		if (currentNumberOfCars<car.length) { 
			car[currentNumberOfCars] = newCar;
			currentNumberOfCars++;}
		else {
			System.out.println("Error no open lot");
		}
	}
	public int findmostExpensiveCar(Car[] carArray) {
	 {
	        int maxIndex = 0;
	        double maxValue = carArray[0].getPrice();
	        // can be used on any numbered array in case we wanted to use it on MHR or BMI
	        for (int i = 1; i < carArray.length; i++) {
	            
	        	if (carArray[i].getPrice() > maxValue) {
	                maxValue = carArray[i].getPrice();
	                maxIndex = i;
	            }
	        }
	        return maxIndex;
	    }	
	}
	void displayCars(Car[] carArray) {
		for (int i = 0; i < currentNumberOfCars; i++ ) {
			carArray[i].display();
		}
	}
		
	
	void displayCarDetails(Car[] carArray) {
		for (int i = 0; i < currentNumberOfCars; i++) {
			
		}
	}
}

class Car {
	private String make;
	private String model;
	private Double price;
	public Car(String make, String model, Double price){
		this.make = make;
		this.model = model;
		this.price = price;
	}
	public String getMake() {
		return make;
		
	}
	public String getModel() {
		return make;
		
	}
	public double getPrice() {
		return price;
		
	}
	
	public void display() {
		System.out.println("Car:" + make + " " + model + " " + price);
		
	}
	}
}

