package edu.wmich.cs1120.StanRitsema.LA6;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * A version of a queue implemented with two stacks
 * @param <T> Type parameter for Generic class SQueue
 */
public class SQueue<T> {
	
	private Stack<T> stack1;
    private Stack<T> stack2;
    private int size;

    /**
     * No-arg constructor to initialize members
     */
    public SQueue(){
        stack1 = new Stack<T>();
        stack2 = new Stack<T>();
        size = 0;
    }

    /**
     * Add data to the queue.
     * @param data The data to add to the queue.
     * @return The data added to the queue (for simpler print statements)
     */
    public T enqueue(T data){
       // INCLUDE CODE TO PERFORM REQUIRED ACTION(S).
    	
    	// add element to stack1
    	stack1.push(data);
    	
    	// increment size
    	size++;
    	
    	// return added element
    	return stack1.peek();
    	
    }

    /**
     * Remove the next item from the front of the queue.
     * @return The data in the front of the queue
     */
    public T dequeue(){
    	// INCLUDE CODE TO PERFORM REQUIRED ACTION(S).
    	
    	if( getSize() == 0 ) {
    		throw new EmptyStackException();
    	}
    	
    	// if stack2 is empty, move everything from stack1 to it
    	if( stack2.isEmpty() ) {
    		while( !stack1.isEmpty() ) {
    			stack2.push(stack1.pop());
    		}
    	}
    	
    	// decrement size
    	size--;
    	
    	// pop element from stack2
    	return stack2.pop();
    	
    }

    /**
     * Return the size of the queue (number of elements stored in it)
     * @return  The size of the queue
     */
    public int getSize() {
    	return size;
    }

}
