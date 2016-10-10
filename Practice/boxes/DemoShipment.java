package boxes;

public class DemoShipment {
	
	public static void main (String args[]) { 
		Shipment shipmentl = new Shipment (10, 20, 15, 10, 3.41); 
		Shipment shipment2 = new Shipment (2, 3 , 4 , 0.76, 1.28); 
	
	double vol; 
	vol = shipmentl.volume (); 
	System.out. println("Oбъeм shipmentl равен " + vol); 
	System.out.println("Bec shipmentl равен " + shipmentl.getWeight()); 
	System.out. println( "Cтoимocть доставки : $" + shipmentl.cost); 
	System.out. println(); 
	vol = shipment2. volume (); 
	System.out. println( "Oбъeм shipment2 равен " + vol); 
	System.out. println("Bec shipment2 равен " + shipment2.getWeight()); 
	System.out . println( "Cтoимocть доставки : $" + shipment2.cost); 
}
}
