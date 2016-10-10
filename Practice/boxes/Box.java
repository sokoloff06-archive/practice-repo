package boxes;

public class Box extends AbstractShape{
	private double width; 
	private double height; 
	private double depth; 
	
	// сконструировать клон объекта 
	public Box(Box ob) { 
		// передать объект конструктору 
		width = ob.width; 
		height = ob.height; 
		depth = ob.depth; 
	}
	// конструктор, применяемый при указании всех размеров 
	public Box (double w, double h, double d) { 
		width = w; 
		height = h; 
		depth = d; 
	}
	// конструктор, применяемый в отсутствие размеров 
	public Box() { 
		width = -1; 
		height = -1; 
		depth = -1; // значение -1 служит для обозначения неинициализированного параллелепипеда 
	}
	// конструктор, применяемый при создании куба 
	public Box (double len) { 
		width = height = depth = len; 
	}
	// рассчитать и возвратить объем 
	double volume () { 
		return  width * height * depth; 
	}
}