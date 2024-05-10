/**
 * A public class implement the single object of the class
 * @author David Nguyen
 * @version 21/11/2022
 * 
 */

public class SingleObject{
	/**create an object of SingleObject
	 */
	private static SingleObject instance = new SingleObject();

	/**make the constructor private so this class cannot be instantiated
	 */
	private SingleObject(){
		
	}

	/**Get the only object available
	 * @return the only object available
	 */

	public static SingleObject getInstance(){
		return instance;
	}

	/** Printing out the messeage
	 */
	public void showMessage(){
		System.out.println("Hello World!");
	}
}