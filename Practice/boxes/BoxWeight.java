/**
 * 
 */
package boxes;

/**
 * @author milen_000
 *
 */
public class BoxWeight extends Box {

	private double weight; // вес параллелепипеда
	// сконструировать клон объекта

	public BoxWeight(BoxWeight ob) {
		// передать объект конструктору
		super(ob);
		weight = ob.weight;
	}

	// конструктор, применяемый при указании всех параметров
	public BoxWeight(double w, double h, double d, double rn) {
		super(w, h, d); // вызвать конструктор из суперкласса
		weight = rn;
	}

	// конструктор, применяемый по умолчанию
	public BoxWeight() {
		super();
		weight = -1;
	}

	// конструктор, применяемый при создании куба
	public BoxWeight(double len, double m) {
		super(len);
		weight = m;
	}

	public double getWeight() {
		return this.weight;
	}
}
