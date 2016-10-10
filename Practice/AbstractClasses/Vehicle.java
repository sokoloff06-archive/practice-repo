package AbstractClasses;

public abstract class Vehicle {
	private String name;
	private int weight;
	private String brand;
	private  int SerialNumber;
	private boolean isMoving;
	private String location;
	
	public String getName(){
		return this.name;
	}
	public boolean getState(){
		return this.isMoving;
	}
	public abstract String getLocation();
	public abstract void start();
	public abstract void stop();
}
