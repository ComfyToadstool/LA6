package edu.wmich.cs1120.StanRitsema.LA6;

import java.util.Stack;

/**
 * A minimum value stack stores elements in order of size: the smallest 
 * element is stored at the top of the stack (and so will be the first to be 
 * popped off the stack) while the largest element will be the last to be 
 * popped off the stack.
 */ 
public class MinValueStack<T extends Comparable<T>> {

	private Stack<T> stack1;
    private Stack<T> stack2;
    private int size;

    /**
     * A no-arg constructor to initialize class members.
     */
    public MinValueStack(){
        stack1 = new Stack<T>();
        stack2 = new Stack<T>();
        size = 0;
    }

    /**
     * Method to push data onto the stack. This method specifically
     * keeps the stack in ascending order: the smallest (minimum value) is stored
     * at the top of the stack so it is the next element to be popped off the stack. 
     * 
     * @param data The data (element) to be added to the stack.
     * @return The data added to the stack
     */
    public T push(T data){
	// INCLUDE CODE TO PERFORM REQUIRED ACTION(S).
    	
    	// push elements from stack1 onto stack2
    	// until data is greater than the next element of stack 2
    	while( data.compareTo(stack1.peek()) < 0 ) {
    		stack2.push(stack1.pop());
    	}
    	stack2.push(data);
    	
    	// push the rest of stack1 onto stack2
    	while( !stack1.isEmpty() ) {
    		stack2.push(stack1.pop());
    	}
    	
    	// increment size
    	size++;
    	
    	// push all of stack2 back onto stack2
    	while( !stack2.isEmpty() ) {
    		stack1.push(stack2.pop());
    	}
    	
    	// return the added element
    	return data;
    }

    /**
     * Method to return the minimum value on the stack, but not remove it.
     * @return The minimum value stored in the stack.
     */
    public T minValue(){
	// INCLUDE CODE TO PERFORM REQUIRED ACTION(S).
    	
    	return stack1.peek();
    }

    /**
     * Method to pop the minimum value off the stack
     * @return The popped data.
     */
    public T pop(){ 
	// INCLUDE CODE TO PERFORM REQUIRED ACTION(S).
    	
    	// decrement size
    	size--;
    	
    	// pop desired element
    	return stack1.pop();
    }

    /**
     * Method to return if the stack is empty or not.
     * @return true if stack is empty, else false.
     */
    public boolean isEmpty(){
	// INCLUDE CODE TO PERFORM REQUIRED ACTION(S).
    	
    	return (size == 0);
    }

    /**
     * Return the size of the stack (number of elements stored in it)
     * @return  The size of the stack
     */
    public int getSize() {
    	return size;
    }

}
