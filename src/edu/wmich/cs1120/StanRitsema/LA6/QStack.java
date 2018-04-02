package edu.wmich.cs1120.StanRitsema.LA6;

import java.util.LinkedList;
import java.util.Queue;

/**
 * A version of a stack implemented with two queues
 * 
 * @param <T>  Type parameter for Generic class QStack.
 */
public class QStack<T> {
	
	private Queue<T> queue1;
	private Queue<T> queue2;
	private int size;

	/**
	 * No-arg constructor to initialize members
	 */
	public QStack() {
		queue1 = new LinkedList<T>();
		queue2 = new LinkedList<T>();
		size = 0;
	}

	/**
	 * Add data to the stack.
	 * 
	 * @param data   The data to add to the stack.
	 * @return The data added to the stack (for simpler print statements)
	 */
	public T push(T data) {
	// INCLUDE CODE TO PERFORM REQUIRED ACTION(S).
		
		// insert new element at end of first queue
		queue1.add(data);
		
		// increment size
		size++;
		
		// return the added element
		return data;
		
	}

	/**
	 * Pop data off the top of the stack
	 * 
	 * @return The popped data
	 */
	public T pop() {
	// INCLUDE CODE TO PERFORM REQUIRED ACTION(S).
		
		// move all but last element of queue1 to queue2
		while( queue1.size() > 1 ) {
			T ele = queue1.poll();
			queue2.add(ele);
		}
		
		// Get the last element of queue1
		T target = queue1.poll();
		
		// Reset the arrays
		queue1 = queue2;
		Queue<T> temp = new LinkedList<T>();
		queue2 = temp;
		
		// decrement size
		size--;
		
		// return the popped element
		return target;
		
	}

    /**
     * Return the size of the stack (number of elements stored in it)
     * @return  The size of the stack
     */
    public int getSize() {
    	return size;
    }


}
