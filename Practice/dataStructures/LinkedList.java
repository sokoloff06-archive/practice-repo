package dataStructures;
public class LinkedList {
	private Link first; // ref to first link on list

	public LinkedList() // constructor
	{
		first = null; // no items on list yet
	}

	public boolean isEmpty() // true if list is empty
	{
		return (first == null);
	}

	public void insertFirst(int id, double dd) {
		Link newLink = new Link(id, dd); // make new link
		newLink.next = first; // newLink --> old first
		first = newLink; // first --> newLink
	}

	public Link deleteFirst() // delete first item (assumes list not empty)
	{
		Link temp = first; // save reference to link
		first = first.next; // delete it: first-->old next
		return temp; // return deleted link

	}

	public Link delete(int key) // delete link with given key (assumes non-empty
								// list)
	{
		Link current = first; // search for link
		Link previous = first;
		while (current.iData != key) {
			if (current.next == null)
				return null; // didn�t find it
			else {
				previous = current; // go to next link
				current = current.next;
			}
		}
		if (current == first) // if first link,
			first = first.next; // change first
		else // otherwise,
			previous.next = current.next; // bypass it
		return current;
	}

	//
	public Link find(int key) // find link with given key (assumes non-empty
								// list)
	{
		Link current = first; // start at �first�
		while (current.iData != key) // while no match,
		{
			if (current.next == null) // if end of list,
				return null; // didn�t find it
			else // not end of list,
				current = current.next; // go to next link
		}
		return current; // found it
	}

	public void displayList() {
		System.out.print("List (first-->last): ");
		Link current = first; // start at beginning of list
		while (current != null) // until end of list,
		{
			current.displayLink(); // print data
			current = current.next; // move to next link
		}
		System.out.println("");
	}
}

class LinkListApp {
	public static void main(String[] args) {
		LinkedList theList = new LinkedList(); // make new list

		theList.insertFirst(22, 2.99); // insert four items
		theList.insertFirst(44, 4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(88, 8.99);
		theList.displayList(); // display list
		while (!theList.isEmpty()) // until it�s empty,
		{
			Link aLink = theList.deleteFirst(); // delete link
			System.out.print("Deleted "); // display it
			aLink.displayLink();
			System.out.println("");
		}

		theList.displayList(); // display list
	} // end main()
} // end class LinkListApp
