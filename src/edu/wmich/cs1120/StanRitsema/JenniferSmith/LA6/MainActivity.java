package edu.wmich.cs1120.StanRitsema.JenniferSmith.LA6;

public class MainActivity {
	
	// YOU NEED TO REPLACE ALL ‘T’s WITH THE APPROPRIATE CLASS NAME FOR THE TYPE 
		// PARAMETER. WHAT IS THE TYPE OF ELEMENTS READ FROM THE INPUT FILE?

	public static void main(String[] args) {
		
		ArrayList<T> store = new ArrayList<>();
		Read read = new Read(store);

		QStack<T> stack = new QStack<>();
		SQueue<T> queue = new SQueue<>();
		MinValueStack<T> mVStack = new MinValueStack<>();

		read.readFileInputStream("TestData.dat");

		System.out.println("The values pushed onto the stack are:");
		// INCLUDE CODE TO STORE ALL ELEMENTS FROM THE ARRAYLIST IN BOTH “stack” AND 
		// “mVStack”

		System.out.println("\n\nThe values popped off the stack in order are:");
		// INCLUDE CODE TO REMOVE AND DISPLAY ALL ELEMENTS STORED IN “stack”.
		
		System.out.println("\n\nThe min value (from the minimum value stack) is:"+mVStack.minValue());
		
		System.out.println("\nThe values popped off the minimum value stack in order are:");
		// INCLUDE CODE TO REMOVE AND DISPLAY ALL ELEMENTS STORED IN “mVStack”.

		System.out.println("\n\nThe values enqueued onto the queue are:");
		// INCLUDE CODE TO DISPLAY AND STORE ALL ELEMENTS FROM THE ARRAYLIST IN “queue”.
		System.out.println("\n\nThe values dequeued from the queue in order are:");
		// INCLUDE CODE TO REMOVE AND DISPLAY ALL ELEMENTS STORED IN “queue”.

	}

}
