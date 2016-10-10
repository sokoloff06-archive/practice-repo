package boxes;

public class Shipment extends BoxWeight {
	double cost; 
	// сконструировать клон объекта 
	Shipment (Shipment ob) { 
	// передать объект конструктору 
		super (ob) ; 
		cost = ob.cost; 
		}
		
		// конструктор, используемый при указании всех параметров 
	public Shipment (double w, double h, double d, double m, double с) { 
		super(w, h, d, m) ; // вызвать конструктор суперкласса 
		cost = с; 
	}
		
		// конструктор, применяемый по умолчанию 
	public Shipment () { 
		super (); 
		cost = -1; 
	}
	
		
	// конструктор, применяемый при создании куба 
	public Shipment(double len, double m, double с) { 
		super (len, m) ; 
		cost = с; 
	}

}
