/**
 * A public class implement the implement from SingleObject class
 * @author David Nguyen
 * @version 21/11/2022
 * 
 * 
 */

public class SingletonPatternDemo {
	/** main method
	 *@param args command the line
	 */
	public static void main (String[] args){
		//illegal construct
		//Compile Time Error: The constructor SingleObject () is not visible
		// SingleObject object = new SingleObject();

		// Get the only object available
		SingleObject object = SingleObject.getInstance();
		//show the message
		object.showMessage();

	}
}