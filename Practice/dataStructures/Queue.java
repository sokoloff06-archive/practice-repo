package dataStructures;
// demonstrates queue 
public class Queue {
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;

	// -------------------------------------------------------------
	public Queue(int s) // constructor
	{
		maxSize = s;
		queArray = new long[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	// -------------------------------------------------------------
	public void insert(long j) throws Exception // put item at rear of queue
	{
		if (nItems == maxSize){
			throw new Exception("Overflow");
		}
		if (rear == maxSize - 1) // deal with wrap around
			rear = -1;
		queArray[++rear] = j; // increment rear and insert
		nItems++; // one more item
	}

	// -------------------------------------------------------------
	public long remove() // take item from front of queue
	{
		long temp = queArray[front++]; // get value and increment front
		if (front == maxSize) // deal with wrap around
			front = 0;
		nItems--; // one less item
		return temp;
	}

	// -------------------------------------------------------------
	public long peekFront() // peek at front of queue
	{
		return queArray[front];
	}

	// -------------------------------------------------------------
	public boolean isEmpty() // true if queue is empty
	{
		return (nItems == 0);
	}

	// -------------------------------------------------------------
	public boolean isFull() // true if queue is full
	{
		return (nItems == maxSize);
	}

	// -------------------------------------------------------------
	public int size() // number of items in queue
	{
		return nItems;
	}
	// -------------------------------------------------------------
} // end class Queue

class QueueApp {
	public static void main(String[] args) {
		System.out.println("Queue class:");
		Queue theQueue = new Queue(5); // queue holds 5 items

		try {
		theQueue.insert(10); // insert 4 items
		theQueue.insert(20);
		theQueue.insert(30);
		theQueue.insert(40);

		/*
		 * theQueue.insert(50); // insert 4 more items theQueue.insert(60); //
		 * (wraps around) theQueue.insert(70); theQueue.insert(80);
		 */

		theQueue.remove(); // remove 3 items
		theQueue.remove();
		theQueue.remove();
		theQueue.insert(50); // insert 4 more items
		theQueue.insert(60); // (wraps around)
		theQueue.insert(70);
		theQueue.insert(80);
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}

		while (!theQueue.isEmpty()) // remove and display all items
		{
			long n = theQueue.remove();
			System.out.print(n);
			System.out.print(" ");
		}
		System.out.println("");
	} // end main()
} // end class QueueApp
