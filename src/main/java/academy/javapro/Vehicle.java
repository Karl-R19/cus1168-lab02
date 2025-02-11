package academy.javapro;

public abstract class Vehicle {
	protected String make;
	protected String model;
	protected int year;
	protected boolean isRunning;

	public Vehicle(String make, String model, int year) {

		this.make = make;
		this.model = model;
		this.year = year;
		this.isRunning = false;
	}

	// Abstract methods to implement:
	public abstract void startEngine();

	public abstract void stopEngine();

	public abstract void accelerate();

	public abstract void brake();
	

		// Gathers the make of the vehicle
		public String getMake() {
		return make;
		}

		// Sets the make of the vehicle
		public void setMake(String make) {
		this.make = make;
		}

		// Gathers the model of the vehicle
		public String getModel() {
		return model;
		}

		// Sets the model of the vehicle
		public void setModel(String model) {
		this.model = model;
		}

		// Gathers the year of the vehicle
		public int getYear() {
		return year;
		}

		// Sets the year of the vehicle
		public void setYear(int year) {
		this.year = year;
		}

		// Check if the vehicle is running or not
		public boolean isRunning() {
		return isRunning;
		}
		
		// Sets the running state of the vehicle
		public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
		}

}
