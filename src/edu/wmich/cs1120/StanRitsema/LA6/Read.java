package edu.wmich.cs1120.StanRitsema.LA6;

import java.io.*;
import java.util.ArrayList;

public class Read {

	// YOU NEED TO REPLACE ALL ‘T’s WITH THE APPROPRIATE CLASS NAME FOR THE TYPE 
	// PARAMETER. WHAT IS THE TYPE OF ELEMENTS READ FROM THE INPUT FILE?
		
	private ArrayList<Short> store; 
	int shortLength = 2;
	private static boolean DEBUG = false;
		
	public Read(ArrayList<Short> store) {
		// TODO Auto-generated constructor stub
		this.store = store;
	}
	/**
	 * read the data and save them into an ArrayList.
	 * @param filename
	*/
	public void readFileInputStream(String filename) {
		
		try (InputStream inputStream = new FileInputStream(filename);) {
			DataInputStream is = new DataInputStream(new BufferedInputStream(inputStream));

	// INCLUDE CODE TO ADD THE ELEMENTS READ FROM THE INPUT FILE TO THE ARRAYLIST 
	// “store”.
			
			while( is.available() > 0 ) {
				
				short temp = is.readShort();
				
				if( DEBUG ) {
					System.out.println("Added short : " + temp);
				}
				
				store.add(temp);
				
			}
			
			is.close();

		} catch (IOException ex) {
			System.out.println("Error within readFileInputStream method");
			ex.printStackTrace();
		}
		
		
	}
	
	/**
	 * Helper method to get element of store array at location index.
	 * 
	 * @param index
	 * @return short at index of store array
	 */
	public short getShort( int index ) {
		
		if( index > store.size() ) {
			throw new ArrayIndexOutOfBoundsException();
		}else {
			return store.get(index);
		}
		
	}
	
}
