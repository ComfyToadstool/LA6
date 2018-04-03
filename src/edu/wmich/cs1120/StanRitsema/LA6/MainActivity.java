package edu.wmich.cs1120.StanRitsema.LA6;

import java.util.ArrayList;

/**
 * Controller class for this project.
 * 
 * @author Stan
 *
 */
public class MainActivity {
	
	// YOU NEED TO REPLACE ALL ‘T’s WITH THE APPROPRIATE CLASS NAME FOR THE TYPE 
	// PARAMETER. WHAT IS THE TYPE OF ELEMENTS READ FROM THE INPUT FILE?

	/**
	 * Main stage for the project.  Creates two stacks and a queue from the other 
	 * classes.  Uses read to get data from a .dat file, puts in all three objects, 
	 * and takes it out of all of them again.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Short> store = new ArrayList<>();
		Read read = new Read(store);

		QStack<Short> stack = new QStack<>();
		SQueue<Short> queue = new SQueue<>();
		MinValueStack<Short> mVStack = new MinValueStack<>();

		read.readFileInputStream("TestData.dat");

		System.out.println("The values pushed onto the stack are:");
		// INCLUDE CODE TO STORE ALL ELEMENTS FROM THE ARRAYLIST IN BOTH “stack” AND 
		// “mVStack”
		
		// initialize a counter
		int i = 0;
		
		try {
			while(true) {
				
				// add element at position i to both stacks
				System.out.print(stack.push(read.getShort(i)) + " ");
				mVStack.push(read.getShort(i));
				
				// increment i
				i++;
			}
		}catch(IndexOutOfBoundsException e) {
			
		}
		
		// reset the counter for use with the queue
		i = 0;

		System.out.println("\n\nThe values popped off the stack in order are:");
		// INCLUDE CODE TO REMOVE AND DISPLAY ALL ELEMENTS STORED IN “stack”.
		
		while( stack.getSize() > 0 ) {
			System.out.print(stack.pop() + " ");
		}
		
		System.out.println("\n\nThe min value (from the minimum value stack) is:"+mVStack.minValue());
		
		System.out.println("\nThe values popped off the minimum value stack in order are:");
		// INCLUDE CODE TO REMOVE AND DISPLAY ALL ELEMENTS STORED IN “mVStack”.
		
		while( mVStack.getSize() > 0 ) {
			System.out.print(mVStack.pop() + " ");
		}

		System.out.println("\n\nThe values enqueued onto the queue are:");
		// INCLUDE CODE TO DISPLAY AND STORE ALL ELEMENTS FROM THE ARRAYLIST IN “queue”.
		
		try {
			while(true) {
				
				// add element at position i to queue
				System.out.print(queue.enqueue(read.getShort(i)) + " ");
				
				// increment i
				i++;
			}
		}catch(IndexOutOfBoundsException e) {
			
		}
		
		System.out.println("\n\nThe values dequeued from the queue in order are:");
		// INCLUDE CODE TO REMOVE AND DISPLAY ALL ELEMENTS STORED IN “queue”.
		
		while( queue.getSize() > 0 ) {
			System.out.print(queue.dequeue() + " ");
		}
		System.out.println();

	}

}
