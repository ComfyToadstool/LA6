package edu.wmich.cs1120.StanRitsema.JenniferSmith.LA6;

public class Read {

	// YOU NEED TO REPLACE ALL ‘T’s WITH THE APPROPRIATE CLASS NAME FOR THE TYPE 
	// PARAMETER. WHAT IS THE TYPE OF ELEMENTS READ FROM THE INPUT FILE?
		
	private ArrayList <T> store; 
		
	public Read(ArrayList<T> store) {
		// TODO Auto-generated constructor stub
		this.store = store;
	}
	/**
	 * read the data and save them into an ArrayList.
	 * @param filename
	*/
	public void readFileInputStream(String filename) {
		try (InputStream inputStream = new FileInputStream(filename);) {
			DataInputStream is = new DataInputStream(new BufferedInputStream(inputStream));’

	// INCLUDE CODE TO ADD THE ELEMENTS READ FROM THE INPUT FILE TO THE ARRAYLIST 
	// “store”.

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	} 
	
}
