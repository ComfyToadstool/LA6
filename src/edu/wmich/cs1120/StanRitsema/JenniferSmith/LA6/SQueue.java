package edu.wmich.cs1120.StanRitsema.JenniferSmith.LA6;

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
    }

    /**
     * Remove the next item from the front of the queue.
     * @return The data in the front of the queue
     */
    public T dequeue(){
    	// INCLUDE CODE TO PERFORM REQUIRED ACTION(S).
    }

    /**
     * Return the size of the queue (number of elements stored in it)
     * @return  The size of the queue
     */
    public int getSize() {
    	return size;
    }

}
