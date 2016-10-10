package boxes;

public class DemoSuper {
	public static void main(String args[]) { 

		BoxWeight myboxl = new BoxWeight(10, 20, 15, 34.3); 
		BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076); 
		BoxWeight mybox3 = new BoxWeight (); // по умолчанию 
		BoxWeight mycube = new BoxWeight(3, 2); 
		BoxWeight myclone = new BoxWeight(myboxl); 
		
		double vol; 
		vol = myboxl.volume (); 
		System.out.println("Oбъeм myboxl равен "+ vol); 
		System.out.println("Bec myboxl равен " + myboxl.getWeight()); 
		System.out.println(); 
		
		vol = mybox2 .volume (); 
		System.out.println("Oбъeм mybox2 равен "+ vol); 
		System.out.println( "Bec mybox2 равен " + mybox2.getWeight()); 
		System.out.println(); 
		
		vol = mybox3.volume (); 
		System.out.println("Oбъeм mybox3 равен "+ vol); 
		System.out.println( "Bec mybox3 равен " + mybox3.getWeight()); 
		System.out.println();
		
		vol = myclone.volume (); 
		System.out.println("Oбъeм myclone равен " + vol); 
		System.out.println("Bec myclone равен "+ myclone.getWeight()); 
		System.out .println(); 
		vol = mycube .volume (); 
		System.out.println("Oбъeм mycube равен "+ vol); 
		System.out.println("Bec mycube равен " + mycube.getWeight()); 
}}
