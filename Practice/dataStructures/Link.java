package dataStructures;


public class Link 
{
	public int iData;     // data 
	public double dData;  // data 
	public long lData;  // data 
	public Link next;     // reference to next link 
	
	// ------------------------------------------------------------
	public Link(int id, double dd) // constructor 
	{ 
		iData = id;                 // initialize data 
		dData = dd;                 // (�next� is automatically set to null) 
	}   
	
	// ------------------------------------------------------------
	public Link(long ll) // constructor 
	{ 
		lData = ll;                 // initialize data			 
	}   
	
	// ------------------------------------------------------------
	public void displayLink(boolean two)      // display ourself 
	{ 
		System.out.print("{" + iData + ", " + dData + "} "); 
	} 
	
	public void displayLink()      // display ourself 
	{ 
		System.out.print(" " + lData + " "); 
	} 
}  // end class Link

