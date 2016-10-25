package dataStructures;

public class Link {
	public int iData; // data
	public double dData; // data
	public Link next; // reference to next link

	// ------------------------------------------------------------
	public Link(int id, double dd) // constructor
	{
		iData = id; // initialize data
		dData = dd; // (�next� is automatically set to null)
	}

	// ------------------------------------------------------------
	public void displayLink() // display ourself
	{
		System.out.print("{" + iData + ", " + dData + "} ");
	}
} // end class Link
